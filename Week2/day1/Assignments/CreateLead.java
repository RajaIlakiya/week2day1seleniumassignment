package Week2.day1.Assignments;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateLead {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
//			 1. Launch URL "http://leaftaps.com/opentaps/control/login"
		driver.get("http://leaftaps.com/opentaps");
		String title = driver.getTitle();
		System.out.println(title);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//			 2. Enter UserName and Password 
		WebElement webUser = driver.findElement(By.id("username"));
		webUser.sendKeys("demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
//	 3. Click on Login Button 
		driver.findElement(By.className("decorativeSubmit")).click();
//			 4. Click on CRM/SFA Link
		driver.findElement(By.linkText("CRM/SFA")).click();

//			 5. Click on Leads Button	
		driver.findElement(By.linkText("Leads")).click();
//			 6. Click on create Lead Button
		driver.findElement(By.linkText("Create Lead")).click();
//			  
//			 7. Enter all the text fields in CreateLead page

//		          **Note
//		               1. Donot work on Parent Account Field
//		               2.Enter the Birthdate using SendKeys

		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("TCS");
		WebElement firstName=driver.findElement(By.id("createLeadForm_firstName"));
		firstName.sendKeys("Raja Ilakiya");

		WebElement drpdwn1 = driver.findElement(By.id("createLeadForm_dataSourceId"));
		Select sourceDropDown1 = new Select(drpdwn1);
		sourceDropDown1.selectByVisibleText("Direct Mail");

		driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("Ilakiya");
		driver.findElement(By.id("createLeadForm_personalTitle")).sendKeys("Work");
		driver.findElement(By.id("createLeadForm_generalProfTitle")).sendKeys("Automation Engineer");
		driver.findElement(By.id("createLeadForm_annualRevenue")).sendKeys("10L");

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		WebElement industry = driver.findElement(By.id("createLeadForm_industryEnumId"));
		Select industryType = new Select(industry);
		industryType.selectByVisibleText("Computer Software");

		WebElement ownerShip = driver.findElement(By.id("createLeadForm_ownershipEnumId"));
		Select ownerSp = new Select(ownerShip);
		ownerSp.selectByValue("OWN_SCORP");

		driver.findElement(By.id("createLeadForm_sicCode")).sendKeys("1093");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("B");

		WebElement drpdwn2 = driver.findElement(By.id("createLeadForm_marketingCampaignId"));
		Select dropdown2 = new Select(drpdwn2);
		dropdown2.selectByValue("9002");

		driver.findElement(By.id("createLeadForm_lastNameLocal")).sendKeys("babu");

//			WebElement birthDay=driver.findElement(By.id("createLeadForm_birthDate-button"));
//            Select dateOfBirth=new Select(birthDay);
//            dateOfBirth.selectByValue("AUD");

		driver.findElement(By.id("createLeadForm_birthDate")).sendKeys("07/28/94");
		driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("CSE");

		WebElement currency = driver.findElement(By.id("createLeadForm_currencyUomId"));
		Select currencyTN = new Select(currency);
		currencyTN.selectByValue("AUD");

		driver.findElement(By.id("createLeadForm_numberEmployees")).sendKeys("7");
		driver.findElement(By.id("createLeadForm_tickerSymbol")).sendKeys("@");
		driver.findElement(By.id("createLeadForm_description")).sendKeys("abcdefg");
		driver.findElement(By.id("createLeadForm_importantNote")).sendKeys("abcdefg");

//   		 8. Enter all the text fields in contact information 

		WebElement countryCode = driver.findElement(By.id("createLeadForm_primaryPhoneCountryCode"));
		countryCode.clear();
		countryCode.sendKeys("5");

		driver.findElement(By.id("createLeadForm_primaryPhoneAreaCode")).sendKeys("97");
		driver.findElement(By.id("createLeadForm_primaryPhoneExtension")).sendKeys("91");
		driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("ilakiyababu2821@gmail.com");
		driver.findElement(By.id("createLeadForm_primaryPhoneNumber")).sendKeys("7358653065");
		driver.findElement(By.id("createLeadForm_primaryPhoneAskForName")).sendKeys("8987654434");
		driver.findElement(By.id("createLeadForm_primaryWebUrl")).sendKeys("http://www.tcs.com");

//    		 9. Enter all the text fields in primary address

		driver.findElement(By.id("createLeadForm_generalToName")).sendKeys("ilaks");
		driver.findElement(By.id("createLeadForm_generalAddress1")).sendKeys("OMR");
		driver.findElement(By.id("createLeadForm_generalCity")).sendKeys("Chennai");
		driver.findElement(By.id("createLeadForm_generalPostalCode")).sendKeys("600097");
		driver.findElement(By.id("createLeadForm_generalAttnName")).sendKeys("Raja Ilakiya");
		driver.findElement(By.id("createLeadForm_generalAddress2")).sendKeys("Chennai");
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		WebElement state = driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
		Select province = new Select(state);
		province.selectByValue("AK");

		WebElement cntry = driver.findElement(By.id("createLeadForm_generalCountryGeoId"));
		Select country = new Select(cntry);
	    country.selectByValue("UMI");
		
		driver.findElement(By.id("createLeadForm_generalPostalCodeExt")).sendKeys("600001");


//   		 10. Get the Firstname and print it

	
String firstName1 = firstName.getAttribute("value");
 	System.out.println("The FirstName is : " + firstName1);


//    		 11. Click on create Lead Button 
		driver.findElement(By.className("smallSubmit")).click();
//    		 
//    		 12. Get and Verify the Title of the resulting Page(View Lead)

		String title1 = "View Lead | opentaps CRM";
		String viewLeadTitle = driver.getTitle();

		if (title1.equals(viewLeadTitle)) {
			System.out.println("In the View Lead Page");
		} else {
			System.out.println("Not in the View Lead Page");
		}

	}
}
