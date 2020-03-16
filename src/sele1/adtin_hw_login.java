package sele1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class adtin_hw_login {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "D:\\Program Files\\chromedrive_32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://adactin.com/HotelApp/index.php");
		driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		
		
		
		WebElement user = driver.findElement(By.id("username"));
		user.sendKeys("KBhavani");
		WebElement pass = driver.findElement(By.id("password"));
		pass.sendKeys("123456");
		WebElement click = driver.findElement(By.id("login"));
		click.click();
		String title = driver.getTitle();
		String url = driver.getCurrentUrl();
		WebElement log = driver.findElement(By.id("username_show"));
		String logged = log.getAttribute("value");
		WebElement location = driver.findElement(By.name("location"));
		Select obj = new Select(location);
		obj.selectByValue("Adelaide");
		WebElement hotels = driver.findElement(By.id("hotels"));
		Select obj1 = new Select(hotels);
		obj1.selectByValue("Hotel Creek");
		WebElement roomtype = driver.findElement(By.id("room_type"));
		Select obj2 = new Select(roomtype);
		obj2.selectByValue("Double");
		WebElement roomnos = driver.findElement(By.id("room_nos"));
		Select obj3 = new Select(roomnos);
		obj3.selectByValue("2");
		WebElement adultroom = driver.findElement(By.id("adult_room"));
		Select obj4 = new Select(adultroom);
		obj4.selectByValue("3");
		WebElement childroom = driver.findElement(By.id("child_room"));
		Select obj5 = new Select(childroom);
		obj5.selectByValue("2");
		WebElement submit = driver.findElement(By.id("Submit"));
		submit.click();
		WebElement radio = driver.findElement(By.id("radiobutton_0"));
		radio.click();
		WebElement continueb = driver.findElement(By.id("continue"));
		continueb.click();
		WebElement firstname = driver.findElement(By.id("first_name"));
		firstname.sendKeys("ravi");
		WebElement lastname = driver.findElement(By.id("last_name"));
		lastname.sendKeys("kumar");
		WebElement billingaddress = driver.findElement(By.id("address"));
		billingaddress.sendKeys("perugalathur");
		WebElement cardno = driver.findElement(By.id("cc_num"));
		cardno.sendKeys("2456987563248569");
		WebElement cardtype = driver.findElement(By.id("cc_type"));
		Select obj6 = new Select(cardtype);
		obj6.selectByValue("VISA");
		WebElement month = driver.findElement(By.id("cc_exp_month"));
		Select obj7 = new Select(month);
		obj7.selectByValue("4");
		WebElement year = driver.findElement(By.id("cc_exp_year"));
		Select obj8 = new Select(year);
		obj8.selectByValue("2022");
		WebElement cvv = driver.findElement(By.id("cc_cvv"));
		cvv.sendKeys("1234");
		WebElement book = driver.findElement(By.id("book_now"));
		book.click();
		
		WebDriverWait wait= new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.presenceOfElementLocated(By.id("order_no")));
		
		WebElement bookednum = driver.findElement(By.id("order_no"));
		String orderno = bookednum.getAttribute("value");
		WebElement logout = driver.findElement(By.id("logout"));
		logout.click();
		driver.close();
    	System.out.println("___________________________________________");
		System.out.println("The url of the page is: " + url);
		System.out.println("Title of the page is: " + title);
		System.out.println("user logged to the page was : " + logged);
		System.out.println("___________________________________________");
		
		
		System.out.println("___________________________________________");
		System.out.println("The order no is : " + orderno);
		System.out.println("___________________________________________");
	}
}
