package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends BasePage  {

    public HomePage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }
  
    @FindBy(xpath="//span[normalize-space()='My Account']")
    WebElement myAccount;

    @FindBy(xpath="//a[@class='dropdown-item'][normalize-space()='Register']")
    WebElement register;

    public void ClickOff() {
    	myAccount.click(); }
 
    public void registration() {
        
        
        register.click();
    }

    
		
	}
