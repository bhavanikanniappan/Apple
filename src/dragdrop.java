import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class dragdrop {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\Program Files\\chromedrive_32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.seleniumeasy.com/test/drag-and-drop-demo.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Actions ac = new Actions(driver);
		driver.switchTo().frame(driver.findElement(By.className("w25 moveleft")));
		WebElement drag = driver.findElement(By.name("Draggable 1"));
		WebElement drop = driver.findElement(By.id("mydropzone"));
		ac.dragAndDrop(drag, drop).build().perform();

	}

}
