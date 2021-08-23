package slider;

import base.BaseTests;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SliderTests extends BaseTests {

    @Test
    public void testSlider(){
        String value = "4";
        var slider = homePage.clickHorizontalSlider();
        slider.setSliderValue(value);
        Assert.assertEquals(slider.getSliderValue(),value,"Slider Value is incorrect");
    }
}
