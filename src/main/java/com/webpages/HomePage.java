/**
 * 
 */
package com.webpages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

/**
 * @author piyup
 *
 */
public class HomePage extends BasePage{

	public HomePage(WebDriver driver) {
		super(driver);
		
	}
	
	public void postMessage(WebDriver driver) {
		driver.findElement(By.xpath("(//span[@class='a8c37x1j ni8dbmo4 stjgntxs l9j0dhe7'])[17]")).click();
		driver.findElement(By.xpath("//div[@class='_1mf _1mj']")).sendKeys("Hello World");
		driver.findElement(By.xpath("(//div[@class='bp9cbjyn j83agx80 taijpn5t c4xchbtz by2jbhx6 a0jftqn4'])[39]")).click();
	}
	  
	 
	 
			 

}
