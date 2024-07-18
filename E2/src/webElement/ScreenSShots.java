package webElement;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScreenSShots 
{
public static void main(String[] args) throws IOException {
	WebDriver driver= new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("http://www.flipkart.com");
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	
	TakesScreenshot ts = (TakesScreenshot) driver;
	File ss = ts.getScreenshotAs(OutputType.FILE);
	
	File dest = new File("./ScreenShots/image1.jpeg");
	FileUtils.copyFile(ss, dest);
	driver.close();
}
}
