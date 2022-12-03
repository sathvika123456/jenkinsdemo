package testscenarios;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FacebookLogin {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
         WebDriverManager.chromedriver().setup();
         WebDriver driver =  new ChromeDriver();
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
