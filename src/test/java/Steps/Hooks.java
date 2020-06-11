package Steps;

import io.cucumber.java.*;
import org.openqa.selenium.chrome.ChromeDriver;

public class Hooks extends Container{

    private Container container;

    public Hooks(Container container) {
        this.container = container;
    }

    @Before
    public void StartBrowser()
    {
        System.out.println("Before Scenario: Start Browser");
        container.driver = new ChromeDriver();
    }

    @After
    public void CloseBrowser()
    {
        System.out.println("After Scenario: Close Browser");
        container.driver.quit();
    }

}
