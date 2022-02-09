package page.objects;

import driver.Driver;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class DynamicTablePage {

    WebDriver webdriver = Driver.driver;

    @FindBy(id = "table_desc")
    public WebElement taskManager;
    @FindBy(css = "div[role = 'rowgroup']:nth-child(2)")
    public WebElement titles;
    @FindBy(css = "div[role = 'rowgroup']:nth-child(3)")
    public WebElement tablecontent;
    @FindBy(className = "bg-warning")
    public WebElement warningLabel;
    @FindBy(linkText = "Dynamic Table")
    public WebElement dynamicTablelink;

    public DynamicTablePage() {
        PageFactory.initElements(Driver.driver, this);
    }

    public void accessPage() {
        dynamicTablelink.click();
    }

    public void compareTableAndLabel() {
        String cpu = warningLabel.getText().split(":")[1].trim();
        Assert.assertEquals(getChromeCPU(),cpu);
    }

    private int findCPUColumnIndex(){
        List<WebElement> columns = titles.findElements(By.cssSelector("span[role = 'columnheader']"));
        int index = 0;
        for(int i = 1; i < columns.size(); i++){
            if(columns.get(i).getText().equals("CPU")) {
                index = ++i;
                break;
            }
        }
        return index;
    }

    private int findChromeRowIndex(){
        List<WebElement> rows = tablecontent.findElements(By.cssSelector("div[role = 'row']"));
        int index = 0;
        for(int i = 0; i < rows.size(); i++){
            WebElement row = rows.get(i).findElement(By.cssSelector("span:nth-child(1)"));
            if(row.getText().equals("Chrome")) {
                index = ++i;
                break;
            }
        }
        return index;
    }

    private String getChromeCPU(){
        int row = findChromeRowIndex();
        int column =  findCPUColumnIndex();
        String selector = "div[role = \'row\']:nth-child(" + row + ") span[role = 'cell']:nth-child(" + column + ")";
        return webdriver.findElement(By.cssSelector(selector)).getText();
    }
}
