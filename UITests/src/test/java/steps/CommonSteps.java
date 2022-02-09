package steps;

import driver.Driver;
import io.cucumber.java.After;
import io.cucumber.java.Before;

import java.io.IOException;

public class CommonSteps {
    public static Driver webdriver;

    public CommonSteps() throws IOException{
    }

    static {
        try {
            webdriver = new Driver();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Before()
    public void beforeScenario() throws InterruptedException {
        webdriver.configureDriver();
    }

    @After()
    public void AfterScenario() {
        Driver.driver.quit();
    }

}
