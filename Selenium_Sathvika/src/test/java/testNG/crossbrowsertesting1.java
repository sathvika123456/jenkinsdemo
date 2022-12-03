package testNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class crossbrowsertesting1 {
	WebDriver driver;

	@Parameters("browserName")
	@BeforeClass // Pre-condition
	public void beforeClass(@Optional("Chrome") String browserName) {
		if (browserName.equalsIgnoreCase("Edge")) {
			driver = new EdgeDriver();
		} else if (browserName.equalsIgnoreCase("Firefox")) {
			driver = new FirefoxDriver();
		} else if (browserName.equalsIgnoreCase("chrome")) {
			driver = new ChromeDriver();
			driver.manage().window().maximize();
		} else {
			System.out.println("Please give browser name chrome/edge/firefox only......");
		}

	}

	@Test // Actual functionality
	public void loginFB() {
		// Type URL in a browser
		driver.get("https://www.facebook.com/");
		driver.findElement(By.name("email")).sendKeys("asuifhkj324cfds@gmail.com");
		driver.findElement(By.name("pass")).sendKeys("Testdsfing@123");
		driver.findElement(By.name("login")).click();
	}

	@AfterClass // Post-condition
	public void afterClass() {
		driver.quit();
	}

}
