package ChatBotTests.Pages;

import BaseClasses.PageBase;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class XtraValueTestPage extends PageBase {

    public XtraValueTestPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "/html/body/div/div/div[2]/div/div[1]/div[2]/div/label/div/div/div/input")
    @CacheLookup
    private WebElement chatInputEl;

//    public List<WebElement> getMenuOptions() {
//        return driver.findElements(By.xpath("//div[@class=\"chat-response\"]//div[@class=\"response-choices\"]/div[@class=\"option-btn\"]"));
//    }

    public List<WebElement> getMenuOptions() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30)); // Adjust the timeout as needed
        By menuOptionsLocator = By.xpath("//div[@class=\"chat-response\"]//div[@class=\"response-choices\"]/div[@class=\"option-btn\"]");

        // Wait for all menu options to be visible
        wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(menuOptionsLocator));

        // Return the list of WebElements
        return driver.findElements(menuOptionsLocator);
    }

    public void findAndClickOption(String text){
        List<WebElement> options = getMenuOptions();
        for (WebElement option : options) {
            String optionText = option.getText().trim();
            if (optionText.equals(text)) {
                option.click();
                break;
            }
        }
    }

    public void typeChatMessage(String text) {
        enterText(chatInputEl, text);
    }

    public void clickMessageSendBtn() {
        chatInputEl.sendKeys(Keys.ENTER);
        sleep(2);
        chatInputEl.sendKeys(Keys.ENTER);
        sleep(3);
    }


}
