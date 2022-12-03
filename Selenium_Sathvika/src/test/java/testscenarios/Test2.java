package testscenarios;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		 WebDriver driver;
		    WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			 Thread.sleep(3000);
		    driver.manage().window().maximize();
			driver.get("file:///C:/Users/man/Downloads/QE%20-%20index%20(1).html");
		      Thread.sleep(3000);
		      if (driver.findElement(By.xpath("//*[@id=\"test-2-div\"]/ul/li[1]")).isDisplayed()) {
				System.out.println("Given element is displayed");
			} else {
				System.out.println("Given element is not displayed");
			}
		      if (driver.findElement(By.xpath("//*[@id=\"test-2-div\"]/ul/li[2]")).isDisplayed()) {
					System.out.println("Given element is displayed");
				} else {
					System.out.println("Given element is not displayed");
				} 
		      if (driver.findElement(By.xpath("//*[@id=\"test-2-div\"]/ul/li[3]")).isDisplayed()) {
					System.out.println("Given element is displayed");
				} else {
					System.out.println("Given element is not displayed");
				} 
		      Thread.sleep(3000);
		    driver.findElement(By.xpath("//*[@id=\"test-2-div\"]/ul/li[2]")).isDisplayed();
		    String  a =  (driver.findElement(By.xpath("//*[@id=\"test-2-div\"]/ul/li[2]")).getText());
		    System.out.println("a");
		    Thread.sleep(3000);
		    if (a.contains("List Item 2")) {
		    	System.out.println("value is set");
			} else{
				System.out.println("value is set");
			}
		    Thread.sleep(3000);
	       // driver.findElement(By.xpath("//*[@id=\"test-2-div\"]/ul/li[2]/span")).getText();
	      //  System.out.println("badge value is 6");
		   String abc = " badge value is 6";
		   if (abc.contains("6")) {
			   System.out.println("badge value is 6");
		} else {
			 System.out.println("badge value is 6");
		}

	}
}

