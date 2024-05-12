package stepDefs;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class GooglePageStepDef {
	
	@Before  ("@SmokeTest")
	public void setupChrome() {
		System.out.println("initialize Chrome..");
	}
	
	@Before   ("@RegressionTest")
	public void setupEdge() {
		System.out.println("initialize Edge..");
	}
	
	WebDriver driver;
	
	@Given("User is on Google home page")
	public void user_is_on_google_home_page() {
		driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
	}
	@When("User search Java Tutorial")
	public void user_search_java_tutorial() {
	   WebElement srcBox= driver.findElement(By.className("gLFyf"));
	   srcBox.sendKeys("Java Tutotial");
	   srcBox.submit();
	}
	@Then("Should display Java Tutorial page")
	public void should_display_java_tutorial_page() {
	   Assert.assertEquals(driver.getTitle(), "Java Tutotial - Google Search");
	   driver.close();
	}
	
	@When("User search Selenium Tutorial")
	public void user_search_selenium_tutorial() {
		WebElement srcBox= driver.findElement(By.className("gLFyf"));
		   srcBox.sendKeys("Selenium Tutotial");
		   srcBox.submit();
	}
	@Then("Should display Selenium Tutorial page")
	public void should_display_selenium_tutorial_page() {
		Assert.assertEquals(driver.getTitle(), "Selenium Tutotial - Google Search"); 
		driver.close();
	}
	
	@After
	public void ttchScreenImg(Scenario scenario) {
		if(scenario.isFailed()) {
			TakesScreenshot screen= (TakesScreenshot)driver;
			byte[] img= screen.getScreenshotAs(OutputType.BYTES);
			scenario.attach(img, "img/png", "ScreenshotImage");
		}
	}

}
