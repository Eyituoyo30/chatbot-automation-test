package ChatBotTests.Pages;

import BaseClasses.PageBase;
import org.openqa.selenium.By;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.NoSuchElementException;

public class HomePage extends PageBase {

    public HomePage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    // Find the Chat bot button
    //find username field element
    @FindBy(xpath= "//*[@id=\"mtnbot-container\"]/div[2]/button")
    WebElement chatBot_Bubble;


    @FindBy(xpath = "//*[@id='vw_web_widget_frame']")
    WebElement iframeElement;

    // find the start a new conversation element
    @FindBy(xpath = "//*[@id=\"q-app\"]/div/div/div/div[1]/div[2]/div/div[1]/button")
    private WebElement startNewConversationBtn;

    @FindBy(xpath = "//input[@placeholder=\"Enter Phone Number\" or @placeholder=\"MTN Number\"]")
    private WebElement phoneNumberField;

    @FindBy(xpath = "//div[@class=\"chat-response\"]//input[@placeholder=\"otp number\" and contains(@class, 'q-field__native')]")
    private WebElement otpInput;

    @FindBy(xpath = "//div[@class=\"chat-response\"]//button[contains(@class, 'q-btn')]")
    private WebElement otpSubmitBtn;

    // ======== Actions =======

    public void switchToIframe() {
        WebElement IframeElement = driver.findElement(By.xpath("//div[@id='mtnbot-container']//iframe[@id='vw_web_widget_frame']"));
        driver.switchTo().frame(IframeElement);
    }

    public void clickStartANewConversation() throws InterruptedException {
        click(startNewConversationBtn);
    }

    public void enterPhoneNumber(String phoneNumber) {
        waitForElementVisibility(phoneNumberField);
        enterText(phoneNumberField, phoneNumber);
    }

    public void clickChatBotButton() {
        click(chatBot_Bubble);
    }

    public WebElement getAuthSubmitBtn() {
        return driver.findElement(By.xpath("//div[@class=\"chat-response\"]//button[.//span[text()='Submit']]"));
    }

    public void clickAuthSubmitBtn() {
        WebElement AuthSubmitBtn = getAuthSubmitBtn();
        waitForElementToBeClickable(AuthSubmitBtn);
        click(AuthSubmitBtn);
        sleep(3);
    }

    public void enterOTP(String otp) {
        waitForElementVisibility(otpInput);
        enterText(otpInput, otp);
    }

    public void clickOTPSubmitBtn() {
        waitForElementVisibility(otpSubmitBtn);
        click(otpSubmitBtn);
    }
}
