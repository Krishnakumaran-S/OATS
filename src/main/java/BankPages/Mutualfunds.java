package BankPages;

import org.openqa.selenium.WebElement;

import wdMethods.SeMethods;

public class Mutualfunds extends SeMethods {
	
	public Mutualfunds2 search() throws InterruptedException {
		
		Thread.sleep(1000);
		WebElement element2 = driver.findElementByXPath("//a[text()='Search for Mutual Funds']");
		element2.click();
		return new Mutualfunds2();
	}
	
}
