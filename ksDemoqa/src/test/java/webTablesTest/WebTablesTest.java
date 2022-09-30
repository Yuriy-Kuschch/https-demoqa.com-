package webTablesTest;

import baseTest.ParentTest;
import org.junit.Test;

public class WebTablesTest extends ParentTest {

    @Test
    public void validDataInWebTableTest(){
        mainPage.openMainPage()
                .clickToButtonElements();
        webTablesPage.clickToMenuInDropdownTextBox()
                .checkUrWebTablesDisplayed()
                .clickBtnAdd()
                .checkNamePopupIsDisplayed()
                .checkUrWebTableIsDisplayed()
                .enterTextIntoFirstNameInput("Test Name")
                .enterTextIntoLastNameInput("Test Last Name")
                .enterTextIntoEmailInput("test@gmail.com")
                .enterTextIntoAgeInput("12")
                .enterTextIntoSalaryInput("110")
                .enterTextIntoDepartmentInput("Test")
                .clickToBtnSubmit()
                .enterTextIntosearchBoxInput("test@gmail.com")
                .checkTableNewStringWasAdded("test@gmail.com")
        ;
    }

}
