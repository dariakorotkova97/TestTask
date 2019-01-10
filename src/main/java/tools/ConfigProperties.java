package tools;
//Файл
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigProperties {

    private static final String PATH_TO_PROPERTIES = "src/main/resources/config.properties";
    private static FileInputStream fileInputStream;
    private static Properties properties;

    static {
        try {
            fileInputStream = new FileInputStream(PATH_TO_PROPERTIES);
            properties = new Properties();
            properties.load(fileInputStream);
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (fileInputStream != null)
                try {
                    fileInputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
        }
    }

    public static String getPropertyValue(String key) {
        return properties.getProperty(key);
    }
}