package fRames;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Frames3 {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.hyrtutorials.com/p/frames-practice.html");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebElement f2 = driver.findElement(By.xpath("(//h3[text()='Frame2:'])[1]"));
		Point loc = f2.getLocation();
		int x = loc.getX();
		int y = loc.getY();
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("window.scrollBy("+x+","+y+")");
		Thread.sleep(2000);
		driver.switchTo().frame("frm2");
		WebElement drop = driver.findElement(By.id("selectnav1"));
		Select s=new Select(drop);
		s.selectByIndex(28);
		Thread.sleep(5000);
		driver.switchTo().defaultContent();
		Thread.sleep(5000);
		WebElement tb = driver.findElement(By.id("name"));
		js.executeScript("window.scrollBy("+"-"+x+","+"-"+y+")");
		Thread.sleep(3000);
		tb.sendKeys("Came out from Frame 2");
		Thread.sleep(3000);
		driver.close();
}
}