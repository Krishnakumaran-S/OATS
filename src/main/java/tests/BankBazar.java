package tests;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import BankPages.CompareandApply;
import pages.MyHomePage;
import wdMethods.SeMethods;

public class BankBazar extends SeMethods {
	@BeforeClass
	public void setData() {
		testCaseName = "BankBazar";
		testCaseDescription = "Check for Loan";
		category = "Smoke";
		author = "Vino";
		// dataSheetName="TC001";
	}

	@Test
	public void BankBazar1() throws InterruptedException {
		new CompareandApply().login().mouseover().search().age().year().date().verify().conti().salary().continu()
				.bank().contin().con().listamount().pop().Close();

	}
}
