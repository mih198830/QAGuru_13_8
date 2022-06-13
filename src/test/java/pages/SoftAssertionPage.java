package pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;

public class SoftAssertionPage {
    SelenideElement jUnit5Block = $("#user-content-3-using-junit5-extend-test-class");

    public SoftAssertionPage codeOnThePageJunit5() {
        jUnit5Block.shouldBe(visible);
        return this;
    }
}
