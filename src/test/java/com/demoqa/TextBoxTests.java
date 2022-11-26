package com.demoqa;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class TextBoxTests {

    @BeforeAll
    static void configure() {
        Configuration.browserSize = "2560x1660";
        Configuration.baseUrl = "https://demoqa.com";
    }

    @Test
    void fillFormTest() {
        open("/text-box");
        // $("[id=userName]").setValue("Dima");
        $("#userName").setValue("Dima");
        $("#userEmail").setValue("Dima@npc.com");
        $("#currentAddress").setValue("Some address 1");
        $("#permanentAddress").setValue("Another address 2");
        $("#submit").click();

        $("#submit").click();
        $("#output #name").shouldHave(text("Dima"));
       // $("#output").$("#userEmail").shouldHave(text("Dima"));
        $("#output #email").shouldHave(text("Dima@npc.com"));
        $("#output #currentAddress").shouldHave(text("Some address 1"));
        $("#output #permanentAddress").shouldHave(text("Another address 2"));


    }
}
