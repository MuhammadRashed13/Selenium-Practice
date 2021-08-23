package contextmenu;

import base.BaseTests;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ContextMenuTests extends BaseTests {

    @Test
    public void testContextMenu(){
        var contextmenu = homePage.clickContextMenu();
        contextmenu.contextClickOnBox();
        String text = contextmenu.getAlertText();
        contextmenu.acceptAlert();
        Assert.assertEquals(text,
                "You selected a context menu", "Alert text is incorrect");


    }
}
