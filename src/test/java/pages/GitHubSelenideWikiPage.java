package pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;

public class GitHubSelenideWikiPage {
    SelenideElement SoftAssertions = $("#wiki-body [href=\"/selenide/selenide/wiki/SoftAssertions\"]");

    public GitHubSelenideWikiPage softAssertionTextOnThePage() {
        SoftAssertions.shouldHave(Condition.text("Soft assertions"));
        return this;
    }

    public SoftAssertionPage softAssertionLinkClick() {
        SoftAssertions.click();
        return new SoftAssertionPage();
    }
}
