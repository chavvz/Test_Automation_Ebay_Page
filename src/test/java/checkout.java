import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class checkout extends elementLocators {

    public static String itemCheckoutName;
    public static String itemCheckoutPrice;
    public static String itemCheckoutQuantity;

    @Test
    public void itemCheckout() throws Exception {

        webDriver.driver.findElement(By.xpath(goToCheckoutButton)).click();
        Thread.sleep(5000);
        webDriver.driver.findElement(By.xpath(continueAsGuestButton)).click();
        Thread.sleep(5000);
        Assert.assertTrue(webDriver.driver.findElement(By.xpath(checkoutPage)).isDisplayed(),"User unable to navigate checkout page");
    }

    @Test(dependsOnMethods = "itemCheckout")
    public void checkoutPageItemDetailsVerification() throws Exception {

        itemCheckoutName = webDriver.driver.findElement(By.xpath(checkoutItemName)).getText();
        itemCheckoutPrice = webDriver.driver.findElement(By.xpath(checkoutItemPrice)).getText();
        itemCheckoutQuantity = webDriver.driver.findElement(By.xpath(checkoutItemQuantity)).getAttribute("value");

        Assert.assertEquals(itemCheckoutName, shoppingCart.itemCartName,"Selected Item name display incorrectly in checkout page");
        Assert.assertEquals(itemCheckoutPrice, shoppingCart.itemCartPrice,"Selected Item price display incorrectly in checkout page");
        Assert.assertEquals(itemCheckoutQuantity, shoppingCart.itemCartQuantity,"Selected Item Quantity display incorrectly in checkout page");

        System.out.println("Checkout item details: ");
        System.out.println("----------------------------------------------------------------------------------------------------------------");
        System.out.println("Checkout Item name is: "+ itemCheckoutName);
        System.out.println("Checkout Item Price is: "+ itemCheckoutPrice);
        System.out.println("Checkout Item Quantity is: "+ itemCheckoutQuantity);
    }

    @AfterTest
    public void driverQuit() {
        if (webDriver.driver != null) {
            webDriver.driver.quit();
        }
    }
}
