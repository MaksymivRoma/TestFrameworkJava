package tests;

import com.codeborne.selenide.logevents.SelenideLogger;
import io.qameta.allure.selenide.AllureSelenide;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;

public abstract class BaseTest {

	@BeforeAll
	public static void setUpSelenide() {
		SelenideLogger.addListener("allure", new AllureSelenide().savePageSource(false));
	}

	@AfterAll
	public static void tearDownSelenide() {
		SelenideLogger.removeListener("allure");
	}

}
