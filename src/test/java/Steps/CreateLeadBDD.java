package Steps;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class CreateLeadBDD {

	public static RemoteWebDriver driver;
	@Given("Launch the browser")
	public void login() {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		driver = new ChromeDriver();
	}
	
	@And("maximize the browser")
	public void Maximize() {
		driver.manage().window().maximize();
	}
	
	
	@And("Enter the URls")
	public void Enterurl() {
		driver.get("http://leaftaps.com/opentaps/");
	}
/*	
	@And("set the timeouts")
	public void timeout() {
		driver.manage().timeouts().implicitlyWait(30, Seconds);
	}*/
	
	@And("enter the User name as (.*)")
	public void username(String name) {
		driver.findElementById("username").sendKeys(name);
	}
	@And("enter the password as (.*)")
	public void Password(String pword) {
		driver.findElementById("password").sendKeys(pword);
	}
	
	
	@And("clicks on login button")
	public void Clicklogin() {
		driver.findElementByClassName("decorativeSubmit").click();
	}
	
	@And("clicks on CRMSFA")
	public void clicksCRM_SFA() {
		driver.findElementByLinkText("CRM/SFA").click();
	}
	@And("clicks on create lead")
	public void Createlead() {
		driver.findElementByLinkText("Create Lead").click();
	}
	@And("Enter First Name as(.*)")
	public void Firstname(String fname) {
		driver.findElementById("createLeadForm_firstName").sendKeys(fname);
	}
	
	@And("Enter Last Name as(.*)")
	public void Lastname(String lname) {
		driver.findElementById("createLeadForm_lastName").sendKeys(lname);
	}
	
	@And("Enter Company Name as(.*)")
	public void Company(String cname) {
		driver.findElementById("createLeadForm_companyName").sendKeys(cname);
	}
	
	@When("Click on Create lead")
	public void Createname() {
		driver.findElementByName("submitButton").click();
	}
	
	@Then("Verify Lead is created")
	public void Verifylead() {
		System.out.println("Lead Created Successfully");
	}
	
}
