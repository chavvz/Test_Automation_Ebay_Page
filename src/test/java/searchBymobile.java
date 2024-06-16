import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class searchBymobile extends elementLocators {

    @Test
    public void searchMobilePhones() throws Exception {

        Thread.sleep(2000);
        webDriver.driver.findElement(By.xpath(searchBar)).sendKeys("Mobile Phone");
        webDriver.driver.findElement(By.xpath(searchButton)).click();

        System.out.println("First 5 items details: ");
        System.out.println("----------------------------------------------------------------------------------------------------------------");

        for(int j =1;j<=5;j++){
            String resultNumber = String.valueOf(j+1);

            if((webDriver.driver.findElement(By.xpath(searchResultHeader.replace("raw",resultNumber))).getText()).contains("Mobile Phone") ||
                    (webDriver.driver.findElement(By.xpath(searchResultHeader.replace("raw",resultNumber))).getText()).contains("mobile phone")){

                System.out.println(j + " of first 5 results contain 'Mobile Phone': ");
                System.out.println("Name: " + webDriver.driver.findElement(By.xpath(searchResultHeader.replace("raw",resultNumber))).getText());
                System.out.println("Price: " + webDriver.driver.findElement(By.xpath(searchResultPrice.replace("raw",resultNumber))).getText());
                System.out.println("----------------------------------------------------------------------------------------------------------------");

            }else{

                System.out.println(j + " of first 5 results not contain 'Mobile Phone'");
                System.out.println("Name: " + webDriver.driver.findElement(By.xpath(searchResultHeader.replace("raw",resultNumber))).getText());
                System.out.println("Price: " + webDriver.driver.findElement(By.xpath(searchResultPrice.replace("raw",resultNumber))).getText());
                System.out.println("----------------------------------------------------------------------------------------------------------------");
            }
        }

    }
}
