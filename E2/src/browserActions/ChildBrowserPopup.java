package browserActions;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChildBrowserPopup {
public static void main(String[] args) {
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.facebook.com");
	String parent = driver.getWindowHandle();
	System.out.println(parent);
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	
	driver.switchTo().newWindow(WindowType.TAB);
	driver.get("https://www.instagram.com");
	String child = driver.getWindowHandle();
	System.out.println(child);
	
	Set<String> all = driver.getWindowHandles();
	System.out.println(all);
	
	driver.quit();
}
}
