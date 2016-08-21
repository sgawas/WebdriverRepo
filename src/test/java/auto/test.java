package auto;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.firefox.FirefoxDriver;

import org.testng.annotations.Test;

public class test {
	
	


	@Test
	public void doLogin(){
		//System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://gmail.com");
		//driver.findElement(By.xpath("//*[@id='gmail-sign-in']")).click();
		driver.findElement(By.xpath("//*[@id='Email']")).sendKeys("ntester26@gmail.com");
		driver.findElement(By.xpath("//*[@id='next']")).click();
		driver.findElement(By.id("Passwd")).sendKeys("quality26");
		driver.findElement(By.id("signIn")).click();
		System.out.println("test is passed");
		driver.close();
		driver.quit();
	}
	


}
