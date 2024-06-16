import org.openqa.selenium.By;
import org.testng.annotations.Test;

import java.util.Set;

public class chooseTheFirstResults extends elementLocators {

    public static String parentWinHandle;
    public static String itemName;
    public static String itemPrice;

    @Test
    public void chooseFirstResult() throws Exception {

        webDriver.driver.findElement(By.xpath(searchResultHeader.replace("raw", "2"))).click();

    }

    @Test(dependsOnMethods = "chooseFirstResult")
    public void switchWindow() throws Exception {

        parentWinHandle = webDriver.driver.getWindowHandle();
        Set<String> winHandles = webDriver.driver.getWindowHandles();
        // Loop through all handles
        for (String handle : winHandles) {
            if (!handle.equals(parentWinHandle)) {
                webDriver.driver.switchTo().window(handle);
            }
        }
    }

    @Test(dependsOnMethods = "switchWindow")
    public void displaySelectedItemDetails() throws Exception {

        itemName = webDriver.driver.findElement(By.xpath(selectedItemName)).getText();
        itemPrice = webDriver.driver.findElement(By.xpath(selectedItemPrice)).getText();

        System.out.println("Selected Item name is: "+ itemName);
        System.out.println("Selected Item Price is: "+ itemPrice);
        System.out.println("----------------------------------------------------------------------------------------------------------------");
    }
}
