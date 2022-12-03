package testscenarios;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.server.handler.FindElement;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test5 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		 WebDriver driver;
		    WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			 Thread.sleep(3000);
		    driver.manage().window().maximize();
			driver.get("file:///C:/Users/man/Downloads/QE%20-%20index%20(1).html");
		      Thread.sleep(3000);
		      driver.findElement(By.xpath("//*[@id=\"test5-button\"]")).click();
		      Thread.sleep(3000);
		      if (driver.findElement(By.xpath("//*[@id=\"test5-alert\"]")).isDisplayed()) {
				System.out.println("message displayed");
			} else {
				System.out.println("message not displayed");
			}
		      if (driver.findElement(By.xpath("//*[@id=\"test5-button\"]")).isEnabled()) {
			    	 System.out.println(" button is not disabled");
				} else {
					System.out.println("button is  disabled");
				}		      
		      
	      
	}

}
