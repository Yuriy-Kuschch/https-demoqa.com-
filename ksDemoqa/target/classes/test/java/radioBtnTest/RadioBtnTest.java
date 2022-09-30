package radioBtnTest;

import baseTest.ParentTest;
import org.junit.Test;

public class RadioBtnTest extends ParentTest {

    @Test
    public void validRadioBtnTest() {
        mainPage.openMainPage()
                .clickToButtonElements();
        radioButtonPage
                .clickToMenuInDropdownRadioBtn()
                .checkRadioButtonPageIsDisplayed()
                .clickToYesRadioBtn()
                .checkIsClickToRadioBtn ();
    }
}
