import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class navigateToEBay extends elementLocators {

    @Test
    @Parameters({"siteURL"})
    public void checkUserNavigateToEbay(String siteURL) {
        webDriver.driver.get(siteURL);
        Assert.assertTrue(webDriver.driver.findElement(By.xpath(ebayHomePage)).isDisplayed(),"User unable navigate to the ebay");
    }
}
