package testscenarios;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class assignment4a {
        static WebDriver driver;
	public static void main(String[] args) throws Exception {
		//call chrome browser
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://testautomationpractice.blogspot.com/");
		 //wait statement
	      Thread.sleep(6000);
	      // choose droupdown
	      new Select(driver.findElement(By.name("speed"))).selectByVisibleText("Fast");
	      Thread.sleep(1000);
	    
	      new Select(driver.findElement(By.name("files"))).selectByVisibleText("PDF file");
	      Thread.sleep(1000);
	 
	      new Select(driver.findElement(By.name("number"))).selectByVisibleText("4");
	      Thread.sleep(1000);
	    
	      new Select(driver.findElement(By.name("products"))).selectByVisibleText("Iphone");
	      Thread.sleep(1000);
	   
	      new Select(driver.findElement(By.name("animals"))).selectByVisibleText("Baby Cat");
	      
        
	
	}

}
