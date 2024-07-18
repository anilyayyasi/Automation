package fRames;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Frame2 
{
public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.hyrtutorials.com/p/frames-practice.html");
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	JavascriptExecutor js=(JavascriptExecutor) driver;
//	Actions a=new Actions(driver);
	WebElement tb = driver.findElement(By.id("name"));
	Point loc = tb.getLocation();
	int x=loc.getX();
	int y=loc.getY();
	js.executeScript("window.scrollBy("+x+","+y+")");
	
	tb.sendKeys("Entering into the frame 1");
	Thread.sleep(2000);
	
	driver.switchTo().frame("frm1");
	WebElement dd = driver.findElement(By.id("selectnav1"));
	Select s=new Select(dd);
	List<WebElement> lst = s.getOptions();
	System.out.println(lst.size());
	s.selectByIndex(7);
	Thread.sleep(5000);
	driver.switchTo().defaultContent();
	tb.clear();
	tb.sendKeys("cameout");
	Thread.sleep(5000);
	driver.close();
}
}
