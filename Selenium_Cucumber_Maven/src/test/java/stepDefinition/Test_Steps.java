package stepDefinition;

import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Test_Steps 
{	
	public static WebDriver driver;
	@Given("^User is on login page$")
	public void user_is_on_login_page() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://newtours.demoaut.com/");
	}

	@When("^I enter \"([^\"]*)\" and \"([^\"]*)\"$")
	public void i_enter_username_and_password(String userName, String password) throws Throwable 
	{
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.name("userName")).sendKeys(userName);
		driver.findElement(By.name("password")).sendKeys(password);
	}

	@When("^click on login button$")
	public void click_on_login_button() throws Throwable 
	{
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.name("login")).click();
	}

	@Then("^'Home' page should be displayed$")
	public void home_page_should_be_displayed() throws Throwable 
	{
	    // Write code here that turns the phrase above into concrete actions
		String title = driver.getTitle();
		System.out.println("Title is:"+title);
		String expectedResult = "Sign-on: Mercury Tours";
		if(expectedResult.equals(title))
		{
			System.out.println("User logged-in successfully");
		}
		else
		{
			System.out.println("User is not logged-in successfully");
		}
		driver.close();
	}
	
/*	//DataTables in Cucumber
	@When("^user enter credentials to login$")
	public void user_enter_credentials_to_login(DataTable userCredentials) throws Throwable 
	{
		//Write the code to handle Data Table
		List<List<String>> data = userCredentials.raw();
		
		driver.findElement(By.name("userName")).sendKeys(data.get(0).get(0));
		driver.findElement(By.name("password")).sendKeys(data.get(0).get(1));
		
		
		
	}
	*/
	
/*	//Maps in DataTables with Header
	@When("^user enter credentials to login$")
	public void user_enter_credentials_to_login(DataTable userCredentials) throws Throwable 
	{
		//Write the code to handle Data Table
		List<Map<String, String>> data = userCredentials.asMaps(String.class, String.class);
		
		driver.findElement(By.name("userName")).sendKeys(data.get(0).get("UserName"));
		driver.findElement(By.name("password")).sendKeys(data.get(0).get("Password"));
	}
	*/
/*		//Maps in DataTables with Multiple Test Data
 * 		//Data Table with maps for the parameterization of test cases
		@When("^user enter credentials to login$")
		public void user_enter_credentials_to_login(DataTable userCredentials) throws Throwable 
		{
			//Code to handle data table
			for(Map<String,String> data:userCredentials.asMaps(String.class, String.class))
			{
				driver.findElement(By.name("userName")).sendKeys(data.get("UserName"));
				driver.findElement(By.name("password")).sendKeys(data.get("Password"));
				driver.findElement(By.name("login")).click();
			}
		}
		*/
	
	//Map Data Tables to Class Objects
	@When("^user enter credentials to login$")
	public void user_enter_credentials_to_login(List<Credentials> userCredentials) throws Throwable 
	{
		//Code to handle data table
		for(Credentials data:userCredentials)
		{
			driver.findElement(By.name("userName")).sendKeys(data.getUsername());
			driver.findElement(By.name("password")).sendKeys(data.getPassword());
			driver.findElement(By.name("login")).click();
		}
	}
	
}