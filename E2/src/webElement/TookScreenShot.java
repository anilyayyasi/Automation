package webElement;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TookScreenShot
{
	public static void main(String[] args) throws IOException
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.selenium.dev/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		TakesScreenshot tss=(TakesScreenshot) driver;
		File jpg = tss.getScreenshotAs(OutputType.FILE);
		File f=new File("./ScreenShots/selenium.png");
		FileUtils.copyFile(jpg, f);
		driver.close();
		
	}
}
