package testscenarios;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assignment7 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		 WebDriver driver;
		    WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		    driver.manage().window().maximize();
			driver.get("https://www.facebook.com/");
			 //wait statement
		      Thread.sleep(4000);
		      driver.findElement(By.id("email")).sendKeys("sathvikaddl3jii");
		      driver.findElement(By.id("pass")).sendKeys("5446318");
		      driver.findElement(By.name("login")).click();
		      String errorMsg  =  driver.findElement(By.className("_9ay7")).getText();
		      System.out.println(errorMsg);
		      driver.quit();		      
	}

}
