package BankPages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import wdMethods.SeMethods;

public class CompareandApply extends SeMethods {

	public CompareandApply login() {

		startApp("Chrome", "https://www.bankbazaar.com/");
		return this;
	}

	public Mutualfunds mouseover() throws InterruptedException {

		WebElement element = driver.findElementByXPath("//a[@title='Investments']");
		Actions builder = new Actions(driver);
		builder.moveToElement(element).perform();
		Thread.sleep(1000);
		WebElement subelement = driver.findElementByXPath("//a[@title='Mutual Funds']");
		builder.moveToElement(subelement).click();
		builder.perform();
		return new Mutualfunds();
	}

}
