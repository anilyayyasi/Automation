package chapter_3;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class VTigerLogin 
{
public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("http://localhost:8888/");
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	
	VTigerLoginUsingPOM vt=new VTigerLoginUsingPOM(driver);
	vt.username("admin");
	vt.password("admin");
	vt.login();
	driver.quit();
	
}
}
