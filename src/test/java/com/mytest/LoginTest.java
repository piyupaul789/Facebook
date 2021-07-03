/**
 * 
 */
package com.mytest;

import org.testng.annotations.Test;

import com.webpages.HomePage;
import com.webpages.LoginPage;

/**
 * @author piyup
 *
 */
public class LoginTest extends BaseTest{
	
	@Test
	public void doLoginTest() {
		HomePage homePage = page.getInstance(LoginPage.class).doLogin("8789807704", "Piyu@123");	
	}

}
