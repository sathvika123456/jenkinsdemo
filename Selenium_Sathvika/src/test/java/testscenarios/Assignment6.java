package testscenarios;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assignment6 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		 WebDriver driver;
		    WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		    driver.manage().window().maximize();
			driver.get("https://www.justrechargeit.com/");
			 //wait statement
		      Thread.sleep(6000);
		      driver.findElement(By.linkText("Sign in")).click();
		      Thread.sleep(2000);
		      driver.findElement(By.name("txtUserName")).sendKeys("anjdeifhbvjrujdscbj");
	          Thread.sleep(2000);
	          driver.findElement(By.name("txtPasswd")).sendKeys("1845684848");
	          Thread.sleep(2000);
	          driver.navigate().refresh();
	          Thread.sleep(2000);
	          driver.navigate().back();
	          Thread.sleep(2000);
	          driver.navigate().forward();
	          Thread.sleep(2000);
	          driver.quit();
	          
		      
		      
		      
		      
		      
		      
		      
		      
		      
		      
		      
		      
		      
		      
		      
	}

}
