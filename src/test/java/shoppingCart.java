import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

public class shoppingCart extends elementLocators {

    public static String itemCartName;
    public static String itemCartPrice;
    public static String itemCartQuantity;

    @Test
    public void itemAddToCart() throws Exception {

        new Select(webDriver.driver.findElement(By.xpath(selectedItemColor))).selectByIndex(2);
        webDriver.driver.findElement(By.xpath(selectedItemQuantity)).clear();
        webDriver.driver.findElement(By.xpath(selectedItemQuantity)).sendKeys("1");
        webDriver.driver.findElement(By.xpath(addToCartButton)).click();
    }

    @Test(dependsOnMethods = "itemAddToCart")
    public void clickCartIcon() throws Exception {

        Thread.sleep(3000);
        webDriver.driver.findElement(By.xpath(cartIcon)).click();

        itemCartName = webDriver.driver.findElement(By.xpath(selectedItemCartName)).getText();
        itemCartPrice = webDriver.driver.findElement(By.xpath(selectedItemCartPrice)).getText();
        itemCartQuantity = webDriver.driver.findElement(By.xpath(selectedItemCartQuantity)).getAttribute("value");

        Assert.assertEquals(itemCartName,chooseTheFirstResults.itemName,"Selected Item name display incorrectly in shoppingcart page");
        Assert.assertEquals(itemCartPrice,chooseTheFirstResults.itemPrice,"Selected Item price display incorrectly in shoppingcart page");
        Assert.assertEquals(itemCartQuantity,"1","Selected Item Quantity display incorrectly in shoppingcart page");
    }
}
