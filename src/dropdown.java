import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class dropdown {
	public void selectvalues(WebDriver driver) {
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
		}
	}
