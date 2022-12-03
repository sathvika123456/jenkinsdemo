package actions;

import java.io.File;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.Test;

public class mousemove {
	WebDriver driver;

  @Test
  public void f() throws Exception {
	  driver =  new ChromeDriver();
	  driver.get("https://www.amazon.com/");
	  driver.manage().window().maximize();
	  Thread.sleep(10000);
	  Actions act = new Actions(driver);
	  act.moveToElement(driver.findElement(By.xpath("//*[@id=\"nav-link-accountList\"]/span"))).perform();
	  Date d = new Date();
		DateFormat abcd = new SimpleDateFormat("ddMMMyyyy_HHmmss");
		String timeStamp = abcd.format(d);
		File abc =  ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileHandler.copy(abc,new File(".\\screenshots\\test_"+timeStamp+".png"));
  }
 }

