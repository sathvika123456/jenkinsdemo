package testscenarios;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assignment13a {

	public static void main(String[] args)  {
		// TODO Auto-generated method stub
		 WebDriver driver;
		    WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		    driver.manage().window().maximize();
			driver.get(" https://www.mail.com/");
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		      driver.findElement(By.xpath("//a[@id='signup-button']")).click();
		      driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		      driver.findElement(By.xpath("//input[@id='5c5eaba9-fe43-49a0-ae19-08ae547ae80f']")).sendKeys("sathvika");

	}

}























//TAGNAME[@ATTRIBUTE_NAME='ATTRIBUTE_VALUE']
//12.1.
//Go to https://www.mail.com/
//Click on SignUp webelement
//Type FirstName edit box data
