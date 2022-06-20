package tests;

import com.codeborne.selenide.logevents.SelenideLogger;
import github.TestBase;
import io.qameta.allure.Allure;
import io.qameta.allure.Description;
import io.qameta.allure.SeverityLevel;
import io.qameta.allure.selenide.AllureSelenide;
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
    @Description("Checking that JUnit 5 block code present on the Selenide page")

    void assertionsTest() {
        SelenideLogger.addListener("allure", new AllureSelenide());
        Allure.label("owner", "Matskevich Mikhail");
        Allure.label("severity", SeverityLevel.CRITICAL.value());
        Allure.story("Selenide wiki element presence");
        Allure.epic("Github testing");
        Allure.feature("JUnit 5 version still supported and present on the page");
            gitHubSelenidePage.openPage()
                    .clickWikiTabOnGitHubPage();
            gitHubSelenideWikiPage.clickMorePagesButton()
                    .clickSoftAssertionsLink();
            softAssertionPage.codeOnThePageJunit5();
    }
}
