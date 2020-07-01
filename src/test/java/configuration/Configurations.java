package configuration;

import com.codeborne.selenide.Configuration;

public class Configurations {
	static Browsers DEFAULT_BROWSER = Browsers.CHROME;

	public static void configureBrowser() {
		switch(DEFAULT_BROWSER) {
			case CHROME:{
				Configuration.browser = "chrome";
				break;
			}
			case FIREFOX:{
				Configuration.browser = "firefox";
				break;
			}
			case IE:{
				Configuration.browser = "ie";
				break;
			}
		}
	}
}