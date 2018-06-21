package features;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class CreateLead {
	public static RemoteWebDriver driver;
	@Given("Invoke LeafTap Application")
	public void invokeApp() {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("http://leaftaps.com/opentaps/");
		
	}
	@And("Login to Leaptaps")
    public void login() {
    	driver.findElementById("username").sendKeys("DemoSalesManager");
    	driver.findElementById("password").sendKeys("crmsfa");
    	driver.findElementByClassName("decorativeSubmit").click();
    }
	@And("Click on CMR/SFA")
    public void crmsfa() {
    	driver.findElementByLinkText("CRM/SFA").click();
    }
	@And("Click on Leads")
	public void leads() {
    	driver.findElementByLinkText("Leads").click();
    }
	@And("Click on Create Lead")
    public void createlead() {
    	driver.findElementByLinkText("Create Lead").click();
     }
	@And("Enter CompanyName as (.*)")
  public void enterCompanyName(String cName) {
	  driver.findElementById("createLeadForm_companyName").sendKeys(cName);
	}
	@And("Enter FirstName as (.*)")
	public void enterFirstName(String fName) {
	  driver.findElementById("createLeadForm_firstName").sendKeys(fName);
	}
	@And("Enter LastName as (.*)")
	public void enterLastName(String lName) {
	  driver.findElementById("createLeadForm_lastName").sendKeys(lName);
	}
	@When("Click on Submit")
	public void submitbutton() {
	  driver.findElementByClassName("smallSubmit").click();
  }
	@Then("Verify CreatedLead opened successfully")
	public void verifycreatedlead() {
		System.out.println("Lead is created Successfully");
	}
}
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
 