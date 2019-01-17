package testcases;

import org.testng.annotations.Test;

import base.BaseTest;

public class OpenAccountTest extends BaseTest {
	
	@Test
	public void openAccount() {
		select("customername_xpath","test lname");
		select("currency_xpath","Rupee");
		click("processbtn_xpath");
		
	}

}
