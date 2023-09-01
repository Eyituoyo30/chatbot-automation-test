package ChatBotTests.Tests;


import BaseClasses.TestBase;
import ChatBotTests.Pages.HomePage;
import ChatBotTests.Pages.XtraValueTestPage;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.lang.reflect.Method;

import static utils.extentReports.ExtentTestManager.startTest;

public class XtraValueTest extends TestBase {

    XtraValueTestPage xtraValueTestPage;

    public void initializer() throws InterruptedException {
        xtraValueTestPage = new XtraValueTestPage(driver);
        HomePage homepage = new HomePage(driver);
        homepage.clickChatBotButton();
        sleep(3);
        homepage.switchToIframe();
        homepage.clickStartANewConversation();
        homepage.enterPhoneNumber(testDataProp.getProperty("phoneNumber8690"));
        homepage.clickAuthSubmitBtn();
        sleep(10);
        homepage.enterOTP(OTP);
        homepage.clickOTPSubmitBtn();
        sleep(10);
    }

    @Test(priority = 1, description = "Validate that User can purchase daily plan in XtraTalk More (Auto Renewal)")
    public void validateUserCanPurchaseDailyPlanXtraTalkMoreAutoRenewal(Method method) throws InterruptedException {
        startTest(method.getName(), "XtraValueTest", method.getAnnotation(Test.class).description());
        initializer();

        xtraValueTestPage.typeChatMessage("buy data");
        xtraValueTestPage.clickMessageSendBtn();
        xtraValueTestPage.findAndClickOption("Myself");
        xtraValueTestPage.findAndClickOption("Xtravalue(Data + Voice)");
        xtraValueTestPage.findAndClickOption("XtraTalk More");
        xtraValueTestPage.findAndClickOption("Daily Plans");
        xtraValueTestPage.findAndClickOption("XtraTalk More 300: N300");
        xtraValueTestPage.findAndClickOption("\uD83D\uDD01 Auto Renew");
        xtraValueTestPage.findAndClickOption("\uD83D\uDCB0 Airtime");
        xtraValueTestPage.findAndClickOption("✔ confirm"); // Confirm purchase
    }

    @Test(priority = 2, description = "Validate that user can purchase daily plan in XtraTalk More (One Off)")
    public void validateUserCanPurchaseDailyXtraTalkMoreOneOff(Method method) throws InterruptedException {
        startTest(method.getName(), "XtraValueTest", method.getAnnotation(Test.class).description());
        initializer();

        xtraValueTestPage.typeChatMessage("buy data");
        xtraValueTestPage.clickMessageSendBtn();
        xtraValueTestPage.findAndClickOption("Myself");
        xtraValueTestPage.findAndClickOption("Xtravalue(Data + Voice)");
        xtraValueTestPage.findAndClickOption("XtraTalk More");
        xtraValueTestPage.findAndClickOption("Daily Plans");
        xtraValueTestPage.findAndClickOption("XtraTalk More 300: N300");
        xtraValueTestPage.findAndClickOption("✔ One-Off Purchase");
        xtraValueTestPage.findAndClickOption("\uD83D\uDCB0 Airtime");
        xtraValueTestPage.findAndClickOption("✔ confirm"); // Confirm purchase
    }

    @Test(priority = 3, description = "Validate that user can purchase wEEKLY plan in XtraTalk More (One Off)")
    public void validateUserCanPurchaseWeeklyXtraTalkMoreOneOff(Method method) throws InterruptedException {
        startTest(method.getName(), "XtraValueTest", method.getAnnotation(Test.class).description());
        initializer();

        xtraValueTestPage.typeChatMessage("buy data");
        xtraValueTestPage.clickMessageSendBtn();
        xtraValueTestPage.findAndClickOption("Myself");
        xtraValueTestPage.findAndClickOption("Xtravalue(Data + Voice)");
        xtraValueTestPage.findAndClickOption("XtraTalk More");
        xtraValueTestPage.findAndClickOption("Weekly Plans");
        xtraValueTestPage.findAndClickOption("XtraTalk More 500: N500");
        xtraValueTestPage.findAndClickOption("✔ One-Off Purchase");
        xtraValueTestPage.findAndClickOption("\uD83D\uDCB0 Airtime");
        xtraValueTestPage.findAndClickOption("✔ confirm"); // Confirm purchase
    }

    @Test(priority = 4, description = "Validate that user can purchase Weekly plan in XtraTalk More (Auto Renewal)")
    public void validateUserCanPurchaseWeeklyXtraValueBundleOneOff(Method method) throws InterruptedException {
        startTest(method.getName(), "XtraValueTest", method.getAnnotation(Test.class).description());
        initializer();

        xtraValueTestPage.typeChatMessage("buy data");
        xtraValueTestPage.clickMessageSendBtn();
        xtraValueTestPage.findAndClickOption("Myself");
        xtraValueTestPage.findAndClickOption("Xtravalue(Data + Voice)");
        xtraValueTestPage.findAndClickOption("XtraTalk More");
        xtraValueTestPage.findAndClickOption("Weekly Plans");
        xtraValueTestPage.findAndClickOption("XtraTalk More 500: N500");
        xtraValueTestPage.findAndClickOption("\uD83D\uDD01 Auto Renew");
        xtraValueTestPage.findAndClickOption("\uD83D\uDCB0 Airtime");
        xtraValueTestPage.findAndClickOption("✔ confirm"); // Confirm purchase
    }

