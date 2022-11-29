package com.demoqa;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.io.File;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;

public class PracticeForm {

    @BeforeAll

    static void configure() {
        Configuration.browserSize = "2560x1660";
        Configuration.baseUrl = "https://demoqa.com";
        Configuration.holdBrowserOpen = true;
    }

    File file = new File("src/test/resources/test.jpg");

    @Test
    void fillFormTest() {


        open("/automation-practice-form");
        executeJavaScript("$('footer').remove()");
        executeJavaScript("$('#fixedban').remove()");

        $("#firstName").setValue("Dima");
        $("#lastName").setValue("Chernogubov");
        $("#userEmail").setValue("npc@npc.com");
        $("#genterWrapper").$(byText("Male")).click();
        $("#userNumber").setValue("9771821591");
        $("#dateOfBirthInput").click();
        $(".react-datepicker__month-select").selectOption("August");
        $(".react-datepicker__year-select").selectOption("1994");
        $(".react-datepicker__day--005").click();
        $("#subjectsInput").setValue("Accounting").pressEnter();
        $("#hobbiesWrapper").$(byText("Music")).click();
        $("#currentAddress").setValue("Pushkina 45");
        $("#state").click();
        $("#stateCity-wrapper").$(byText("NCR")).click();
        $("#city").click();
        $("#stateCity-wrapper").$(byText("Delhi")).click();

        $("#submit").click();

        $("#example-modal-sizes-title-lg").shouldHave(text("Thanks for submitting the form"));
        $(".table-responsive").shouldHave((text("Dima")),
                text("Chernogubov"),
                text("npc@npc.com"),
                text("Male"),
                text("9771821591"),
                text("05"),
                text("August"),
                text("1994"),
                text("Accounting"),
                text("Music"),
                text("Pushkina 45"),
                text("NCR"),
                text("Delhi"));

        $("#closeLargeModal").click();






    }
}