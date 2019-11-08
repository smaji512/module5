package edureka.co.Test_id;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class NewTest {
  @Test
  public void verifylogin() {
	  System.setProperty("webdriver.gecko.driver","/home/ubuntu/geckodriver");
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("http://localhost:3001/");
		driver.manage().window().maximize();
		driver.findElement(By.name("login")).sendKeys("Testuser");
		driver.findElement(By.name("password")).sendKeys("TestPWD");
		driver.findElement(By.name("click")).click();
		String x = driver.getTitle();
		System.out.println(x);
  }
}
