package utils;

import lombok.Getter;
import lombok.Setter;

import java.io.IOException;
import java.util.Properties;

@Getter @Setter
public class PropertiesFile {

    private Properties prop = new Properties();

    public PropertiesFile() throws IOException {

        prop.load(getClass().getClassLoader().getResourceAsStream("application.properties"));
    }

    public String getValue(String key) {
        return this.prop.getProperty(key);
    }

}
