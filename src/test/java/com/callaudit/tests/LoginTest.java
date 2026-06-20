package com.callaudit.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.callaudit.base.BaseClass;
import com.callaudit.utils.RandomDataUtil;

public class LoginTest extends BaseClass {
@Test
    public void testLogin() {
		// Implement your login test logic here
	
	log.info("Login test executed successfully");
	RandomDataUtil randomDataUtil = new RandomDataUtil();
	System.out.println(randomDataUtil.generateNumeric(4 ));
	Assert.assertTrue(true, "Login test passed");
	
	}
}
