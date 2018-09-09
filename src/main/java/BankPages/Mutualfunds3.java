package BankPages;

import org.openqa.selenium.WebElement;

import wdMethods.SeMethods;

public class Mutualfunds3 extends SeMethods {

	public Mutualfunds3 salary() throws InterruptedException {
		/*
		 * WebElement element6 = driver.findElementByXPath("//span[text()='7,50,000']");
		 * element6.click();
		 */

		String salary = "670000";
		driver.findElementByName("netAnnualIncome").sendKeys(salary);

		Thread.sleep(1000);
		return this;
	}

	public Mutualfunds4 continu() throws InterruptedException {
		WebElement element7 = driver.findElementByXPath("//a[text()='Continue']");
		element7.click();
		Thread.sleep(1000);
		return new Mutualfunds4();

	}

}
