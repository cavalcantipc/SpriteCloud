package driver;

import io.github.bonigarcia.wdm.WebDriverManager;
import lombok.Getter;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import utils.PropertiesFile;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class Driver {
    PropertiesFile props = new PropertiesFile();

    public static WebDriver driver;
    @Getter
    public String browser;

    public Driver() throws IOException {
    }

    public void configureDriver() throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.navigate().to(props.getValue("url"));
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.manage().window().maximize();
    }
}
