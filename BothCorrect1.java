package loginTetcase1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class BothCorrect1 {
	@Test
	public void loginwithcorrectusername() {


System.setProperty("webdriver.chrome.driver", "C:\\javasel\\New folder\\seleniumwork Data\\Seleniumwrk\\driver\\chromedriver.exe");
	
	WebDriver driver=new ChromeDriver();
driver.get("https://opensource-demo.orangehrmlive.com/");

WebElement txtUsername =driver.findElement(By.id("txtUsername"));

txtUsername.sendKeys("admin");

WebElement txtPassword=driver.findElement(By.id("txtPassword"));
txtPassword.sendKeys("admin123");

WebElement login=driver.findElement(By.id("btnLogin"));
login.clear();
driver.quit();
}

}

