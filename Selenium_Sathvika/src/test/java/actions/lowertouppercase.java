package actions;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class lowertouppercase {
	WebDriver driver;
  @Test
  public void f() throws Exception {
	  driver =  new ChromeDriver();
	  driver.get("https://www.google.com/");
	  driver.manage().window().maximize();
	  Thread.sleep(5000);
	  Actions act = new Actions(driver);
	  act.moveToElement(driver.findElement(By.className("gLFyf"))).click().keyDown(Keys.SHIFT).sendKeys("selenium").build().perform();
  }
}
