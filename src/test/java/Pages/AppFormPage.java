package Pages;

import Utilities.JsonHelper;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import java.util.Map;
import java.util.UUID;

public class AppFormPage extends  BasePage{

    @FindBy(how = How.ID, using ="Application_FirstName")
    private WebElement firstName;

    @FindBy(how = How.ID, using = "Application_LastName")
    private WebElement lastName;

    public AppFormPage(WebDriver driver) {
        super(driver);
    }

    public AppFormPage Open() {
        driver.get("https://application.cityindex.co.uk/ci-en-uk/step/1/");
        return this;
    }

    public AppFormPage PopulateForm() {
        firstName.sendKeys("John");
        lastName.sendKeys("Smith");

        Map<String, String> map = JsonHelper.ReadJson("src\\test\\java\\TestData\\Customer.json");
        for (Map.Entry<String, String> entry : map.entrySet()) {
            String k = entry.getKey();
            String v = entry.getValue();

            String elementType  = driver.findElement(By.id(k)).getTagName();
            System.out.println("Element Type: " + elementType + " Element Name: " + k );

            if(elementType.equals("input") || elementType.equals("select")){
                if(v.equals("Username")){
                    String uuid = UUID.randomUUID().toString();
                    System.out.println(uuid);
                    v = uuid;
                }
                driver.findElement(By.id(k)).sendKeys(v);
            }

            else {
                System.out.println("Clicking button or label");
                driver.findElement(By.id(k)).click();
            }
        }
        return this;
    }
}
