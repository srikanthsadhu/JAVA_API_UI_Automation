import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;

/**
 * Created by srikanthsadhu on 05/07/2017.
 */
public class WikipediaTests {

    public static WebDriver driver ;
    @BeforeClass
    public static void setup(){
        driver = new HtmlUnitDriver();
    }


    @Test
    public void wikiTest1() throws Exception{

        WikiHomePage homePage = new WikiHomePage(driver);
        homePage.open();

        final String englisearchStr = "Selenium";
        homePage.enterSearch(englisearchStr);
        homePage.submitSearch();

        final WikiSearchResultsPage wikiSearchResultsPage = new WikiSearchResultsPage(driver);

        Assert.assertTrue(wikiSearchResultsPage.getFirstHeadingTxt().equalsIgnoreCase(englisearchStr));

        wikiSearchResultsPage.clickLanguagelink("Cymraeg"); //checking presence of other language and clicking it
        Assert.assertTrue(driver.getCurrentUrl().contains("cy.wikipedia"));


        wikiSearchResultsPage.clickLanguagelink("English");
        Assert.assertTrue(driver.getCurrentUrl().contains("en.wikipedia"));
    }



}
