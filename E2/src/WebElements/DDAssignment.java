package WebElements;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class DDAssignment
{
public static void main(String[] args) {
	WebDriver driver = new FirefoxDriver();
	driver.manage().window().maximize();
	driver.get("https://www.facebook.com/");
	driver.manage().timeouts().implicitlyWait(Duration.ofMinutes(1));
	driver.findElement(By.xpath("//a[text()='Create new account']")).click();
	WebElement month = driver.findElement(By.id("month"));
	Select sel = new Select(month);
	List<WebElement> s = sel.getOptions();
	System.out.println(s.size());
	for(WebElement dlist:s)
	{
		System.out.println(dlist.getText());
		
	}
}
}
