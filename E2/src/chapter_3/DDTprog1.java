package chapter_3;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DDTprog1 {
public static void main(String[] args) throws IOException, InterruptedException{
	Properties p=new Properties();
	FileInputStream fis=new FileInputStream("./File.properties");
	p.load(fis);
	
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	
	driver.get(p.getProperty("url"));
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.findElement(By.name("user_name")).sendKeys(p.getProperty("un"));
	driver.findElement(By.name("user_password")).sendKeys(p.getProperty("pwd"));
	driver.findElement(By.id("submitButton")).click();
	
	Actions a=new Actions(driver);
	WebElement tt = driver.findElement(By.xpath("//td/a[text()='More']"));
	a.moveToElement(tt).perform();
	//Thread.sleep(5000);
	driver.findElement(By.xpath("//td/a[text()='Price Books']")).click();
	driver.findElement(By.xpath("//img[@title='Create Price Book...']")).click();
	driver.findElement(By.xpath("//input[@name='bookname']")).sendKeys(p.getProperty("pbn"));
	driver.findElement(By.name("description")).sendKeys(p.getProperty("desc"));
	driver.findElement(By.xpath("(//input[@type='submit'])[2]")).click();
	driver.findElement(By.xpath("(//td/a[text()='Price Books'])[1]")).click();
	driver.findElement(By.xpath("(//a[text()='del'])[5]")).click();
	Thread.sleep(3000);
	driver.switchTo().alert().accept();
	Thread.sleep(3000);
	driver.close();
	
	
	
	
	
}
}
