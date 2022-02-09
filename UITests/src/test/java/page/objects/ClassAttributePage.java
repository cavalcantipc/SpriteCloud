package page.objects;

import driver.Driver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class ClassAttributePage {

    WebDriver webdriver = Driver.driver;

    @FindBy(className = "btn-primary")
    public WebElement triggerAlertButton;
    @FindBy(linkText = "Class Attribute")
    public WebElement classAttributelink;

    public ClassAttributePage() {
        PageFactory.initElements(Driver.driver, this);
    }

    public void accessPage() {
        classAttributelink.click();
    }

    public void clickPrimaryButton() {
        triggerAlertButton.click();
    }

    public void acceptAlert() {
        webdriver.switchTo().alert().accept();
    }
}
