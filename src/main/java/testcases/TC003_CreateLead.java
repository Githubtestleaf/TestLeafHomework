package testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.LoginPage;
import wdMethods.ProjectMethods;

public class TC003_CreateLead extends ProjectMethods{
	@BeforeTest
	public void setData() {
		testCaseName="TC003_CreateLead";
		testDescription="login and logout in LeafTaps Application";
		testNodes="Leads";
		category="Smoke";
		authors="Kausalya";
		browserName="chrome";
		dataSheetName="TC003";
	}
	@Test(dataProvider="fetchData")
	public void CreateLead(String uName,String pwd,String cName,String fName,String lName,String vFName) {
		
		new LoginPage()
		.enterUserName(uName)
		.enterPassword(pwd)
		.clickLogIn()
		.clickCRMSFA()	
		.clickleads()
		.clickcreatelead()
		.enterCompanyName(cName)
		.enterFirstName(fName)
		.enterLastName(lName)
		.clickcreateleadButton()
		.verifyFirstName(vFName);
		
	}
}






