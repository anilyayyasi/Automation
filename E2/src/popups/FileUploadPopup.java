package popups;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class FileUploadPopup {
public static void main(String[] args) throws IOException {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.w3schools.com/howto/howto_html_file_upload_button.asp");
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	WebElement btn = driver.findElement(By.id("myFile"));
	Actions a=new Actions(driver);
	a.moveToElement(btn).moveByOffset(5, 5).click().perform();
	
	Runtime.getRuntime().exec("C:\\Users\\User\\Desktop\\Manual Testing\\FU.au4.exe");
	
}
}
