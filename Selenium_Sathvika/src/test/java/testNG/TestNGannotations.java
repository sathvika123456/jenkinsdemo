package testNG;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;

import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.AfterClass;

public class TestNGannotations {
	WebDriver driver;
	 @BeforeClass
	  public void beforeClass() throws Exception {
		 WebDriver  driver =  new ChromeDriver();
	      driver.get("https://www.facebook.com/");
	      //wait statement
	      Thread.sleep(5000);
	  }
	  @BeforeMethod
	  public void beforeMethod() throws Exception {
		  driver.findElement(By.name("login")).click();
	  }
  @Test
  public void invalidcredentials() throws Exception {
		driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys("ejdeweueij@gmail.com");
		driver.findElement(By.xpath("//*[@id=\"pass\"]")).sendKeys("heuh123");
		  Thread.sleep(5000);
	      driver.findElement(By.xpath("//*[@aria-label='Your profile']")).click();

  }
  @Test
  public void validcredentials() throws Exception {
		driver.findElement(By.xpath("//*[@id=\\\"email\\\"]")).sendKeys("sathvikakakkerla6@gmail.com");
		driver.findElement(By.xpath("//*[@id=\\\"pass\\\"]")).sendKeys("sathvika5599");
		  Thread.sleep(5000);
	      driver.findElement(By.xpath("//*[@aria-label='Your profile']")).click();

      }
  @AfterMethod
  public void afterMethod() throws Exception {
	  Date d = new Date();
			DateFormat abcd = new SimpleDateFormat("ddMMMyyyy_HHmmss");
			String timeStamp = abcd.format(d);
			File abc =  ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			FileHandler.copy(abc,new File(".\\screenshots\\test_"+timeStamp+".png"));
  }

 
  @AfterClass
  public void afterClass() {
		driver.quit();
	}
}

//Open Chrome Browser and type URL(FB)       -before class
//Type in-valid valid credentials               -@test1
//Take screenshot and store it into any folder  -
//then click on Login button                    -before method
//Take screenshot and store it into any folder  -
//Type valid valid credentials                   -@test2
//Take screenshot and store it into any folder  -
//then click on Login button                     - before method
//Take screenshot and store it into any folder  -
//Wait for few sec then click on Logout button   -aftermethod
//Take screenshot and store it into any folder    -
//Close the browser                             - after class