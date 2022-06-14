package tests;

import github.TestBase;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import pages.GitHubSelenidePage;
import pages.GitHubSelenideWikiPage;
import pages.SoftAssertionPage;

public class SoftAssertionsPresenceTest extends TestBase {
GitHubSelenidePage gitHubSelenidePage = new GitHubSelenidePage();
SoftAssertionPage softAssertionPage = new SoftAssertionPage();
GitHubSelenideWikiPage gitHubSelenideWikiPage = new GitHubSelenideWikiPage();

    @Test()
    @DisplayName("Soft Assertion present on the wiki page and JUnit code exist also")
    void assertionsTest() {
        gitHubSelenidePage.openPage()
                .clickWikiTabOnGitHubPage();
        gitHubSelenideWikiPage.clickMorePagesButton()
                .clickSoftAssertionsLink();
        softAssertionPage.codeOnThePageJunit5();
    }
}
