package com.sanil.SeleniumGrid;

import org.openqa.selenium.Capabilities;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

public class CapabilityFactory {
	public Capabilities capabilities;

	public ChromeOptions getCapabilities(String browser) {

		DesiredCapabilities capabilities = new DesiredCapabilities();
		ChromeOptions option = new ChromeOptions();
		if (browser.equals("firefox")) {
			capabilities.setBrowserName("firefox");
			capabilities.setCapability(CapabilityType.BROWSER_NAME, "firefox");
			capabilities.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
			option.addArguments("--headless");
			option.merge(capabilities);
		}

		else if (browser.equals("chrome"))

		{
			capabilities.setBrowserName("chrome");
			capabilities.setCapability(CapabilityType.BROWSER_NAME, "chrome");
			capabilities.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
			option.addArguments("--headless");
			option.merge(capabilities);

		}
		return option;

	}
}