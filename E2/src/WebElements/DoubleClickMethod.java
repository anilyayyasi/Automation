package WebElements;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.chrome.ChromeDriver;

public class DoubleClickMethod
{
public static void main(String[] args) throws InterruptedException
{
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://demoapp.skillrary.com/");
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	WebElement crs = driver.findElement(By.xpath("//a[text()='COURSE']"));
	
	Actions act = new Actions(driver);
	act.moveToElement(crs).perform();
	Thread.sleep(3000);
	driver.findElement(By.xpath("(//a[text()='Selenium'])[1]")).click();
	Thread.sleep(3000);
	WebElement pls = driver.findElement(By.id("add"));
	act.doubleClick(pls).perform();
	driver.close();
}
}
