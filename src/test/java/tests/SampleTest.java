package tests;

import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.open;

public class SampleTest extends BaseTest {

	@Test
	void test_new(){
		open("http://google.com");
	}
}
