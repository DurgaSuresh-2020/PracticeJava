import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.math.BigInteger;
import java.util.Arrays;


public class LaunchGoogle {
    @Test
    void tester() {
        //System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver");
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com/");
        driver.close();
    }



}