package com.chandu.TestSelenium.Flipkart;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MouseActions {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/");
		driver.findElement(By.name("email")).sendKeys("chanduraparthi1@gmail.com");
		Thread.sleep(2000);
		driver.findElement(By.id("pass")).sendKeys("Chandu242638");		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
		driver.findElement(By.name("login")).click();
		driver.findElement(By.xpath("//div[@data-comp-id='12']")).click();


	}

}
