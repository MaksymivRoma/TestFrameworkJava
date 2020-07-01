package Tests;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.openqa.selenium.remote.DesiredCapabilities;

public abstract class BaseTest {

	@BeforeAll
	public static void baseTestBeforeClass() {
		Configuration.remote = "http://localhost:4444/wd/hub";
		Configuration.browser = "chrome";
		Configuration.browserVersion = "79.0";
		Configuration.browserSize = "1280x1024";
		DesiredCapabilities capabilities = new DesiredCapabilities();
		capabilities.setCapability("enableVNC", true);
		Configuration.browserCapabilities = capabilities;
	}
}
