package stepDefs;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class UserLoginStepDef {
	
	WebDriver driver;
	
	@Given("User is on Login page")
	public void user_is_on_login_page() {
		driver= new ChromeDriver();
		driver.manage().window().maximize();
		 
	}
	/*@When("User enter credentials")     // first way- methods
	public void user_enter_credentials() {
		driver.get("https://the-internet.herokuapp.com/login");
		driver.findElement(By.id("username")).sendKeys("tomsmith");
		driver.findElement(By.name("password")).sendKeys("SuperSecretPassword!");
		driver.findElement(By.xpath("//i[@class='fa fa-2x fa-sign-in']")).click();
	} */
	
	/*@When("User enter {string} and {string}")     //// Second & Third way- methods
	public void user_enter_and(String strUser, String StrPwd) {
		driver.get("https://the-internet.herokuapp.com/login");
		driver.findElement(By.id("username")).sendKeys(strUser);
		driver.findElement(By.name("password")).sendKeys(StrPwd);
		driver.findElement(By.xpath("//i[@class='fa fa-2x fa-sign-in']")).click();
	}  */
	
	@When("User enter credentials")     // Fourth way__passing data at step level
	public void user_enter_credentials(DataTable dataTable) {
		List<List<String>> users= dataTable.asLists();
		driver.get("https://the-internet.herokuapp.com/login");
		String strUser= users.get(0).get(0);
		String StrPwd= users.get(0).get(1);
		driver.findElement(By.id("username")).sendKeys(strUser);
		driver.findElement(By.name("password")).sendKeys(StrPwd);
		driver.findElement(By.xpath("//i[@class='fa fa-2x fa-sign-in']")).click();
	} 
	
	@Then("Should display Success Msg")
	public void should_display_success_msg() {
	   boolean isDisp= driver.findElement(By.cssSelector("div.flash.success")).isDisplayed();
	   Assert.assertTrue(isDisp);
	   driver.close();  
	}   

}
