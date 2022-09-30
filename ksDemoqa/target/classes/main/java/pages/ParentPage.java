package pages;

import org.apache.log4j.Logger;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static org.hamcrest.CoreMatchers.containsString;

abstract class ParentPage {

    Logger logger = Logger.getLogger(getClass());
    WebDriver webDriver;
    WebDriverWait webDriverWait10, WebDriverWait15;
    protected String baseUrl = "https://demoqa.com";

    public ParentPage(WebDriver webDriver) {
        this.webDriver = webDriver;
        PageFactory.initElements(webDriver, this);
        webDriverWait10 = new WebDriverWait(webDriver, 10);
        WebDriverWait15 = new WebDriverWait(webDriver, 15);
    }
    abstract String getUrl();


    protected void checkUrl(){
        Assert.assertThat("Invalid page"
                , webDriver.getCurrentUrl()
                , containsString(baseUrl + getUrl()));
    }
    public void printErrorAndStopTest(Exception e){
        logger.error("Can not work with element" + e);
        Assert.fail("Can not work with element" + e);
    }
    protected void enterTextIntoElement(WebElement webElement, String text) {
        try {
            WebDriverWait15.until(ExpectedConditions.visibilityOf(webElement));
            webElement.clear();
            webElement.sendKeys(text);
            logger.info(text + " was inputed ");
        } catch (Exception e) {
            printErrorAndStopTest(e);
        }
    }
    public void clickOnElement(WebElement webElement){
        try {
                webElement.click();
                logger.info("Element was clicked");
        } catch (Exception e) {
            printErrorAndStopTest(e);
        }
    }
    protected boolean isElementDisplayed(WebElement webElement) {
        try {
            boolean state = webElement.isDisplayed();
            if(state) {
                logger.info("Element is displayed");
            } else {
                logger.info("Element is not displayed");
            }
            return state;
        } catch (Exception e) {
            logger.info("Element is notdisplayed");
            return false;
        }
    }
    protected void checkIsElementDisplayed(String message, WebElement webElement){
        Assert.assertTrue(message, isElementDisplayed(webElement));
    }

}
