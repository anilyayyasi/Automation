package WebElements;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsDisplayedMethod
{
public static void main(String[] args) {
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.facebook.com");
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	WebElement un = driver.findElement(By.id("email"));
	if(un.isDisplayed())
	{
		System.out.println("Username textbox is displaying");
		un.sendKeys("anilyadav");
	}
	else
	{
		System.out.println("Username textbox is not displayed");
	}
	WebElement pwd = driver.findElement(By.id("pass"));
	if(pwd.isDisplayed())
	{
		System.out.println("Passowrd textbox is displaying");
		pwd.sendKeys("anilyadav");
	}
	else
	{
		System.out.println("passowrd textbox is not displayed");
	}
	WebElement btn = driver.findElement(By.name("login"));
	if(btn.isEnabled())
	{
		System.out.println("Login button is enabled");
		btn.click();
	}
	else
	{
		System.out.println("login button is disabled");
	}
	driver.close();
}
}
