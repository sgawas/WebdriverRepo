package auto;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class test {
	
	@BeforeSuite
	public void setUp(){
		
		System.out.println("this is before suite method");
	}
	
//	public static void main(String[] args) {
//		
//		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sgawas\\Desktop\\chromedriver.exe");
//		WebDriver driver= new ChromeDriver();
//		driver.get("https://www.google.com/intl/en/mail/help/about.html");
//		driver.close();
//
//	}


	@Test
	public void doLogin(){
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://gmail.com");
		//driver.findElement(By.xpath("//*[@id='gmail-sign-in']")).click();
		driver.findElement(By.xpath("//*[@id='Email']")).sendKeys("suraj@gmail.com");
		driver.findElement(By.xpath("//*[@id='next']")).click();
		driver.findElement(By.id("Passwd")).sendKeys("suraj1310");
		driver.findElement(By.id("signIn")).click();
		System.out.println("test is passed");
		driver.close();
		driver.quit();
	}
	
//	@AfterSuite
//	public void tearDown(){
//		driver.close();
//		driver.quit();
//	}

}
