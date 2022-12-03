package testscenarios;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Login {

	public static void main(String[]args) throws Exception {
		// TODO Auto-generated method stub
      WebDriverManager.chromedriver().setup();
       WebDriver driver= new ChromeDriver();
      driver.get(" https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
      //wait statement
      Thread.sleep(5000);
      //type some text to username editbox
      driver.findElement(By.name("username")).sendKeys("Admin");
      driver.findElement(By.name("password")).sendKeys("admin123");
      //click on loginin
      driver.findElement(By.tagName("button")).click();
      //wait statement
      Thread.sleep(5000);
      //click on profile ikon
      driver.findElement(By.className("oxd-userdropdown-name")).click();
      //wait statement
      Thread.sleep(5000);
     //click on logout link
      driver.findElement(By.linkText("Logout")).click();
      
	}
}