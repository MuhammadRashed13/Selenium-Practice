package wait;

import base.BaseTests;
import org.testng.Assert;
import org.testng.annotations.Test;

public class WaitTests extends BaseTests {
    @Test
    public void testWaitUntilVisible(){
        var loading = homePage.clickDynamicLoading().clickExample2();
        loading.clickStart();
        Assert.assertEquals(loading.getText(),"Hello World!", "Text is incorrect");
    }
}
