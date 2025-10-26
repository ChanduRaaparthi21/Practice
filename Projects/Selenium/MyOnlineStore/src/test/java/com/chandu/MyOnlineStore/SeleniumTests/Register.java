package com.chandu.MyOnlineStore.SeleniumTests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Register {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		
		WebDriver driver = new ChromeDriver();
		driver.get("http://localhost:4200/");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[text()[normalize-space()='Login']]")).click();
		
		
	}

}
