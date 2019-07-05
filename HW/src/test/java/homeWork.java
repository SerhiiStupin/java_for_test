import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;


public class homeWork {
  public static void main(String[] args) {
    System.setProperty("webdriver.gecko.driver", "C:\\geckodriver\\geckodriver.exe");
    DesiredCapabilities capabilities = DesiredCapabilities.firefox();
    capabilities.setCapability("marionette", true);
    WebDriver wd = new FirefoxDriver(capabilities);

    wd.get("https://www.bing.com");


  }
}
