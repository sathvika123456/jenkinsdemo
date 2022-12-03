package testscenarios;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test4 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		 WebDriver driver;
		    WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			 Thread.sleep(3000);
		    driver.manage().window().maximize();
			driver.get("file:///C:/Users/man/Downloads/QE%20-%20index%20(1).html");
		      Thread.sleep(3000);
		      if (driver.findElement(By.xpath("//*[@id=\"test-4-div\"]/button[1]")).isEnabled()) {
		    	  System.out.println("First button is enabled");
			} else {
				System.out.println("First button is not enabled");
			}
		      Thread.sleep(3000);
		     if (driver.findElement(By.xpath("//*[@id=\"test-4-div\"]/button[2]")).isEnabled()) {
		    	 System.out.println("Second button is enabled");
			} else {
				System.out.println("Second button is  disabled");
			} 
		      
		     		      
		      
	}

}
