package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class RegistrationPage extends BasePage {

	public RegistrationPage(WebDriver driver) {
		super(driver);

	}

	@FindBy(xpath = "//input[@name=\"firstname\"]")
	WebElement FirstName;
	@FindBy(xpath = "//input[@id='input-lastname']")
	WebElement LastName;
	@FindBy(xpath = "//input[@id='input-email']")
	WebElement email;
//	@FindBy(xpath = "//input[@id='input-telephone']")
//	WebElement telephone;
	@FindBy(xpath = "//input[@id='input-password']")
	WebElement password;
	
	@FindBy(xpath = "//input[@name='agree']")
	WebElement privacyBtn;
//	@FindBy(xpath = "//input[@id='input-confirm']")
//	WebElement confirm;
	
		
	@FindBy(xpath = "//button[normalize-space()='Continue']")
	WebElement continu;
	
	@FindBy(xpath = "//h1[normalize-space()='Your Account Has Been Created!']")
	WebElement MsgCnfm;

	@FindBy(xpath = "//a[normalize-space()='Continue']")
	WebElement continu2;

	public void SetFirstName(String fname) {
		FirstName.sendKeys(fname);
	}

	public void SetLastName(String lname) {
		LastName.sendKeys(lname);
	}

	public void SetEmail(String mail) {
		email.sendKeys(mail);
	}

//	public void Settelephone(String phone) {
//		telephone.sendKeys(phone);
//	}

	public void Setpassword(String pwd) {
		password.sendKeys(pwd);
	}

	public void SetPrivacyPolicy() {

		privacyBtn.click();
	}

	
	
	
	public void continu() {
		continu.click();
	}

	public String getConfMsg() {
		try {
			return (MsgCnfm.getText());
		} catch (Exception e) {
			return (e.getMessage());
		}
	}

	
}