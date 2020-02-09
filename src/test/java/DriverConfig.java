import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class DriverConfig {

    public WebDriver driver;

    @BeforeClass
    public void BeforeRun() {
        WebDriver driver = new ChromeDriver();
        System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
        driver.get("http://demo.guru99.com/test/login.html");
    }

    @AfterClass
    public void AfterRun() {
        driver.quit();
    }

}
