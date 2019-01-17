package testcases;

import org.testng.Assert;
import org.testng.annotations.Test;

import base.BaseTest;

public class BankManagerLoginTest extends BaseTest{
	
	@Test
	public void loginAsBankManager(){
	click("bmlbutton_xpath");
	Assert.fail();
	}
}
