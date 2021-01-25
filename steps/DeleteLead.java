package steps;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import base.ProjectSpecificMethods;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class DeleteLead extends ProjectSpecificMethods  {
	

	@Given("I navigate to login page")
	public void NaviLoginPage()
	{
		
		driver.get("http://leaftaps.com/crmsfa/control/main");
		driver.manage().window().maximize();
	}
	
	@When("I submit the Username and Password")
	public void EnterUnameandPwd()
	{
		driver.findElementByXPath("(//input[@name=\"USERNAME\"])[1]").sendKeys("democsr");
		driver.findElementByXPath("//input[@name=\"PASSWORD\"]").sendKeys("crmsfa");
	}
	
	@Then("I logged In")
	public void Login()
	{
		driver.findElementByXPath("(//input[@class=\"loginButton\"])[1]").click();
		
	}
	
	@Given("I Navigate to Lead List page")
	public void NaviLeadList()
	{
		
		driver.findElementByXPath("//a[text()=\"Leads\"]").click();
		driver.findElementByXPath("//a[text()=\"My Leads\"]").click();
	}
	
	@When("I delete the lead")
	public void DeletLead()
	{
		driver.findElementByXPath("(//table[@class=\"x-grid3-row-table\"])[1]//tr//td[1]//a").click();
		driver.findElementByXPath("//a[text()=\"Delete\"]").click();
	}
	
	
	@Then("lead is deleted")
	public void ConfirmDelete()
	{
		System.out.println("Deleted Successfully");
	}
	
	
	@Given("I Navigate to Create Lead page")
	public void NaviCreateform()
	{
		driver.findElementByXPath("//a[text()=\"Create Lead\"]").click();
	}
	
	@Given("I enter the company name,first name,last name")
	public void EnterCmpFirstLast()
	{
		driver.findElementByXPath("(//input[@name=\"companyName\"])[2]").sendKeys("Test Company");
		driver.findElementByXPath("(//input[@name=\"firstName\"])[3]").sendKeys("Test");
		driver.findElementByXPath("(//input[@name=\"lastName\"])[3]").sendKeys("Employee01");
	}	
	
	@Given("Select the Source id")
	public void SelSourceId()
	{
		WebElement selele = driver.findElementByXPath("//select[@name=\"dataSourceId\"]");
		Select source= new Select(selele);
		source.selectByIndex(1);
	}	
	
	@Given("Select the marketing campaign")
	public void SelMarketcamp()
	{
		WebElement seleleMark = driver.findElementByXPath("//select[@name=\"marketingCampaignId\"]");
		Select sourceMark= new Select(seleleMark);
		sourceMark.selectByValue("CATRQ_CAMPAIGNS");
	}	
	
	@Given("Select the DOB")
	public void SelDOB() throws InterruptedException
	{
driver.findElementByXPath("//img[@id=\"createLeadForm_birthDate-button\"]").click();
		
		WebElement titlecheck= driver.findElementByXPath("//td[@class=\"title\"]");
		String titlename= titlecheck.getText();
		String month=titlename.substring(0, 3);
		String year=titlename.substring(titlename.length()-4, titlename.length());
		System.out.println(titlename);
		System.out.println(month);
		System.out.println(year);
		
		while (!month.equals("May"))
			{
			
			Thread.sleep(1000);
			driver.findElementByXPath("//tr[@class=\"headrow\"]//td[2]").click();
			Thread.sleep(1000);
			titlename= titlecheck.getText();
			month=titlename.substring(0, 3);
			//System.out.println(month);
			
			}
		while (!year.equals("1991"))
		   {
			driver.findElementByXPath("//tr[@class=\"headrow\"]//td[1]").click();
			Thread.sleep(1000);
			titlename= titlecheck.getText();
			year=titlename.substring(titlename.length()-4, titlename.length());
			//System.out.println(year);
			
			}
		driver.findElementByXPath("//tr[@class=\"daysrow\"][3]//td[5]").click();
	}	
	
	@When("I Submit the form")
	public void SubmitForm()
	{
		driver.findElementByXPath("//input[@class=\"smallSubmit\"]").click();
	}	
	
	
	@Then("lead is Created")
	public void LeadcreateSuccessmessge()
	{
		System.out.println("Lead Create Successfully");
	}
	
	
	
	
	
	
	
	
	
	
}
