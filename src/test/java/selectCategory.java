import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.testng.Assert;

public class selectCategory extends elementLocators {

    @Test
    @Parameters({"categorySelection"})
    public void checkUserCorrectlySelectedCellPhonesandAccessoriesFilter(String categorySelection) {

        new Select(webDriver.driver.findElement(By.xpath(categoriesDropDown))).selectByVisibleText(categorySelection);
        String selectedCategory = webDriver.driver.findElement(By.xpath(CategoryName)).getText();

        Assert.assertEquals(selectedCategory,categorySelection,"User unable select Cell Phones and Accessories Category");
    }
}
