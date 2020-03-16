import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class mainurl {

	public void login(WebDriver driver) {
		driver.get("https://adactin.com/HotelApp/index.php");
		driver.manage().window().maximize();
	
	}

	public WebElement loginpassword(WebDriver driver) {
		WebElement user = driver.findElement(By.id("username"));
		user.sendKeys("KBhavani");
		WebElement pass = driver.findElement(By.id("password"));
		pass.sendKeys("123456");
		WebElement click = driver.findElement(By.id("login"));		
		//click.click();
		
		//mainurl obj = new mainurl();
		//obj.click(click);
//		
//		String title = driver.getTitle();
//		String url = driver.getCurrentUrl();
//		WebElement log = driver.findElement(By.id("username_show"));
//		String logged = log.getAttribute("value");
//		System.out.println("___________________________________________");
//		System.out.println("The url of the page is: " + url);
//		System.out.println("Title of the page is: " + title);
//		System.out.println("user logged to the page was : " + logged);
//		System.out.println("___________________________________________");
return click;
	
	}
	
		
	}

