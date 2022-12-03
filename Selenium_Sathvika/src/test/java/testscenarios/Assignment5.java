package testscenarios;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assignment5 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		 WebDriver driver;
		    WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			driver.get("	https://blazedemo.com/");
			 //wait statement
		      Thread.sleep(6000);
		     new Select(driver.findElement(By.xpath("/html/body/div[3]/form/select[1]"))).selectByVisibleText("Boston");
		     new Select(driver.findElement(By.xpath("/html/body/div[3]/form/select[2]"))).selectByVisibleText("London");
		     driver.findElement(By.xpath("/html/body/div[3]/form/div/input")).click();
		     Thread.sleep(2000);
		      driver.findElement(By.xpath("/html/body/div[2]/table/tbody/tr[2]/td[1]/input")).click();
		      driver.findElement(By.name("inputName")).sendKeys("sathvika");
		      driver.findElement(By.name("address")).sendKeys("48");
		      driver.findElement(By.id("city")).sendKeys("barrie");
		      driver.findElement(By.id("state")).sendKeys("ontario");
		      driver.findElement(By.id("zipCode")).sendKeys("123456");
		      Thread.sleep(2000);
		      new Select(driver.findElement(By.id("cardType"))).selectByVisibleText("American Express");
		      driver.findElement(By.id("creditCardNumber")).sendKeys("0236501564");
		      driver.findElement(By.id("creditCardMonth")).sendKeys("05");
		      driver.findElement(By.id("creditCardYear")).sendKeys("2018");
		      driver.findElement(By.id("nameOnCard")).sendKeys("sathvika kakkerla");
		      driver.findElement(By.name("rememberMe")).click();
		      driver.findElement(By.xpath("/html/body/div[2]/form/div[11]/div/input")).click();
		      
		      
		      
		      
		      
		      
		     
		     
		     

	}

}
