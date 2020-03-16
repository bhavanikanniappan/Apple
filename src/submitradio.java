import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class submitradio {

	public void submit(WebDriver driver) {
		WebElement submit = driver.findElement(By.id("Submit"));
		submit.click();
	
		
	}

	public void radiobuttonclick(WebDriver driver) {
		WebElement radio = driver.findElement(By.id("radiobutton_0"));
		radio.click();
		WebElement continueb = driver.findElement(By.id("continue"));
		continueb.click();
		
		
	}

	public void lastpage(WebDriver driver) {
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
		
		
	}

}
