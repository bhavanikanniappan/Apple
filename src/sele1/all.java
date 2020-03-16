package sele1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class all {


	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\Program Files\\chromedrive_32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
	    test obj = new test();
		obj.first(driver);
		
		obj.second(driver);
			}
}