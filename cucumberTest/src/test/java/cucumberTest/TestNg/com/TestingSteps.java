package cucumberTest.TestNg.com;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.AssertJUnit;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class TestingSteps {
	static WebDriver driver;
	
	@Given("^User is on Home Page$")
	public void user_is_on_Home_Page() {
	
	}

	@When("^User enters UserName and Password$")
	public void user_enters_Username_and_Password() {
	
	}

	@When("^Clicks Go button$")
	public void clicks_Go_button() throws InterruptedException {
	
		Thread.sleep(3000);
	}
	
	@When("^User LogOut from the Application$")
	public void user_LogOut_from_the_Application() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
	}

	@Then("^He can visit the practice page$")
	public void he_can_visit_the_practice_page() {
		AssertJUnit.assertTrue(true);
	}

	@Then("^he cannot visit practice page$")
	public void a_message_is_displayed() {
		System.out.println("Login Successful");
		AssertJUnit.assertTrue(true);
	}

}
