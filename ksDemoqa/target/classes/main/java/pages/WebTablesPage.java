package pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class WebTablesPage extends MainPage{

    public WebTablesPage(WebDriver webDriver) {
        super(webDriver);
    }

    @FindBy(xpath = ".//button[text()='Add']")
    private WebElement btnAdd;
    @FindBy(xpath = ".//button[text()='Submit']")
    private WebElement btnSubmit;
    @FindBy(xpath = ".//div[text()='Registration Form']")
    private WebElement registrationFormName;
    @FindBy(xpath = ".//ul/li/span[text()='Web Tables']/parent::li")
    private WebElement menuItemInDropdownWebTables;
    @FindBy(xpath = ".//input[@placeholder='First Name']")
    private WebElement inputFirstName;
    @FindBy(xpath = ".//input[@placeholder='Last Name']")
    private WebElement inputLastName;
    @FindBy(xpath = ".//input[@placeholder='name@example.com']")
    private WebElement inputEmail;
    @FindBy(xpath = ".//input[@placeholder='Age']")
    private WebElement inputAge;
    @FindBy(xpath = ".//input[@placeholder='Salary']")
    private WebElement inputSalary;
    @FindBy(xpath = ".//input[@placeholder='Department']")
    private WebElement inputDepartment;
    @FindBy(xpath = ".//input[@id='searchBox']")
    private WebElement inputSearchBox;
    @FindBy(xpath = ".//div[@class='main-header' and text()='Web Tables']")
    private  WebElement namePage;

    private String tableFieldLocator = ".//*[text()='%s']";

    @Override
    String getUrl() {
        return "/webtables";
    }

    public WebTablesPage checkUrWebTableIsDisplayed(){
        checkUrl();
        return this;
    }
    public WebTablesPage checkTableNewStringWasAdded(String title) {
        List<WebElement> postsList = webDriver.findElements(By.xpath(String.format(tableFieldLocator, title)));
        Assert.assertEquals("Number of post with title" + title, 1, postsList.size());
        return this;
    }
    public WebTablesPage clickBtnAdd(){
        clickOnElement(btnAdd);
        return this;
    }
    public WebTablesPage enterTextIntoFirstNameInput(String text){
        enterTextIntoElement(inputFirstName, text);
        return this;
    }
    public WebTablesPage enterTextIntoLastNameInput(String text){
        enterTextIntoElement(inputLastName, text);
        return this;
    }
    public WebTablesPage enterTextIntoEmailInput(String text){
        enterTextIntoElement(inputEmail, text);
        return this;
    }
    public WebTablesPage enterTextIntoAgeInput(String text){
        enterTextIntoElement(inputAge, text);
        return this;
    }
    public WebTablesPage enterTextIntoSalaryInput(String text){
        enterTextIntoElement(inputSalary, text);
        return this;
    }
    public WebTablesPage enterTextIntoDepartmentInput(String text){
        enterTextIntoElement(inputDepartment, text);
        return this;
    }
    public WebTablesPage enterTextIntosearchBoxInput(String text){
        enterTextIntoElement(inputSearchBox, text);
        return this;
    }
    public WebTablesPage clickToMenuInDropdownTextBox(){
        clickOnElement(menuItemInDropdownWebTables);
        return this;
    }
    public WebTablesPage clickToBtnSubmit(){
        clickOnElement(btnSubmit);
        return this;
    }
    public WebTablesPage checkNamePopupIsDisplayed(){
        checkIsElementDisplayed("Name page is not displayed", registrationFormName);
        return this;
    }
    public WebTablesPage checkWebTablesPageNameIsDisplayed(){
        checkIsElementDisplayed("Name page is not displayed", namePage);
        return this;
    }
    public WebTablesPage checkUrWebTablesDisplayed(){
        checkUrl();
        checkWebTablesPageNameIsDisplayed();
        return this;
    }
}
