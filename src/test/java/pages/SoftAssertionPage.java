package pages;

import com.codeborne.selenide.SelenideElement;
import com.codeborne.selenide.WebDriverRunner;
import io.qameta.allure.Attachment;
import io.qameta.allure.Step;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;

public class SoftAssertionPage {
    SelenideElement jUnit5Block = $("h4 a#user-content-3-using-junit5-extend-test-class");

    @Step("Check that code example from JUnit5 exist on the assertion link")
    public SoftAssertionPage codeOnThePageJunit5() {
        jUnit5Block.shouldBe(visible);
        attachScreenshot();
        return this;
    }

    @Attachment(value = "Screenshot of what is going on", type = "image/png", fileExtension = "png")
    public byte[] attachScreenshot() {
        return ((TakesScreenshot)WebDriverRunner.getWebDriver()).getScreenshotAs(OutputType.BYTES);
    }
}
