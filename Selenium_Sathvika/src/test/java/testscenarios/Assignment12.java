package testscenarios;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assignment12 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		  //  open https://opencart-prf.exense.ch/
		 WebDriver driver;
		    WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			 Thread.sleep(3000);
		    driver.manage().window().maximize();
			driver.get("https://opencart-prf.exense.ch/");
			 //wait statement
		      Thread.sleep(3000);   
		       //	  type "iphone" in search box then click on Search icon
		      driver.findElement(By.name("search")).sendKeys("iphone");
		      driver.findElement(By.xpath("//*[@id=\"search\"]/span/button/i")).click();
		       //	  CLick on Add to cart button
		      driver.findElement(By.xpath("//*[@id=\"content\"]/div[3]/div/div/div[2]/div[2]/button[1]/i")).click();
		      Thread.sleep(3000);
		       //	  Clikc on Cart icon then click on Checkout object
		      driver.findElement(By.id("cart-total")).click();
		      driver.findElement(By.xpath("//*[@id=\"cart\"]/ul/li[2]/div/p/a[2]/strong")).click();
		      Thread.sleep(3000);
		    //	  Choose Guest radio button
		      driver.findElement(By.xpath("//*[@id=\"collapse-checkout-option\"]/div/div/div[1]/div[2]/label/input")).click();
		      driver.findElement(By.xpath("//*[@id=\"button-account\"]")).click();
		      Thread.sleep(3000);
		    //	  Fill all the data(Invalid/Dummy data)
		      driver.findElement(By.name("firstname")).sendKeys("sathvika");
		      driver.findElement(By.name("lastname")).sendKeys("kakkerla");
		      driver.findElement(By.xpath("//*[@id=\"input-payment-email\"]")).sendKeys("jsduduedbjbu@gmail.com");
		      driver.findElement(By.name("telephone")).sendKeys("9632145879");
		      driver.findElement(By.name("company")).sendKeys("home");
		      driver.findElement(By.name("address_1")).sendKeys("465 st");
		      driver.findElement(By.name("address_2")).sendKeys("door 2");
		      driver.findElement(By.name("city")).sendKeys("toronto");
		      driver.findElement(By.name("postcode")).sendKeys("506002");
		      new Select(driver.findElement(By.name("country_id"))).selectByVisibleText("Canada");
		      Thread.sleep(3000);
		      new Select(driver.findElement(By.id("input-payment-zone"))).selectByVisibleText("British Columbia");
		      Thread.sleep(3000);
		      driver.findElement(By.xpath("//*[@id=\"button-guest\"]")).click();
		      Thread.sleep(3000);
		    //	  Checkout
		      driver.findElement(By.name("comment")).sendKeys("done");
		      driver.findElement(By.xpath("//*[@id=\"button-shipping-method\"]")).click();
		      Thread.sleep(2000);
		      driver.findElement(By.xpath("//*[@id=\"collapse-payment-method\"]/div/div[2]/div/input[1]")).click();
		    //	  Step 1: Checkout Options 
		      driver.findElement(By.xpath("//*[@id=\"button-payment-method\"]")).click();
		      Thread.sleep(2000);
		    //	  Step 2: Account & Billing Details
		    //Step 3: Delivery Details
		  //	  Step 4: Delivery Method
		    //	  Step 5: Payment Method
		    //	  Step 6: Confirm Order 
		      driver.findElement(By.xpath("//*[@id=\"button-confirm\"]")).click();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
