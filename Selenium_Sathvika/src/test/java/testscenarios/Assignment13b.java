package testscenarios;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assignment13b {

	public static void main(String[] args) {
	//https://opensource-demo.orangehrmlive.com/web/index.php/auth/login
		 WebDriver driver;
		    WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		    driver.manage().window().maximize();
			driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
      //wihtout fill any data click on Login button
            driver.findElement(By.xpath("//button[@class='oxd-button oxd-button--medium oxd-button--main orangehrm-login-button']")).click();
      //Get the Password error mesage and print it into console
			String pswderrormsg = driver.findElement(By.xpath("(//span[@class='oxd-text oxd-text--span oxd-input-field-error-message oxd-input-group__message'])[2]")).getText();
			System.out.println(pswderrormsg);
    //Refresh the screen by using navigation method
			 driver.navigate().refresh();
			 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	 //Thenk Enter the below details by using XPATH locators
			 driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Admin");
			 driver.findElement(By.xpath("//input[@name='password']")).sendKeys("admin123");
	 //Then click on Login button
			 driver.findElement(By.xpath("//button[@class='oxd-button oxd-button--medium oxd-button--main orangehrm-login-button']")).click();
	//"PIM" text is displayed or not? validate it	 
			 if (driver.findElement(By.xpath("//h6[@class='oxd-text oxd-text--h6 oxd-topbar-header-breadcrumb-module']")).isDisplayed()) {
				 System.out.println("PIM is displayed");
			} else {
				System.out.println("PIM is not displayed");
			}
	}

} 


