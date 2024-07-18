package webElement;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class InstagramScreenShot
{
public static void main(String[] args) throws IOException, InterruptedException
{
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.instagram.com");
	Thread.sleep(3000);
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	TakesScreenshot ts=(TakesScreenshot) driver;
	File iss = ts.getScreenshotAs(OutputType.FILE);
	File is=new File("./ScreenShots/insta.png");
	FileUtils.copyFile(iss, is);
	driver.close();
	
}
}
