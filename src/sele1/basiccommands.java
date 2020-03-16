package sele1;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class basiccommands {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver","D:\\Program Files\\chromedrive_32\\chromedriver.exe");
		
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		
		WebElement click = driver.findElement(By.name("proceed"));
		click.click();
		
		Alert a1 = driver.switchTo().alert();
		a1.accept();
	String g= 	a1.getText();
	System.out.println(g);
	//driver.close();
	//driver.quit();
	}
}
