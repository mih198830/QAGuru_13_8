package pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;

public class GitHubSelenideWikiPage {
    SelenideElement softAssertions = $("#wiki-body [href=\"/selenide/selenide/wiki/SoftAssertions\"]");
    SelenideElement morePagesButton = $(".js-wiki-more-pages-link");
    SelenideElement softAssertionLinkClick = $("#wiki-pages-box").$$("a").findBy(text("SoftAssertions"));


    public GitHubSelenideWikiPage clickMorePagesButton() {
        morePagesButton.click();
        return this;
    }

    public GitHubSelenideWikiPage clickSoftAssertionsLink(){
        softAssertionLinkClick.click();
        return this;
    }
}
