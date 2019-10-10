package test;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;

public class NewTest2 {
	WebDriver driver;
	@Test
  public void f() {
  }
  @BeforeMethod
  public void beforeMethod() {
	  driver = new ChromeDriver();
	  driver.get("https://www.youtube.com/watch?v=0CFWeVgzsqY");
  }

  @AfterMethod
  public void afterMethod() {
	  driver.quit();
  }

}
