import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class automationpratice {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","D:\\Program Files\\chromedrive_32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://automationpractice.com/index.php");
		Actions ac = new Actions(driver);
		ac.moveToElement(driver.findElement(By.xpath("//input[@class='submenu-container clearfix first-in-line-xs'][a[@title='Women']"))).build().perform();
		ac.doubleClick().build().perform();
		ac.contextClick().build().perform();
		

	}

}
