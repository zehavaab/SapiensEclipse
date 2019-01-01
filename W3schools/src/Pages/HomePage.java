package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import org.openqa.selenium.Keys;



public class HomePage {
	@FindBy(id = "navbtn_tutorials")
	WebElement tutorialsBtn;
	
	@FindBy(id = "gsc-i-id1")
	WebElement searchTb;
	
	@FindBy(id = "resInfo-0")
	WebElement googleSearch;
	
	public void clickOnTutorialsBtn() throws InterruptedException{
	
	try {
		tutorialsBtn.click();
		Thread.sleep(1000);
		System.out.println("Click on tutorials button success");
	}
	catch (Exception e) {
		System.out.println("Click on tutorials button failed");
	}
}
	
	public void insertToSearch(String val) throws InterruptedException{
		
	try {
		searchTb.click();
		searchTb.sendKeys(val);
		searchTb.sendKeys(Keys.ENTER);
		Thread.sleep(1000);
		System.out.println("insert value for search succeed");
	}
	catch (Exception e) {
		System.out.println("insert value for search failed");
	}
}

	public void validateSearching() {
		try {
			Thread.sleep(2000);		
			googleSearch.isDisplayed();
			System.out.println("search page exists");
		}
		catch (Exception e) {
			System.out.println("Search page doesn't exist");	
		}
		
		
	}

}
