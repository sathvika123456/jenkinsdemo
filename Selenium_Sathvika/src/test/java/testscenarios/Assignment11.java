package testscenarios;

import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assignment11 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		 WebDriver driver;
		    WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			 Thread.sleep(3000);
		    driver.manage().window().maximize();
			driver.get("https://www.justrechargeit.com/SignIn.aspx ");
			 //wait statement
		      Thread.sleep(3000);                                           
		  	driver.findElement(By.id("txtUserName")).sendKeys("sathvika24k@gmail.com");
			driver.findElement(By.id("txtPasswd")).sendKeys("123456");
		    Scanner s = new Scanner(System.in);
			System.out.println("enter captcha");
			String captcha = s.next();
			driver.findElement(By.id("txtCaptcha")).sendKeys(captcha);
			driver.findElement(By.id("imgbtnSignin")).click();
		      Thread.sleep(3000);     
		    driver.findElement(By.xpath("//*[@id=\"listingtable_btnGridDelete_3\"]")).click();
		    Thread.sleep(3000);
		    System.out.println(driver.switchTo().alert().getText());
		    Thread.sleep(3000);
		      driver.switchTo().alert().dismiss();
		      	     
		      
	}

}
