package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CheckoutPage {
	@FindBy(id="checkout")
	WebElement chekotbtn;
	
	@FindBy(id= "first-name")
	WebElement FirstName;
	
	@FindBy(id = "last-name")
	WebElement LastName;
	
	@FindBy(id="postal-code")
	WebElement PinCode;
	
	@FindBy(css= "input[data-test='continue']")
	WebElement conBtn;
	
//	Actions
//	verify element id added
//	Remove item
//	continue shopping
//	checkout
	
	public CheckoutPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
		public void checkoutpage() {
			conBtn.click();
		}

}
