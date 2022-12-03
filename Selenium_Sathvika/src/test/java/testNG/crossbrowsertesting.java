package testNG;

import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import io.github.bonigarcia.wdm.managers.EdgeDriverManager;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;

public class crossbrowsertesting {
	WebDriver driver;
     @Parameters("browserName")
	 @BeforeClass
	  public void beforeClass(@Optional("chrome") String browserName) {
    	 if (browserName.equalsIgnoreCase("Edge")) {
    		  driver =  new EdgeDriver();
		} else if (browserName.equalsIgnoreCase("chrome")) {
            driver  =  new ChromeDriver();
			    driver.manage().window().maximize();
		}else {
			System.out.println("please give browser name");
		}
	  }
  @Test
  public void f() throws Exception {
	   driver.get("https://www.facebook.com/");
       Thread.sleep(5000);
       driver.findElement(By.id("email")).sendKeys("sathvikakanjiwkkerla6@gmail.com");
       driver.findElement(By.name("pass")).sendKeys("sathvika5599jsi");
       driver.findElement(By.name("login")).click();
       
  }
  @AfterClass
  public void afterClass() {
	  driver.quit();
  }

}
