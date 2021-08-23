package hover;

import base.BaseTests;
import org.testng.Assert;
import org.testng.annotations.Test;

public class HoverTests extends BaseTests {

    @Test
    public void testHoverUser2(){
        var hoversPage = homePage.clickHovers();
        var figureCaption= hoversPage.hoverOverPhoto(2);
       Assert.assertTrue(figureCaption.isCaptionDisplayed(), "Caption not displayed");
       Assert.assertEquals(figureCaption.getTitle(), "name: user2", "Caption title incorrect");
       Assert.assertTrue(figureCaption.getLink().contains("/users/2"),"Link is incorrect");
       Assert.assertEquals(figureCaption.getLinkText(),"View profile","Link Text is incorrect");


    }
}
