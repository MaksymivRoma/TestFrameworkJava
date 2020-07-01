package Pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Configuration;

import static com.codeborne.selenide.Selenide.$;

public abstract class  BasePage {

	public BasePage() {
		assertTitle();
	}

	abstract String pageTitle();

	public void assertTitle(){
		$("title").should(Condition.exactText(pageTitle()));
	}
}