package stepdefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import hooks.hooksclass;

public class uniform
{
	WebDriver driver = hooksclass.driver;
	
	@Given("User is on homepage")
	public void user_is_on_homepage() {
	    driver.get("http://uniformm1.upskills.in/admin/");
	}
	

@When("user enter invalid Username {string} and password {string}")
public void user_enter_invalid_Username_and_password(String username, String password) throws InterruptedException 
{
	driver.findElement(By.id("input-username")).sendKeys(username);
	Thread.sleep(3000);
	driver.findElement(By.id("input-password")).sendKeys(password);
	Thread.sleep(3000);
	
}


@Then("Validation message appears")
public void validation_message_appears() {
   System.out.println("Enter valid information");
}

@When("user enter valid Username {string} and password {string}")
public void user_enter_valid_Username_and_password(String username, String password) throws InterruptedException 
{
	driver.findElement(By.id("input-username")).sendKeys(username);
	Thread.sleep(1000);
	   
	driver.findElement(By.id("input-password")).sendKeys(password);
	Thread.sleep(1000);
	
   
}

@When("user clicks on submit button")
public void user_clicks_on_submit_button1() throws InterruptedException {

	
	driver.findElement(By.xpath("//button[@type='submit']/i")).click();
	Thread.sleep(1000);
	
}


@Then("user is at dashboard and ckick menu button")
public void user_is_at_dashboard_and_ckick_menu_button() throws InterruptedException {
	
	driver.findElement(By.xpath("//a[@id='button-menu']/i")).click();
	Thread.sleep(1000);
}


@When("user clicks on Menu to navigate to Reports")
public void user_clicks_on_Menu_to_navigate_to_Reports() throws InterruptedException 
{
	driver.findElement(By.xpath("//*[@id='reports']/a/span")).click();
		Thread.sleep(1000);
	
    
}

@When("user clicks on Sales and navigates to Orders page")
public void user_clicks_on_Sales_and_navigates_to_Orders_page() throws InterruptedException {
	driver.findElement(By.xpath("//a[text()='Sales']")).click();
   Thread.sleep(3000);
   
 
}

@Then("user click on Orders")
public void user_click_on_Orders() throws InterruptedException 
{
	driver.findElement(By.xpath("//*[@id='reports']/ul/li[1]/ul/li[1]/a")).click(); 
	    Thread.sleep(2000);
}
/*
@When("user enters  Date Start")
public void user_enters_Date_Start() throws InterruptedException {
	driver.findElement(By.xpath("//[@id='input-date-start']")).sendKeys("2022-06-01");////[@id="input-date-start"]
	 Thread.sleep(2000);
}


@When("user enters  Date End")
public void user_enters_Date_End() throws InterruptedException {

	driver.findElement(By.xpath("//*[@id='input-date-end']")).sendKeys("2022-06-27");////[@id="input-date-start"]
	  Thread.sleep(2000);
}*/


/*
@Then("User is at Sales Report page")
public void user_is_at_Sales_Report_page() {
}

@When("user enter Starting date {string} and Ending date {string}")
public void user_enter_Starting_date_and_Ending_date(String string, String string2) throws InterruptedException {
	driver.findElement(By.xpath("//*[@id='input-date-start']")).sendKeys(string);
	Thread.sleep(3000);
	driver.findElement(By.xpath("//*[@id='input-date-end']")).sendKeys(string2);
	Thread.sleep(3000);
	
}
*/

@When("user enter Starting Starting date {string} and Ending date {string}")
public void user_enter_Starting_Starting_date_and_Ending_date(String string, String string2) throws InterruptedException {
	//driver.findElement(By.xpath("//*[@id='input-date-start']")).sendKeys(string);
	//Thread.sleep(3000);
	//driver.findElement(By.id("input-date-string")).sendKeys(string);
	//Thread.sleep(3000);
	driver.findElement(By.xpath("//*[@id='input-date-end']")).sendKeys(string2);
	Thread.sleep(3000);////*[@id="input-date-end"]
	//driver.findElement(By.id("input-date-end")).sendKeys(string2);
	//Thread.sleep(3000);
}



@Then("user clicks on filter button")
public void user_clicks_on_filter_button() throws InterruptedException 
{
	//driver.findElement(By.xpath("//*[@id='button-filter']")).click();
	//Thread.sleep(3000);
	driver.findElement(By.id("button-filter")).click();
	Thread.sleep(3000);
	
}


	}