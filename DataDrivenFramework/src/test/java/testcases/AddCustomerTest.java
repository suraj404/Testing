package testcases;

import org.openqa.selenium.Alert;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.Test;

import base.BaseTest;

public class AddCustomerTest extends BaseTest {

	@Test
	public void addCustomer() {
		click("addcustombutton_xpath");
		type("fname_xpath", "test");
		type("lname_xpath", "lname");
		type("postcode_xpath", "201001");
		click("addbtn_xpath");
		Alert alert = wait.until(ExpectedConditions.alertIsPresent());
		try{
		Assert.assertTrue(alert.getText().contains("test"),"Customer not added successfully");}
		catch(Throwable t)
		{
		alert.accept();
		Assert.fail(t.getMessage());
		}
	}

}
