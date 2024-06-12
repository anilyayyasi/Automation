package demo;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Demo {
	
	public static void main(String[] args) throws InterruptedException {
 
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.instagram.com");
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	//	WebElement un = driver.findElement(By.name("username"));
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
//		wait.until(ExpectedConditions.visibilityOf(un)).sendKeys("joker_jk_ak");
//		WebElement pwd = driver.findElement(By.name("password"));
//		wait.until(ExpectedConditions.visibilityOf(pwd)).sendKeys("Anil@1142");
//		WebElement btn = driver.findElement(By.xpath("//button[@type='submit']"));
//		wait.until(ExpectedConditions.elementToBeClickable(btn)).click();
//		Thread.sleep(3000);
		WebElement fp = driver.findElement(By.xpath("//span[text()='Forgot password?']"));
		fp.click();
		
		WebElement un1 = driver.findElement(By.xpath("//input[@type='text']"));
		wait.until(ExpectedConditions.visibilityOf(un1)).sendKeys("1234567890");
		
		
		
		//driver.quit();
	}

}
