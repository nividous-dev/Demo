package mavenproject.DemoProject;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;

public class NewTest {
	
	WebDriver driver;
 
	@Test
  public void testcase() {
		WebElement userName = driver.findElement(By.xpath("//*[@id='txtUsername']"));
		userName.sendKeys("Admin");
		WebElement password = driver.findElement(By.xpath("//*[@id='txtPassword']"));
		password.sendKeys("admin123");
		WebElement loginbtn = driver.findElement(By.xpath("//*[@id='txtPassword']//following::input[1]"));
		loginbtn.click();
		
  }
	
  @BeforeMethod
  public void beforeMethod() {
	  System.setProperty("webdriver.chrome.driver", "Resources/chromedriver.exe");
	  driver = new ChromeDriver();
	  driver.get("https://opensource-demo.orangehrmlive.com/");
	  driver.manage().window().maximize();
  }

  @AfterMethod
  public void afterMethod() {
	  
//	  driver.quit();
  }

}
