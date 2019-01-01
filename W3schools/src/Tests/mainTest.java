package Tests;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.junit.Test;

import junit.framework.*;

import Pages.*;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class mainTest extends TestCase{
	
	private Properties properties;
	WebDriver driver = new ChromeDriver();
	
	protected void setUp(){

		BufferedReader reader;
		 try {
			 System.setProperty("webdriver.chrome.driver", "C:\\Users\\zahavaab\\eclipse-workspace\\W3schools\\chromedriver.exe");
			 driver.get("https://www.w3schools.com");
			 Thread.sleep(5000);  // Let the user actually see something!
			 System.out.println("Navigate to web succeed");
			 }
		catch (Exception e) {
			System.out.println("Navigate to web failed");
			 driver.quit();
		}
		 try {
			 reader = new BufferedReader(new FileReader("configs//Config.properties"));
			 properties = new Properties();
			 try {
			 properties.load(reader);
			 reader.close();
			 System.out.println("Loading properties succeed");
			 } 
			 catch (IOException e) {
			 e.printStackTrace();
			 }
		 }
		 catch (FileNotFoundException e) {
		 e.printStackTrace();
		 throw new RuntimeException("Config.properties not found");
		 } 
	}
		
	@Test
	 public void testTutorials(){
		 HomePage homePage = new HomePage(); 
		 String section = properties.getProperty("section");
		 String subSection = properties.getProperty("subSection");
		 try {
			homePage.clickOnTutorialsBtn();
			driver.findElement(By.cssSelector("a[href*='"+subSection+"']")).click();
			System.out.println("click on user tutorial succeed");
			//"/angular/default.asp"
		}
		 catch (InterruptedException e) {
			e.printStackTrace();
			System.out.print("failed to test Tutorials");
		}
	   }

	 public void testSearch(){
		 HomePage homePage = new HomePage(); 
		 try {
			homePage.insertToSearch("ang");
			homePage.validateSearching();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

	}

	 public void testNext(){
		 HomePage homePage = new HomePage(); 
		 tutorialPage tPage = new tutorialPage();
		 try {
				homePage.clickOnTutorialsBtn();
				driver.findElement(By.cssSelector("a[href*='angular']")).click();
				System.out.println("click on angular tutorial succeed");
				tPage.clickOnNextBtn();
				tPage.clickOnNextBtn();
				tPage.clickOnHomeBtn();
		} 
		 catch (InterruptedException e) {
			e.printStackTrace();
		}

	}
	
}
