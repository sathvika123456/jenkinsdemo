package testscenarios;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test1 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		 WebDriver driver;
		    WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			 Thread.sleep(3000);
		    driver.manage().window().maximize();
			driver.get("file:///C:/Users/man/Downloads/QE%20-%20index%20(1).html");
		      Thread.sleep(3000);
		      if (driver.findElement(By.id("inputEmail")).isDisplayed()) {
			      System.out.println("The given element is displayed");
			} else {
				  System.out.println("The given element is not displayed");
			}
		      if (driver.findElement(By.id("inputPassword")).isDisplayed()) {
			      System.out.println("The given element is displayed");
			} else {
				  System.out.println("The given element is not displayed");
			}
		      if (driver.findElement(By.xpath("//*[@id=\"test-1-div\"]/form/button")).isDisplayed()) {
			      System.out.println("The given element is displayed");
			} else {
				  System.out.println("The given element is not displayed");
			}
		      Thread.sleep(3000);
		     driver.findElement(By.id("inputEmail")).sendKeys("sathvikakakkerla6@gmail.com");
		     driver.findElement(By.id("inputPassword")).sendKeys("srisaibaba6699");
		     Thread.sleep(5000);
		     driver.findElement(By.xpath("//*[@id=\"test-1-div\"]/form/button")).click();
		     
		      
		    	      
	}

}
