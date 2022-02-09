package page.objects;

import driver.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class ClientDelayPage {

    WebDriver webdriver = Driver.driver;

    @FindBy(className = "btn-primary")
    public WebElement triggerClientButton;
    @FindBy(linkText = "Client Side Delay")
    public WebElement clientSidelink;
    @FindBy(id = "spinner")
    public WebElement spinner;
    @FindBy(css = "#content p")
    public WebElement clientResponse;

    public ClientDelayPage() {
        PageFactory.initElements(Driver.driver, this);
    }

    public void accessPage() {
        clientSidelink.click();
    }

    public void clickClientButton() {
        triggerClientButton.click();
    }

    public void verifyResponseDisplayed() {
        waitForInvisibility(spinner, 60);
        clientResponse.isDisplayed();
    }

    public void waitForInvisibility(WebElement webElement, int maxSeconds) {
        Long startTime = System.currentTimeMillis();
        try {
            while (System.currentTimeMillis() - startTime < maxSeconds * 1000 && webElement.isDisplayed()) {}
        } catch (StaleElementReferenceException e) {
            return;
        }
    }
}
