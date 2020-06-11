package Utilities;

import com.google.common.reflect.TypeToken;
import com.google.gson.Gson;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.LinkedHashMap;
import java.util.Map;

public class JsonHelper {
    public static Map<String, String> ReadJson(String path){
        try {
            String jsonString = new String ( Files.readAllBytes( Paths.get(path) ) );
            Map<String,String> map = new Gson().fromJson(jsonString, new TypeToken<LinkedHashMap<String, String>>(){}.getType());
            return map;

        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }
}
