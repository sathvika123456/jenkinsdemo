package testscenarios;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assignment4b {
       static WebDriver driver;
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
     WebDriverManager.chromedriver().setup();
     driver = new ChromeDriver();
     driver.get("https://collegeweeklive.com/go-signup/");
		//wait statement
		Thread.sleep(6000);
		//choose backdrop
		new Select(driver.findElement(By.name("attendeeType"))).selectByVisibleText("Student Looking for Graduate Degree");
		
	}

}
