package WebElements;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RightClick
{
public static void main(String[] args)
{
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://google.com/");
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	WebElement rc = driver.findElement(By.name("q"));
	
	Actions act = new Actions(driver);
	act.contextClick(rc).perform();
	
}
}
