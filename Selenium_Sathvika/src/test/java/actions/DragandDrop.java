package actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class DragandDrop {
	WebDriver driver;
  @Test
  public void f() throws Exception {
	  driver =  new ChromeDriver();
	  driver.get("https://demo.guru99.com/test/drag_drop.html");
	  driver.manage().window().maximize();
	  Thread.sleep(5000);
	  Actions act = new Actions(driver);
	 WebElement source1 = driver.findElement(By.xpath("//*[@id=\"credit2\"]/a"));
	 WebElement target1 = driver.findElement(By.className("placeholder"));
	 act.dragAndDrop(source1, target1).perform();
	 Thread.sleep(3000);
	 WebElement source2 = driver.findElement(By.xpath("//*[@id=\"fourth\"]/a"));
	 WebElement target2 = driver.findElement(By.className("placeholder"));
	 act.dragAndDrop(source2, target2).perform();
	 Thread.sleep(3000);
	 WebElement source3 = driver.findElement(By.xpath("//*[@id=\"credit1\"]/a"));
	 WebElement target3 = driver.findElement(By.className("placeholder"));
	 act.dragAndDrop(source3, target3).perform();
	 Thread.sleep(3000);
	WebElement source4 = driver.findElement(By.xpath("//*[@id=\"fourth\"]/a"));
	 WebElement target4 = driver.findElement(By.className("placeholder"));
	 act.dragAndDrop(source4, target4).perform();
	 

	 
	  
  }
}
//[8:32 pm, 23/11/2022] +91 99855 58912: Please do practice DRAG and DROP
//[8:32 pm, 23/11/2022] +91 99855 58912: https://demo.guru99.com/test/drag_drop.html
