package testNG;

import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.testng.annotations.BeforeClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;

public class annotaions1 {
	WebDriver driver;
	 @BeforeClass
	  public void beforeClass() {
	      WebDriverManager.chromedriver().setup();
	       driver =  new ChromeDriver();
		    driver.manage().window().maximize();
	 }
  @Test
  public void f() throws Exception {
	  driver.get("https://www.facebook.com/");
      Thread.sleep(5000);
      driver.findElement(By.id("email")).sendKeys("sathvikakakkerla6@gmail.com");
      driver.findElement(By.name("pass")).sendKeys("sathvika5599");
      driver.findElement(By.name("login")).click();
      
  }
  @AfterClass
  public void afterClass() {
	  driver.quit();
  }

}
 //    String path = C:\Users\man\Documents\Testing\eclipse_workspace\Selenium_Sathvika\screenshots