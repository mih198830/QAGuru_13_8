package tests;

import com.codeborne.selenide.WebDriverRunner;
import com.codeborne.selenide.logevents.SelenideLogger;
import io.qameta.allure.*;
import io.qameta.allure.selenide.AllureSelenide;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import java.nio.charset.StandardCharsets;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.*;
import static io.qameta.allure.Allure.attachment;
import static io.qameta.allure.Allure.step;

public class HerokuappDragAndDrop {
    @Test
    @DisplayName("Test Drag and drop To selenide method")
    @Description("Checking that drag and drop functionality working as expected")
    @Link("https://github.com/")
    @Severity(SeverityLevel.CRITICAL)
    @Owner("Matskevich Mikhail")
    @Story("Main functionality story")
    @Epic("Never ending work")
    @Feature("Drag&Drop functionality")
    void dragAndDropTest() {
        SelenideLogger.addListener("allure", new AllureSelenide());
        step("Open main page of herokuapp", () -> {
            open("https://the-internet.herokuapp.com/drag_and_drop");
            attachment("Source", webdriver().driver().source());
            Allure.getLifecycle().addAttachment(
                    "Screenshot", "image/png", "png",
                    ((TakesScreenshot) WebDriverRunner.getWebDriver()).getScreenshotAs(OutputType.BYTES)
            );
        });
        step("Drop one column to another", () -> {
            $("#column-a").dragAndDropTo("#column-b");
            attachment("Source", webdriver().driver().source());
            Allure.getLifecycle().addAttachment(
                    "Screenshot", "image/png", "png",
                    ((TakesScreenshot) WebDriverRunner.getWebDriver()).getScreenshotAs(OutputType.BYTES)
            );
        });
        step("Check that column A have text B", () -> {
            $("#column-a").shouldHave(text("B"));
            attachment("Source", webdriver().driver().source());
            Allure.getLifecycle().addAttachment(
                    "Screenshot", "image/png", "png",
                    ((TakesScreenshot) WebDriverRunner.getWebDriver()).getScreenshotAs(OutputType.BYTES)
            );
        });
        step("Check that column B have text A", () -> {
            $("#column-b").shouldHave(text("A"));
            attachment("Source", webdriver().driver().source());
            Allure.getLifecycle().addAttachment(
                    "Screenshot",
                    "image/png",
                    "png",
                    ((TakesScreenshot) WebDriverRunner.getWebDriver())
                            .getScreenshotAs(OutputType.BYTES)
            );
            Allure.getLifecycle().addAttachment(
                    "Page source",
                    "text/html",
                    "html",
                    WebDriverRunner.getWebDriver()
                            .getPageSource().getBytes(StandardCharsets.UTF_8)
            );
        });
    }

    @Test
    void testWithListener() {
        SelenideLogger.addListener("allure", new AllureSelenide());
        open("https://the-internet.herokuapp.com/drag_and_drop");
        $("#column-a").dragAndDropTo("#column-b");
        $("#column-a").shouldHave(text("B"));
        $("#column-b").shouldHave(text("A"));
    }

}

