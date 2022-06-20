package pages;

import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class GitHubSelenidePage {
    SelenideElement wikiTab = $("#wiki-tab");
    String selenideGitHubLink = "https://github.com/selenide/selenide";
    SoftAssertionPage softAssertionPage = new SoftAssertionPage();

    @Step("Open Selenide GitHub main page")
    public GitHubSelenidePage openPage() {
        open(selenideGitHubLink);
        softAssertionPage.attachScreenshot();
        return this;
    }
    @Step("Open Selenide Wiki page")
    public GitHubSelenidePage clickWikiTabOnGitHubPage() {
        wikiTab.click();
        return this;
    }
}


