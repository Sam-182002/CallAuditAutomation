package com.callaudit.tests;

import org.apache.logging.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.callaudit.base.BaseClass;
import com.callaudit.utils.LogUtil;

public class BillingClassTest extends BaseClass {
	private static final Logger log = LogUtil.getLogger(BillingClassTest.class);
	@Test
	public void testBillingClass() {
		log.error("BillingClassTest is not implemented yet");
		Assert.fail();
	}
    
}
