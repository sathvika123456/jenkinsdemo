package testscenarios;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assignment9 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		 WebDriver driver;
		    WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		    driver.manage().window().maximize();
			driver.get("https://collegeweeklive.com/go-signup/");
			 //wait statement
		      Thread.sleep(4000);
		      driver.findElement(By.id("submit")).click();
		      Thread.sleep(2000);
		      String NameerrorMsg  =  driver.findElement(By.className("formValidationMessage")).getText();
		      System.out.println(NameerrorMsg);
		      String LastnameerrorMsg  =  driver.findElement(By.xpath("//*[@id=\"lastNameError\"]/span")).getText();
			  System.out.println(LastnameerrorMsg);
		      String EmailerrorMsg  =  driver.findElement(By.xpath("//*[@id=\"emailAddressError\"]/span")).getText();
		      System.out.println(EmailerrorMsg);
		      String PhnerrorMsg  =  driver.findElement(By.xpath("//*[@id=\"phoneNumberError\"]/span")).getText();
		      System.out.println(PhnerrorMsg);
		      String PswderrorMsg  =  driver.findElement(By.xpath("//*[@id=\"passwordError\"]/span")).getText();
		      System.out.println(PswderrorMsg);
		      String ConfirmpswderrorMsg  =  driver.findElement(By.xpath("//*[@id=\"ConfirmPasswordError\"]")).getText();
		      System.out.println(ConfirmpswderrorMsg);
		      String CountryerrorMsg  =  driver.findElement(By.xpath("//*[@id=\"nationalityError\"]/span")).getText();
		      System.out.println(CountryerrorMsg);
		      String IamerrorMsg  =  driver.findElement(By.xpath("//*[@id=\"attendeeTypeError\"]/span")).getText();
		      System.out.println(IamerrorMsg);
		      String CheckboxerrorMsg  =  driver.findElement(By.xpath("//*[@id=\"questions_137Error\"]/span")).getText();
		      System.out.println(CheckboxerrorMsg);
		      driver.quit();
		     
		  	      
	}

}
