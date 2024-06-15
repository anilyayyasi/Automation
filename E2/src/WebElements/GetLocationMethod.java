package WebElements;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetLocationMethod
{
	public static void main(String[] args)
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		WebElement un = driver.findElement(By.id("email"));
		Point loc = un.getLocation();
		int x = loc.getX();
		System.out.println(x);
		int y = loc.getY();
		System.out.println(y);
		driver.quit();
	}
}
