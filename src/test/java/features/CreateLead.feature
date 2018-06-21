Feature: Create Lead
Scenario Outline: Create New Lead(positive)
Given Invoke LeafTap Application
And Login to Leaptaps
And Click on CMR/SFA
And Click on Leads
And Click on Create Lead
And Enter CompanyName as <companyName>
And Enter FirstName as <firstName>
And Enter LastName as <lastName>
When Click on Submit
Then Verify CreatedLead opened successfully
Examples:
|companyName|firstName|lastName|
|Cognizant|Kausalya|Ramamoorthy|
|TCS|Karthik|Munuswamy|
