import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class wait {

	public void orderno(WebDriver driver) {
		WebDriverWait wait= new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.presenceOfElementLocated(By.id("order_no")));
		
		WebElement bookednum = driver.findElement(By.id("order_no"));
		String orderno = bookednum.getAttribute("value");
		
		System.out.println("___________________________________________");
		System.out.println("The order no is : " + orderno);
		System.out.println("___________________________________________");
		
	}

	
}
