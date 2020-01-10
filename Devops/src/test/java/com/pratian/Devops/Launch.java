package com.pratian.Devops;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Launch {
	static String baseUrl = "http://demo.guru99.com/test/newtours/";
	static String expectedTitle = "Welcome: Mercury Tours";
	static String actualTitle = "";

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "D:\\driver/chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get(baseUrl);
		driver.manage().window().maximize();

		Thread.sleep(2000);

		// get the actual value of the title
		actualTitle = driver.getTitle();

		/*
		 * compare the actual title of the page with the expected one and print the
		 * result as "Passed" or "Failed"
		 */
		if (actualTitle.contentEquals(expectedTitle)) {
			System.out.println("Test Passed!");
		} else {
			System.out.println("Test Failed");
		}

		// close Fire fox
		driver.close();
	}
}
