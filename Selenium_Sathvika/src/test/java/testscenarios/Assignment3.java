package testscenarios;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assignment3 {
      static  WebDriver driver;
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://collegeweeklive.com/go-signup/");
		//wait statement
		Thread.sleep(6000);
		// type some text to editboxes
		driver.findElement(By.name("firstName")).sendKeys("sathvika");
		driver.findElement(By.name("lastName")).sendKeys("kakkerla");
		driver.findElement(By.name("emailAddress")).sendKeys("sathvikakakkerla6@gmail.com");
		driver.findElement(By.name("phoneNumber")).sendKeys("4379896799");
		driver.findElement(By.id("password")).sendKeys("advaitha");
		driver.findElement(By.name("ConfirmPassword")).sendKeys("advaitha");
		// click on check boxes
		driver.findElement(By.id("questions[q_135]")).click();
		driver.findElement(By.id("questions[q_136]")).click();
		driver.findElement(By.id("questions[q_137]")).click();
		driver.findElement(By.id("submit")).click();
		
         
	
	}
}
