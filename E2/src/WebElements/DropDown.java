package WebElements;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DropDown {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://demo.vtiger.com/vtigercrm/index.php");
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	driver.findElement(By.id("username")).clear();
	driver.findElement(By.id("password")).clear();
	Thread.sleep(4000);
	driver.findElement(By.id("username")).sendKeys("admin");
	driver.findElement(By.id("password")).sendKeys("admin");
	driver.findElement(By.xpath("//button[text()='Sign in']")).click();
	driver.findElement(By.xpath("(//div[@class='row app-navigator'])[1]")).click();
	//Actions a = new Actions(driver);
	WebElement mh = driver.findElement(By.xpath("//span[text()=' INVENTORY']"));
	mh.click();
	driver.findElement(By.xpath("//span[text()=' Vendors']")).click();
	Thread.sleep(2000);
	driver.findElement(By.id("Vendors_listView_basicAction_LBL_ADD_RECORD")).click();
	Thread.sleep(2000);
	driver.findElement(By.name("vendorname")).sendKeys("420 Manufactures");
	Thread.sleep(2000);
	driver.findElement(By.xpath("(//b[@role='presentation'])[1]")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("(//span[text()='300-Sales-Software'])[1]")).click();
}
}
