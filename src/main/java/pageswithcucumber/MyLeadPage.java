package pageswithcucumber;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import cucumber.api.java.en.And;
import wdMethods.ProjectMethods;

public class MyLeadPage extends ProjectMethods{
	public MyLeadPage() {
		PageFactory.initElements(driver,this);
	}
	@FindBy(how=How.LINK_TEXT,using="Create Lead")
	private WebElement elecreatelead;
	@And("Click on Create Lead")
	public  CreateLead clickcreatelead() {
		click(elecreatelead);
		return new CreateLead();		
	}
	

		
}
	
	


