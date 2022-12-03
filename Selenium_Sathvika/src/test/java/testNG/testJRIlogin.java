package testNG;

import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class testJRIlogin {
  @Test
  public void f() throws Exception {
	   WebDriver driver;
        driver= new ChromeDriver();
		 driver.get("https://www.justrechargeit.com/SignIn.aspx");
		 //wait statement
		 Thread.sleep(5000);
	      //type some text to user name editbox
		driver.findElement(By.id("txtUserName")).sendKeys("sathvika24k@gmail.com");
		driver.findElement(By.id("txtPasswd")).sendKeys("123456");
	    Scanner s = new Scanner(System.in);
		System.out.println("enter captcha");
		String captcha = s.next();
		driver.findElement(By.id("txtCaptcha")).sendKeys(captcha);
		driver.findElement(By.id("imgbtnSignin")).click();
	
  }
}
