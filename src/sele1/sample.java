package sele1;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class sample
{
	public static void main (String[] args){
	
	System.setProperty("webdriver.chrome.driver","D:\\Program Files\\chromedrive_32\\chromedriver.exe");
	
	WebDriver driver = new ChromeDriver();
	driver.get("https://opensource-demo.orangehrmlive.com");
	
	WebElement user = driver .findElement(By.id("txtUsername"));
	user.sendKeys("Admin");
	
	WebElement pass = driver .findElement(By.id("txtPassword"));
	pass.sendKeys("admin123");
	
	WebElement click = driver.findElement(By.id("btnLogin"));
	click.click();
	
	String q= driver.getTitle();
	String h = driver.getCurrentUrl();
	driver.getPageSource();
	driver.navigate().back();
	driver.navigate().forward();
	driver.navigate().refresh();
	driver.close();
	driver.quit();
	System.out.println(q + h);
	}
}
