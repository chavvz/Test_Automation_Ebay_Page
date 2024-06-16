import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class webDriver {

    public static WebDriver driver;

    @BeforeTest
    @Parameters({"browser"})
    public void setUpDriver(String browser) throws Exception {

        if(browser.equalsIgnoreCase("Chrome")){
            String location = System.getProperty("user.dir");
			System.setProperty("webdriver.chrome.driver", location + "\\webDrivers\\chromedriver.exe");

            ChromeOptions options = new ChromeOptions();
            options.addArguments("--start-maximized");
            driver = new ChromeDriver(options);
        } else if (browser.equalsIgnoreCase("Firefox")) {
            String location = System.getProperty("user.dir");
            System.setProperty("webdriver.chrome.driver", location + "\\webDrivers\\geckodriver.exe");

            FirefoxOptions options = new FirefoxOptions();
            options.addArguments("--start-maximized");
            driver = new FirefoxDriver(options);
        }else if (browser.equalsIgnoreCase("Edge")) {
            String location = System.getProperty("user.dir");
            System.setProperty("webdriver.chrome.driver", location + "\\webDrivers\\msedgedriver.exe");

            EdgeOptions options = new EdgeOptions();
            options.addArguments("--start-maximized");
            driver = new EdgeDriver(options);
        }
    }
}
