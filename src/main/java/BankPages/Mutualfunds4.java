package BankPages;

import org.openqa.selenium.WebElement;

import wdMethods.SeMethods;

public class Mutualfunds4 extends SeMethods{
	
	public Mutualfunds4 bank() throws InterruptedException {
		
		WebElement element8 = driver.findElementByXPath("//span[text()='HDFC']");
		element8.click();
		Thread.sleep(1000);
		return this;
	}

	public Mutualfunds4 contin() throws InterruptedException {
		WebElement element9 = driver.findElementByXPath("//input[@placeholder='My First Name']");
		element9.sendKeys("KRISHNA");
		Thread.sleep(1000);
		return new Mutualfunds4();
		
	}

	public InvestAmount con() throws InterruptedException {
		WebElement element10 = driver.findElementByXPath("//a[text()='View Mutual Funds']");
		element10.click();
		Thread.sleep(20000);
		return new InvestAmount();
		
	}

}