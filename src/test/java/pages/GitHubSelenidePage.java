package pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class GitHubSelenidePage {
    SelenideElement wikiTab = $("#wiki-tab");
    String selenideGitHubLink = "https://github.com/selenide/selenide";


    public GitHubSelenidePage openPage() {
        open(selenideGitHubLink);
        return this;
    }

    public GitHubSelenidePage clickWikiTabOnGitHubPage() {
        wikiTab.click();
        return this;
    }
}


