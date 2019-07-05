import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;


public class homeWork {
  public static void main(String[] args) throws InterruptedException {
    System.setProperty("webdriver.gecko.driver", "C:\\geckodriver\\geckodriver.exe");
    DesiredCapabilities capabilities = DesiredCapabilities.firefox();
    capabilities.setCapability("marionette", true);
    WebDriver wd = new FirefoxDriver(capabilities);

    wd.get("https://www.bing.com");
    WebElement search = wd.findElement(By.className("b_searchbox"));
    search.sendKeys("automation");
    /*WebElement searchButton = wd.findElement(By.className("b_searchboxSubmit"));
    searchButton.click();*/
    //WebElement go = wd.findElement(By.id("sb_form_go"));
    search.sendKeys(Keys.ENTER);
    String url = wd.getCurrentUrl();
    System.out.println("The URL is " + url);
    String pageTitle = wd.getTitle();
    System.out.println("Actual title is: " + pageTitle);
    /*//List allResults;
    wd.findElements(By.className("b_title"));
    System.out.println("Search results are:" + );*/
    List<WebElement> objLinks = wd.findElements(By.className("b_title"));
    for (WebElement objCurLink: objLinks) {
        String strLink = objCurLink.getText();
      System.out.println(strLink);
    }
    /*for(int i =0; i<listElement.size(); i++) {
      String elementText = listElement.get(i).getText();
      System.out.println("Current lis is:" + elementText);
    }*/

    //wd.close();

  }
}
