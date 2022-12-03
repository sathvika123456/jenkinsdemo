package actions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class movetoelements {
	WebDriver driver;

  @Test
  public void f() {
	  WebDriver  driver =  new ChromeDriver();
	  driver.get("https://www.facebook.com/");

  }
}
