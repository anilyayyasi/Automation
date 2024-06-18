package WebElements;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DD2
{
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		WebElement dd = driver.findElement(By.name("url"));
		Select s = new Select(dd);
		s.selectByVisibleText("Baby");
		Thread.sleep(3000);
		s.selectByIndex(18);
		Thread.sleep(3000);
		s.selectByValue("search-alias=watches");
		Thread.sleep(3000);
		List<WebElement> size = s.getOptions();
		System.out.println(size.size());
		Thread.sleep(3000);
		for(WebElement ss:size)
		{
			System.out.println(ss.getText());
		}
		Thread.sleep(3000);
		driver.quit();
	}
}
