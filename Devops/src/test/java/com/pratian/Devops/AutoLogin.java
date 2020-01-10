package com.pratian.Devops;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoLogin {
	static String baseUrl = "https://uatint-pv.mirrahealthcare.com/";
	//static String expectedTitle = "Welcome: Mercury Tours";
	//static String actualTitle = "";
    public static void main(String[] args) throws InterruptedException {
    
    
    System.setProperty("webdriver.chrome.driver", "D:\\driver/chromedriver.exe");	
    
    WebDriver driver = new ChromeDriver();
    
    
    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    Thread.sleep(1000);
    driver.get(baseUrl);
    Thread.sleep(1000);
    driver.manage().window().maximize();
    
    Thread.sleep(1000);
    
    // get the actual value of the title
   // actualTitle = driver.getTitle();
    driver.findElement(By.id("userId")).click();
    
    driver.findElement(By.id("userId")).clear();
   
    driver.findElement(By.id("userId")).sendKeys("t_madhu@ahcpllc.com");
    Thread.sleep(1000);
    driver.findElement(By.id("Password")).clear();
    
    driver.findElement(By.id("Password")).sendKeys("Password@123");
 
    driver.findElement(By.id("Password")).click();
    
    Thread.sleep(1000);
    driver.findElement(By.id("btnSubmit")).click();
    Thread.sleep(2000);
    
    /*
     * compare the actual title of the page with the expected one and print
     * the result as "Passed" or "Failed"
     */
		/*
		 * if (actualTitle.contentEquals(expectedTitle)){
		 * System.out.println("Test Passed!"); } else {
		 * System.out.println("Test Failed"); }
		 */
   
    //close Fire fox
    driver.close();
 }
}

