package utill;


import java.io.FileInputStream;
import java.util.Properties;

public class ConfigReader {
    static Properties prop;

    public static Properties initProperties() {
        prop = new Properties();
        try {
            FileInputStream ip = new FileInputStream("src/main/resources/config.properties");
            prop.load(ip);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return prop;
    }
}

