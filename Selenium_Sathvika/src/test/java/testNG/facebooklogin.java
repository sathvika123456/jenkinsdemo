package testNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class facebooklogin {
	WebDriver driver;

  @Test
  public void f() {
	  
	  driver = new ChromeDriver();
	  driver.get("https://www.facebook.com/");
  }
}
