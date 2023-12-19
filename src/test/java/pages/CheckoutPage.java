package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

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
	
	@FindBy(xpath = "(//button[@id='finish'])")
	WebElement finish;
	
	@FindBy(xpath = "//h2[contains (text(),'Thank you')]")
	WebElement success;
//	Actions
//	verify element id added
//	Remove item
//	continue shopping
//	checkout
	
	public CheckoutPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	

		public void provideDetails(String firstName, String secondName, String pinCode ) {
			// TODO Auto-generated method stub
			FirstName.sendKeys(firstName);
			LastName.sendKeys(secondName);
			PinCode.sendKeys(pinCode);
			
		}

		public void checkoutOrder() {
			// TODO Auto-generated method stub
			conBtn.click();
		}
		
	



		public boolean isOrderSuccess() {
			// TODO Auto-generated method stub
			
			finish.click();
		    Assert.assertEquals(success.getText(),"Thank you for your order!" );
			return true;
			   
			
		}

}
