package baseTest;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.log4j.Logger;
import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.*;

import java.util.concurrent.TimeUnit;

public class ParentTest {

    WebDriver webDriver;
    Logger logger = Logger.getLogger(getClass());
    protected MainPage mainPage;
    protected TextBoxPage textBoxPage;
    protected RadioButtonPage radioButtonPage;

    protected WebTablesPage webTablesPage;

    protected ButtonsPage buttonsPage;

    @Before
    public void setUp(){
        WebDriverManager.chromedriver().setup();
        webDriver = new ChromeDriver();
        webDriver.manage().window().maximize();
        webDriver.manage().timeouts().implicitlyWait(7, TimeUnit.SECONDS);
        logger.info("browser was opened ");
        mainPage = new MainPage(webDriver);
        textBoxPage = new TextBoxPage(webDriver);
        radioButtonPage = new RadioButtonPage(webDriver);
        webTablesPage = new WebTablesPage(webDriver);
        buttonsPage = new ButtonsPage(webDriver);
    }

    @After
    public void tearDown(){
        webDriver.quit();
        logger.info("browser was closed");
    }

}
