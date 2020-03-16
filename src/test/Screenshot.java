package test;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Screenshot {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", "D:\\Program Files\\chromedrive_32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://automationpractice.com/index.php");
		driver.manage().window().maximize();
		// driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
	
		JavascriptExecutor js= (JavascriptExecutor)driver;
		//particular element
		WebElement ele=driver.findElement(By.id("newsletter-input"));
		js.executeScript("arguments[0].scrollIntoView(true);",ele);
		
		//random scroll using pixels range
		
		//js.executeScript("window.scrollBy(0,1200)");
		
				
	}
}
