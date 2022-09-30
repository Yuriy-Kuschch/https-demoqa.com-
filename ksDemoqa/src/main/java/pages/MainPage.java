package pages;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MainPage extends ParentPage{

    @FindBy(xpath = ".//div[@class ='category-cards']/div/div/div/h5[contains(text(),'Elements')]/parent::div/parent::div/parent::div")
    private WebElement buttonElements;

    public MainPage(WebDriver webDriver) {
        super(webDriver);
    }

    @Override
    String getUrl() {
        return "/";
    }

    public MainPage openMainPage(){
        try {
            webDriver.get(baseUrl + "/");
            logger.info("Main page was opened");
        }catch (Exception e) {
            logger.error("Can not open Main Page" + e);
            Assert.fail("Can not open Main Page" + e);
        }
        return this;
    }
    public void clickToButtonElements(){
        clickOnElement(buttonElements);
    }
}
