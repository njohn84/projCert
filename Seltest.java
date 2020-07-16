import java.util.concurrent.TimeUnit;
import java.io.IOException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;

public class Seltest {

	public static void main(String[] args) throws IOException, InterruptedException {
                System.setProperty("webdriver.chrome.driver", "/usr/bin/chromedriver");
                ChromeOptions chromeOptions = new ChromeOptions();
                chromeOptions.addArguments("--headless");
        // chromeOptions.addArguments("--no-sandbox");

         WebDriver driver = new ChromeDriver(chromeOptions);
	 System.out.println("Test Print");
         driver.get("http://localhost:7085");
         driver.findElement(By.id("About Us")).click();

        // Thread.sleep(1000);

         if (driver.getPageSource().contains("about")) {
                 System.out.println("Pass");
         } else {
                 System.out.println("Fail");
         }
         driver.quit();
	}

}

