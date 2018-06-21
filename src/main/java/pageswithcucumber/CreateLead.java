package pageswithcucumber;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import cucumber.api.java.en.And;
import wdMethods.ProjectMethods;

public class CreateLead extends ProjectMethods{
	
	public CreateLead() {
		PageFactory.initElements(driver,this);

	}
	

	@FindBy(how=How.ID,using="createLeadForm_companyName")
	private WebElement eleCompanyName;
	@And("Enter CompanyName as(.*)")
	public CreateLead enterCompanyName(String data) {
		type(eleCompanyName, data);
		return this;
	}
	@FindBy(how=How.ID,using="createLeadForm_firstName")
	private WebElement eleFirstName;
	@And("Enter FirstName as(.*)")

	public CreateLead enterFirstName(String data) {
		type(eleFirstName, data);
		return this;
	}
		@FindBy(how=How.ID,using="createLeadForm_lastName")
		private WebElement eleLastName;
		@And("Enter LastName as(.*)")

		public CreateLead enterLastName(String data) {
			type(eleLastName, data);
			return this;
}
		@FindBy(how=How.CLASS_NAME,using="smallSubmit")
		private WebElement elecreateleadbutton;
		
		public ViewLead clickcreateleadButton() {
			click(elecreateleadbutton);
			return new ViewLead();		
			

		}	
}
