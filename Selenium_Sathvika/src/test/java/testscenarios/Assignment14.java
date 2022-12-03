package testscenarios;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assignment14 {

	public static void main(String[] args) {
		//https://phptravels.com/demo/
		 WebDriver driver;
		    WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		    driver.manage().window().maximize();
			driver.get("https://phptravels.com/demo/");
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
			//Find Last Name locator,
			 //using this following xpath syntax type "Business Name" value
			 //using this preceding xpath syntax type "First Name" value
            driver.findElement(By.xpath("//*[@name='last_name']//preceding::*[@name='first_name']")).sendKeys("sathvika");
          //using this following xpath syntax type "Business Name" value
            driver.findElement(By.xpath("//*[@name='last_name']//following::input[@name='business_name']")).sendKeys("Ashwin");
            
	}

}
