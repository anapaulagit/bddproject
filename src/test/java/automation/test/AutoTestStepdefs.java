package automation.test;

import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.java.After;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

@Test
public class AutoTestStepdefs {

 private WebDriver driver;
 private String username;

    @Before
    public void setup(){
        System.setProperty("webdriver.chrome.driver","C:driver/chromedriver.exe");
        driver = new ChromeDriver();
    }

    @Given("navigate to Youtube page")
    public void navigateToYoutubePage() {

        String url = "https://www.youtube.com/";
        driver.get(url);
    }

    @When("I fill in an invalid username {string}")
    public void iFillInAnInvalidUsernameUsername(String name) throws InterruptedException {
    driver.findElement(By.xpath("/html/body/ytd-app/div/div/ytd-masthead/div[3]/div[3]/div[2]/ytd-button-renderer/a/tp-yt-paper-button/yt-formatted-string")).click();
    
    WebElement username = driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[2]/div/div[2]/div/div/div[2]/div/div[1]/div/form/span/section/div/div/div[1]/div/div[1]/div/div[1]/input"));
    username.sendKeys(name);
    driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

    driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[2]/div/div[2]/div/div/div[2]/div/div[2]/div/div[1]/div/div/button/span")).click();
    driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

    }

    @And("I fill in an invalid password {string}")
    public void iFillInAnInvalidPasswordPassword(String pass) {

     WebElement password = driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[2]/div/div[2]/div/div/div[2]/div/div[1]/div/form/span/section/div/div/div[1]/div[1]/div/div/div/div/div[1]/div/div[1]/input"));
     password.sendKeys(pass);

     driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[2]/div/div[2]/div/div/div[2]/div/div[2]/div/div[1]/div/div/button/span")).click();


    }

    @Then("I should get {string}")
     public void iShouldGet(String arg0) {
     WebElement element = driver.findElement(By.xpath("//*[contains(text(), 'Não foi possível fazer o login')]"));

    }

    @When("I search for {string}")
     public void iSearchFor(String search) throws InterruptedException {

     WebElement searchButton = driver.findElement(By.xpath("/html/body/ytd-app/div/div/ytd-masthead/div[3]/div[2]/ytd-searchbox/form/div/div[1]/input"));
     searchButton.sendKeys(search);
     driver.findElement(By.xpath("/html/body/ytd-app/div/div/ytd-masthead/div[3]/div[2]/ytd-searchbox/form/button/yt-icon")).click();
     driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

    }

    @Then("I see a list of videos about Wex")
     public void iSeeAListOfVideosAboutWex() {
     WebElement element = driver.findElement(By.xpath("//*[contains(text(), 'WEX Inc')]"));
    }

    @After()
     public void closeBrowser() {
      driver.quit();
    }

}
