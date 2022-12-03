package testscenarios;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test3 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		 WebDriver driver;
		    WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			 Thread.sleep(3000);
		    driver.manage().window().maximize();
			driver.get("file:///C:/Users/man/Downloads/QE%20-%20index%20(1).html");
		      Thread.sleep(3000);       
		   driver.findElement(By.xpath("//*[@id=\"dropdownMenuButton\"]")).getText();
		   System.out.println("option 1 is the default selected item");
		   driver.findElement(By.xpath("//*[@id=\"dropdownMenuButton\"]")).click();
		   driver.findElement(By.linkText("Option 3")).click();
		   
		
		
		
	}

}
