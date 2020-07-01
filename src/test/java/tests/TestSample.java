package tests;

import com.codeborne.selenide.Selenide;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.open;

public class TestSample extends BaseTest {

	@Test
	void test_new(){
		open("http://google.com");
	}
}
