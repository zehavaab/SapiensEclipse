package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class tutorialPage {
	
	@FindBy(css = "a[text='Next']")
	WebElement nextLink;
	
	@FindBy(css = "a[href='/default.asp']")
	WebElement homeLink;
	
	public void clickOnNextBtn() throws InterruptedException{
		
	try {
		nextLink.click();
		Thread.sleep(1000);
		System.out.println("Click on next button success");
	}
	catch (Exception e) {
		System.out.println("Click on next button failed");
	}
	}
	
	public void clickOnHomeBtn() throws InterruptedException{
		
	try {
		homeLink.click();
		Thread.sleep(1000);
		System.out.println("Click on home button success");
	}
	catch (Exception e) {
		System.out.println("Click on home button failed");
	}
	}


}
