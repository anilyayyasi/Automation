package webElement;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScreenShot1 
{
	public static void main(String[] args) throws IOException
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.co.in/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		TakesScreenshot ts=(TakesScreenshot) driver;
		File ss1 = ts.getScreenshotAs(OutputType.FILE);
		File fs=new File("./ScreenShots/google.png");
		FileUtils.copyFile(ss1, fs);
		driver.close();
	}
}
