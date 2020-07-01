package pages;

import com.codeborne.selenide.Condition;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public abstract class  BasePage {

	public BasePage() {
		assertTitle();
	}

	abstract String pageTitle();

	public void assertTitle(){
		$("title").should(Condition.exactText(pageTitle()));
		open();
	}

}