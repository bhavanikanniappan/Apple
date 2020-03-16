package sele1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class test {
		
	
	public void first(WebDriver driver) {
		driver.get("https://adactin.com/HotelApp/index.php");
		driver.manage().window().maximize();
	}	
	
	public void second(WebDriver driver) {
		
		WebElement user = driver.findElement(By.id("username"));
		user.sendKeys("KBhavani");
		WebElement pass = driver.findElement(By.id("password"));
		pass.sendKeys("123456");
		WebElement click = driver.findElement(By.id("login"));
		click.click();
		String title = driver.getTitle();
		System.out.println(title);
		String url = driver.getCurrentUrl();
		System.out.println(url);
	}

		
	}
