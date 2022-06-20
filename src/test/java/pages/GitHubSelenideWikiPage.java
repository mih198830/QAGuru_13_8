package pages;

import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;

public class GitHubSelenideWikiPage {
    SelenideElement morePagesButton = $(".js-wiki-more-pages-link");
    SelenideElement softAssertionLinkClick = $("#wiki-pages-box").$$("a").findBy(text("SoftAssertions"));

    SoftAssertionPage softAssertionPage = new SoftAssertionPage();

    @Step("Click 'More' button and click 'soft assertions link")
    public GitHubSelenideWikiPage clickMorePagesButton() {
        morePagesButton.click();
        softAssertionPage.attachScreenshot();
        return this;
    }

    @Step("Click Soft Assertions Link")
    public GitHubSelenideWikiPage clickSoftAssertionsLink(){
        softAssertionLinkClick.click();
        softAssertionPage.attachScreenshot();
        return this;
    }
}
