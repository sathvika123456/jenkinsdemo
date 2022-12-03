package testNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class NewTest {
	WebDriver driver;
  @Test
  public void f() throws Exception {  
  WebDriver  driver =  new ChromeDriver();
      driver.get("https://www.facebook.com/");
      //wait statement
      Thread.sleep(5000);
      //type some text to user name editbox
      driver.findElement(By.id("email")).sendKeys("sathvikakakkerla6@gmail.com");
      driver.findElement(By.name("pass")).sendKeys("sathvika5599");
      //click on login
      driver.findElement(By.name("login")).click();
      
  }
}
