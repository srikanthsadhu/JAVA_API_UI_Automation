import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

/**
 * Created by srikanthsadhu on 23/09/2018.
 */
public class WikiHomePage {
    WebDriver driver = null;

    public WikiHomePage(WebDriver driver){
         this.driver = driver;
    }

    public void open() {
        System.out.println(driver.getCurrentUrl());
        driver.get("http://www.wikipedia.org/");
        System.out.println(driver.getCurrentUrl());
    }

    public void enterSearch(String searchStr){
        final WebElement searchInput = driver.findElement(By.id("searchInput"));
        searchInput.click();
//        final String searchStr = "English";
        searchInput.sendKeys(searchStr);
    }

    public void submitSearch(){
        WebElement searchbtn = driver.findElement(By.xpath("//*[@id=\"search-form\"]/fieldset/button"));
        searchbtn.click();
    }





}
