package test;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;

import java.sql.Driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;

public class NewTest {
	WebDriver driver ;
	@Test
  public void f() {
  }
  @BeforeMethod
  public void beforeMethod() {
	  driver= new ChromeDriver();
	  driver.get("https://www.youtube.com/");
  }

  @AfterMethod
  public void afterMethod() {
	  driver.quit();
	  
  }

}
