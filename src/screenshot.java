import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.io.FileHandler;

public class screenshot {

	public void image(WebDriver driver) throws IOException {
		JavascriptExecutor j1 = (JavascriptExecutor) driver;
		WebElement ordernodisplay = driver.findElement(By.id("order_no"));
		j1.executeScript("arguments[0].scrollIntoView(true);", ordernodisplay);
		// j1.executeScript("window.scrollby(0,1200)");
		TakesScreenshot tk = (TakesScreenshot) driver;
		File f1 = tk.getScreenshotAs(OutputType.FILE);
		File f2 = new File("D:\\classordernoscreenshot.jpg");
		FileHandler.copy(f1, f2);
		WebElement logout = driver.findElement(By.id("logout"));
		logout.click();
		driver.close();
		
		
	}

}
