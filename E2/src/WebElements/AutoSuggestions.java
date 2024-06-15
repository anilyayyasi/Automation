package WebElements;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoSuggestions
{
public static void main(String[] args) throws InterruptedException
{
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.amazon.in/");
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.findElement(By.id("twotabsearchtextbox")).click();
	Thread.sleep(4000);
	List<WebElement> search = driver.findElements(By.xpath("//div[@class='s-suggestion-trending-container']"));
	System.out.println("no. of suggestions are "+search.size());
	for(WebElement as:search)
	{
		System.out.println(as.getText());
	}
	driver.close();
}
}
