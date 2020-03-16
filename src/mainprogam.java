import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class mainprogam {

	public static void main(String[] args) throws IOException {
		
		System.setProperty("webdriver.chrome.driver", "D:\\Program Files\\chromedrive_32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
	   mainurl mainurl= new mainurl();
	   action action = new action();
//	   dropdown dropdown = new dropdown();
//	   submitradio submitradio = new submitradio();
//	   wait wait = new wait();
//	   screenshot screenshot = new screenshot();
//	   
		mainurl.login(driver);	
		WebElement click = mainurl.loginpassword(driver);
		
action.click(click);
//		dropdown.selectvalues(driver);
//		submitradio.submit(driver);
//		submitradio.radiobuttonclick(driver);
//	submitradio.lastpage(driver);
//	wait.orderno(driver);
//	screenshot.image(driver);
	}
}