    @Test(priority = 5, description = "Validate that user can purchase Daily plan in XtraData More (Auto Renewal)")
    public void validateThatUserCanPurchaseDailyXtraDataMoreAutoRenewal(Method method) throws InterruptedException {
        startTest(method.getName(), "XtraValueTest", method.getAnnotation(Test.class).description());
        initializer();

        xtraValueTestPage.typeChatMessage("buy data");
        xtraValueTestPage.clickMessageSendBtn();
        xtraValueTestPage.findAndClickOption("Myself");
        xtraValueTestPage.findAndClickOption("Xtravalue(Data + Voice)");
        xtraValueTestPage.findAndClickOption("XtraData More");
        xtraValueTestPage.findAndClickOption("Daily Plans");
        xtraValueTestPage.findAndClickOption("XtraData More 300: N300");
        xtraValueTestPage.findAndClickOption("\uD83D\uDD01 Auto Renew");
        xtraValueTestPage.findAndClickOption("\uD83D\uDCB0 Airtime");
        xtraValueTestPage.findAndClickOption("✔ confirm"); // Confirm purchase
    }

    @Test(priority = 6, description = "Validate that user can purchase Daily plan in XtraData More (One Off)")
    public void validateThatUserCanPurchaseDailyXtraDataMoreOneOff(Method method) throws InterruptedException {
        startTest(method.getName(), "XtraValueTest", method.getAnnotation(Test.class).description());
        initializer();

        xtraValueTestPage.typeChatMessage("buy data");
        xtraValueTestPage.clickMessageSendBtn();
        xtraValueTestPage.findAndClickOption("Myself");
        xtraValueTestPage.findAndClickOption("Xtravalue(Data + Voice)");
        xtraValueTestPage.findAndClickOption("XtraData More");
        xtraValueTestPage.findAndClickOption("Daily Plans");
        xtraValueTestPage.findAndClickOption("XtraData More 300: N300");
        xtraValueTestPage.findAndClickOption("✔ One-Off Purchase");
        xtraValueTestPage.findAndClickOption("\uD83D\uDCB0 Airtime");
        xtraValueTestPage.findAndClickOption("✔ confirm"); // Confirm purchase
    }
    @Test(priority = 7, description = "Validate that user can purchase Weekly plan in XtraData More (Auto Renewal)")
    public void validateThatUserCanPurchaseWeeklyXtraDataMoreAutoRenewal(Method method) throws InterruptedException {
        startTest(method.getName(), "XtraValueTest", method.getAnnotation(Test.class).description());
        initializer();

        xtraValueTestPage.typeChatMessage("buy data");
        xtraValueTestPage.clickMessageSendBtn();
        xtraValueTestPage.findAndClickOption("Myself");
        xtraValueTestPage.findAndClickOption("Xtravalue(Data + Voice)");
        xtraValueTestPage.findAndClickOption("XtraData More");
        xtraValueTestPage.findAndClickOption("Weekly Plans");
        xtraValueTestPage.findAndClickOption("XtraData More 500: N500");
        xtraValueTestPage.findAndClickOption("\uD83D\uDD01 Auto Renew");
        xtraValueTestPage.findAndClickOption("\uD83D\uDCB0 Airtime");
        xtraValueTestPage.findAndClickOption("✔ confirm"); // Confirm purchase
    }

@Test(priority = 7, description = "Validate that user can purchase Weekly plan in XtraData More (One off)")
    public void validateThatUserCanPurchaseWeeklyXtraDataMoreOneOff(Method method) throws InterruptedException {
        startTest(method.getName(), "XtraValueTest", method.getAnnotation(Test.class).description());
        initializer();

        xtraValueTestPage.typeChatMessage("buy data");
        xtraValueTestPage.clickMessageSendBtn();
        xtraValueTestPage.findAndClickOption("Myself");
        xtraValueTestPage.findAndClickOption("Xtravalue(Data + Voice)");
        xtraValueTestPage.findAndClickOption("XtraData More");
        xtraValueTestPage.findAndClickOption("Weekly Plans");
        xtraValueTestPage.findAndClickOption("XtraData More 500: N500");
        xtraValueTestPage.findAndClickOption("✔ One-Off Purchase");
        xtraValueTestPage.findAndClickOption("\uD83D\uDCB0 Airtime");
        xtraValueTestPage.findAndClickOption("✔ confirm"); // Confirm purchase
    }



}
