package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo {
	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","E:\\browser drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://register.rediff.com/register/register.php?FormName=user_details");
		driver.findElements(By.xpath("(//input[@type='text']")).get(0).sendKeys("bharadwaj");
		driver.findElement(By.xpath("(//input[@type='text'])[1]")).sendKeys("bharadwaj");
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//input[@type='text'])[2]")).sendKeys("admin123");
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//input[@type='button'])[1]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//input[@type='password'])[1]"))
		.sendKeys("password@123");

	}
}
