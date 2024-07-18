package browserActions;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChildPopup 
{
public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.amazon.in/");
	String parent = driver.getWindowHandle();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	System.out.println(parent);
	driver.findElement(By.id("twotabsearchtextbox")).sendKeys("motorola edge 50 pro");
	driver.findElement(By.id("nav-search-submit-button")).submit();
	WebElement mobile = driver.findElement(By.xpath("//h2/a/span[contains(text(),'Luxe Lavender, 256 GB) (12 GB')]"));
	JavascriptExecutor js=(JavascriptExecutor) driver;
	Point mloc = mobile.getLocation();
	int mx = mloc.getX();
	int my = mloc.getY();
	js.executeScript("window.scrollBy("+mx+","+my+")");
	mobile.click();
	Set<String> pc = driver.getWindowHandles();
	for(String p:pc)
	{
		System.out.println(p);
		driver.switchTo().window(p);
	}
	WebElement cart = driver.findElement(By.xpath("//h5[text()='Offers']"));
	Point cloc = cart.getLocation();
	int cx = cloc.getX();
	int cy = cloc.getY();
	js.executeScript("window.scrollBy("+cx+","+cy+")");
	System.out.println(cx+" , "+cy);
	
	js.executeScript("arguments[0].setAttribute('style', 'color: red');", cart);
	Thread.sleep(5000);
	js.executeScript("arguments[argument.length  -1].setAttribute('style', 'background: yellow; border: 2px solid red;');", cart);
	driver.findElement(By.id("submit.add-to-cart-announce")).click();
	
	
	

}
}
