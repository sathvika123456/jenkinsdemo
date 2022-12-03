package testscenarios;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assignment8 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		 WebDriver driver;
		    WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		    driver.manage().window().maximize();
			driver.get("https://myaccount.greenmountain.com/en_US/register");
			 //wait statement
		      Thread.sleep(4000);
		      driver.findElement(By.linkText("Contact Us")).click();
		      driver.close();
		      
		         
	}

}
