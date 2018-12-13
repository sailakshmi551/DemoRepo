package stepDefinition;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Register_Steps
{
	public static WebDriver driver;
	@Given("^User is on Home page$")
	public void user_is_on_Home_page() throws Throwable
	{
		System.out.println("Home Page");
		 // Write code here that turns the phrase above into concrete actions
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://newtours.demoaut.com/");
	}

	@When("^click on the register link$")
	public void click_on_the_register_link() throws Throwable 
	{
		System.out.println("Register Link");
	}

	@Then("^'Register' page should be displayed$")
	public void register_page_should_be_displayed() throws Throwable 
	{
		// Write code here that turns the phrase above into concrete actions
				driver.findElement(By.name("login")).click();
				Thread.sleep(5000);
				driver.close();
	}

}
