package testscenarios;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assignment10 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		 WebDriver driver;
		    WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			 Thread.sleep(3000);
		    driver.manage().window().maximize();
			driver.get("https://demoqa.com/alerts");
			 //wait statement
		      Thread.sleep(3000);
		      driver.findElement(By.id("alertButton")).click(); 
		      Thread.sleep(3000);
		      System.out.println(driver.switchTo().alert().getText());
		      driver.switchTo().alert().accept();
		      driver.findElement(By.id("timerAlertButton")).click(); 
		      Thread.sleep(6000);
		      System.out.println(driver.switchTo().alert().getText());
		      driver.switchTo().alert().accept();
		      driver.findElement(By.id("confirmButton")).click(); 
		      Thread.sleep(3000);
		      System.out.println(driver.switchTo().alert().getText());
		      Thread.sleep(3000);
		      driver.switchTo().alert().dismiss();
		      System.out.println( driver.findElement(By.className("text-success")).getText());
		      
		      
		      
		         

	}

}
