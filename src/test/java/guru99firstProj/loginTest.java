package guru99firstProj;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class loginTest {
    @Test
    public void getName() {
        WebDriver driver = new ChromeDriver();
        System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe");
        driver.get("http://demo.guru99.com/test/login.html");
        driver.quit();
    }
}
