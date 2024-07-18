package chapter_3;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class VTigerLoginUsingPOM {
@FindBy(name="user_name")
private WebElement untb;

@FindBy(name="user_password")
private WebElement pwdtb;

@FindBy(id="submitButton")
private WebElement loginbtn;

public VTigerLoginUsingPOM(WebDriver driver)
{
	PageFactory.initElements(driver, this);
}

public void username(String user)
{
	untb.sendKeys(user);
}

public void password(String passwordd)
{
	pwdtb.sendKeys(passwordd);
}

public void login()
{
	loginbtn.click();
}

}
