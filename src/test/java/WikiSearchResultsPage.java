import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

/**
 * Created by srikanthsadhu on 23/09/2018.
 */
public class WikiSearchResultsPage {
    WebDriver driver = null;

    public WikiSearchResultsPage(WebDriver driver) {
         this.driver = driver;
    }

    public String getFirstHeadingTxt() throws InterruptedException {
        System.out.println(driver.getCurrentUrl());
        Thread.sleep(3000);
        String firstHeadingTxt = driver.findElement(By.id("firstHeading")).getText();
        System.out.println(driver.getCurrentUrl());
        return firstHeadingTxt;

    }

    public void clickLanguagelink(String langText){
        WebElement langLink = driver.findElement(By.linkText(langText));
        langLink.click();
        System.out.println(driver.getCurrentUrl());

    }


}
