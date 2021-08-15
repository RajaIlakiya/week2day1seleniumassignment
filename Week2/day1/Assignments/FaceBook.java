package Week2.day1.Assignments;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FaceBook {
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Step 1: Download and set the path
WebDriverManager.chromedriver().setup();

// Step 2: Launch the chromebrowser
ChromeDriver driver=new ChromeDriver();

// Step 3: Load the URL https://en-gb.facebook.com/
driver.get("https://en-gb.facebook.com/");

// Step 4: Maximise the window
driver.manage().window().maximize();

// Step 5: Add implicit wait
driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

// Step 6: Click on Create New Account button

driver.findElement(By.linkText("Create New Account")).click();

// Step 7: Enter the first name
driver.findElement(By.name("firstname")).sendKeys("ilakiya");

// Step 8: Enter the last name
driver.findElement(By.name("lastname")).sendKeys("babu");

// Step 9: Enter the mobile number
driver.findElement(By.name("reg_email__")).sendKeys("ilakiyababu2821@gmail.com");

// Step 10: Enterthe password
driver.findElement(By.id("password_step_input")).sendKeys("Aaradhya2106@1");

// Step 11: Handle all the three drop downs

//Date

WebElement date=driver.findElement(By.name("birthday_day"));
Select date1=new Select(date);
date1.selectByValue("29");

//Month

WebElement mon=driver.findElement(By.id("month"));
Select month=new Select(mon);
month.selectByValue("7");

//Year

WebElement year=driver.findElement(By.id("year"));
Select year1=new Select(year);
year1.selectByValue("1994");


// Step 12: Select the radio button "Female" 
//            ( A normal click will do for this step) 

driver.findElement(By.className("_8esa")).click();

	}

}
