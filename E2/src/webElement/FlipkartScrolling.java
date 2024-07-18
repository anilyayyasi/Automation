package webElement;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FlipkartScrolling
{
public static void main(String[] args) throws InterruptedException {
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.selenium.dev/");
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	
	JavascriptExecutor js=(JavascriptExecutor) driver;
	js.executeScript("window.scrollBy(0,1000)");
	Thread.sleep(2000);
	js.executeScript("window.scrollBy(0,1000)");
	Thread.sleep(2000);
	js.executeScript("window.scrollBy(0,-800)");
	Thread.sleep(2000);
	driver.close();
}
}
