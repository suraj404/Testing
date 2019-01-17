package testcases;

import org.testng.annotations.Test;

import base.BaseTest;

public class CustomerLogin extends BaseTest {
	@Test
	public void doLogin(){
		click("custlogin_xpath");
		select("selectname_xpath","test lname");
		click("login_xpath");
	}

}
