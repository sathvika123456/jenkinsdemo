package testscenarios;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assignment4c {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
    WebDriver driver;
    WebDriverManager.chromedriver().setup();
	driver = new ChromeDriver();
	driver.get("https://tirupatibalaji.ap.gov.in/#/registration");
	 //wait statement
      Thread.sleep(6000);
      new Select(driver.findElement(By.name("countryS"))).selectByVisibleText("India");
      new Select(driver.findElement(By.name("stateS"))).selectByVisibleText("Telangana");
      

  }
}