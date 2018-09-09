package BankPages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import wdMethods.SeMethods;

public class Mutualfunds2 extends SeMethods {

	public Mutualfunds2 age() throws InterruptedException {
		Thread.sleep(1000);
		/*
		 * WebElement element3 = driver.findElementByXPath("//div[text()='24']");
		 * element3.click();
		 */

		// Choose the age
		WebElement slider = driver.findElementByXPath("//div[@class='rangeslider__handle']");
		Actions build = new Actions(driver);
		build.dragAndDropBy(slider, 46, 0).perform(); // 8 pixels for every age

		return this;
	}

	public Mutualfunds2 year() throws InterruptedException {
		Thread.sleep(1000);
		WebElement element4 = driver.findElementByXPath("//a[text()='Jun 1994']");
		element4.click();
		return this;
	}

	public Mutualfunds2 date() throws InterruptedException {
		Thread.sleep(1000);
		WebElement element5 = driver.findElementByXPath("//div[@aria-label='day-26']");
		element5.click();
		return this;
	}

	public Mutualfunds2 verify() throws InterruptedException {
		Thread.sleep(1000);
		WebElement element5 = driver.findElementByXPath("//span[text()='26 Jun 1994']");
		verifyExactText(element5, "26 Jun 1994");
		return this;
	}

	public Mutualfunds3 conti() throws InterruptedException {
		Thread.sleep(1000);
		WebElement element5 = driver.findElementByXPath("//a[text()='Continue']");
		element5.click();
		return new Mutualfunds3();

	}
}
