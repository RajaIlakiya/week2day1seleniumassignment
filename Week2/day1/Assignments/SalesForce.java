package Week2.day1.Assignments;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SalesForce {


//	*Note: No need click Start my freeTrial
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Step 1: Download and set the path
		WebDriverManager.chromedriver().setup();
		// Step 2: Launch the chromebrowser
		ChromeDriver driver=new ChromeDriver();
		// Step 3: Load the URL 
		           https://www.salesforce.com/in/form/signup/freetrial-sales/?d=70130000000Enyk
		        	   
		        	   driver.get("https://www.salesforce.com/in/form/signup/freetrial-sales/?d=70130000000Enyk");
		// Step 4: Maximise the window
		           driver.manage().window().maximize();
		// Step 5: Add implicit wait
		           driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		       	// Step 6: Fill in all the text boxes
driver.findElement(By.name("UserFirstName")).sendKeys("Raja Ilakiya");
driver.findElement(By.name("UserLastName")).sendKeys("Babu");
driver.findElement(By.name("UserEmail")).sendKeys("ilakiyababu2821@gmail.com");
driver.findElement(By.name("CompanyName")).sendKeys("TCS");
driver.findElement(By.name("UserPhone")).sendKeys("7358653065");

//Step 7: Handle all the dropdowns
WebElement title=driver.findElement(By.name("UserTitle"));
Select title1=new Select(title);
title1.selectByValue("IT_Manager_AP");

WebElement emp=driver.findElement(By.name("CompanyEmployees"));
Select employee=new Select(emp);
employee.selectByValue("1600");

WebElement country=driver.findElement(By.name("CompanyCountry"));
Select compCountry=new Select(country);
compCountry.selectByVisibleText("Zambia");

// Step 8: Click the check box
driver.findElement(By.className("checkbox-ui")).click();

//Step 9: Close the browser

driver.close();
	}

}
