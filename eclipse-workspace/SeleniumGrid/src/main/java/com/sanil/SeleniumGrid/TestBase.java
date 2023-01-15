package com.sanil.SeleniumGrid;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

public class TestBase {

	// Declare ThreadLocal Driver (ThreadLocalMap) for ThreadSafe Tests
	protected static ThreadLocal<RemoteWebDriver> driver = new ThreadLocal<>();
	public CapabilityFactory capabilityFactory = new CapabilityFactory();

	@BeforeMethod
	@Parameters(value = { "browser" })
	public void setup(String browser) {

		try {
			driver.set(new RemoteWebDriver(new URL("http://192.168.1.10:4444"),
					capabilityFactory.getCapabilities(browser)));
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
	}

	public WebDriver getDriver() {
		return driver.get();
	}

	@AfterMethod
	public void tearDown() {
		getDriver().quit();
	}

}
