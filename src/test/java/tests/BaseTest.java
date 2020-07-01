package tests;

import configuration.Configurations;
import org.junit.jupiter.api.BeforeAll;

public abstract class BaseTest {

	@BeforeAll
	public static void baseTestBeforeClass() {
		Configurations.configureBrowser();
	}


}
