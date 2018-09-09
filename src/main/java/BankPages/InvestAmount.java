package BankPages;

import java.util.List;

import org.openqa.selenium.WebElement;

import wdMethods.SeMethods;

public class InvestAmount extends SeMethods {

	public InvestAmount listamount() throws InterruptedException {

		// Get all Schemes
		Thread.sleep(10000);
		List<WebElement> allSchemes = driver.findElementsByClassName("js-offer-name");
		for (WebElement eachScheme : allSchemes) {
			System.out.println(eachScheme.getText());
			WebElement eleAmount = driver.findElementByXPath("//span[contains(text(),'" + eachScheme.getText()
					+ "')]/following::span[@class='fui-rupee bb-rupee-xs']/..");
			System.out.println(eleAmount.getText());
		}
		return this;
	}

	public InvestAmount pop() throws InterruptedException {
		Thread.sleep(10000);
		WebElement element11 = driver.findElementByXPath("//span[@id='closeExitBlockerModal']");
		element11.click();

		return this;
	}

	public void Close() {

		closeBrowser();

	}
}