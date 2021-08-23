package dropdown;

import base.BaseTests;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HomePage;

public class DropdownTest extends BaseTests {
    @Test
    public void testSelectOption(){
        var dropdownPage = homePage.clickDropDown();
        String option = "Option 1";
        dropdownPage.selectFromDropdown(option);
        var selectedOptions = dropdownPage.getSelectedOption();
        Assert.assertEquals(selectedOptions.size(), 1 , "Incorrect number of selections");
        Assert.assertTrue(selectedOptions.contains(option),"Option not selected");

    }
}
