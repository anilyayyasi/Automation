package webElement;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FramesHandling1
{
	public static void main(String[] args)
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.dream11.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.id("hamburger")).click();
		driver.findElement(By.xpath("(//a[text()='Dream11 Team Today'])[1]")).click();
		driver.switchTo().frame(0);
		driver.findElement(By.id("regEmail")).sendKeys("9876543210");
	}
}
