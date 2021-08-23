package keys;

import base.BaseTests;
import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.Test;

public class KeysTests extends BaseTests {

    @Test
    public void testBackSpace(){
        var keyPressesPage = homePage.clickKeyPresses();
        keyPressesPage.enterText("a" + Keys.BACK_SPACE);
        Assert.assertEquals(keyPressesPage.getResult(),"You entered: BACK_SPACE","Result text is incorrect");

    }
    @Test
    public void testPi(){
        var keyPage = homePage.clickKeyPresses();
        keyPage.enterPi();
    }
}
