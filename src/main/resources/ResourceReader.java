import java.io.InputStream;
import java.util.Properties;

public class ResourceReader {

    public static void main(String[] args) throws Exception {

        InputStream input =
                ResourceReader.class
                .getClassLoader()
                .getResourceAsStream("config.properties");

        Properties properties = new Properties();
        properties.load(input);

        System.out.println(properties.getProperty("app.name"));
        System.out.println(properties.getProperty("app.version"));
    }
}