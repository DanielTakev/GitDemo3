package pages.AdminPages;

import base.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.time.Duration;

public class LoginPage extends BasePage {

    @FindBy(id = "input-username")
    @CacheLookup
    private WebElement usernameInputField;

    @FindBy(id = "input-password")
    @CacheLookup
    private WebElement passwordInputField;

    @FindBy(className = "btn-primary")
    @CacheLookup
    private WebElement loginButton;

    @FindBy(xpath = "//*[@class='alert alert-danger alert-dismissible']")
    private WebElement loginErrorMessage;

    private static final String URL = "https://shop.pragmatic.bg/admin";

    public LoginPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    public void goToLoginPage() {
        goPage(URL);
    }

    public void writeIntoUsernameInputField(String username) {
        typeInWebElement(usernameInputField, username);
    }

    public void writeIntoPasswordInputField(String password) {
        typeInWebElement(passwordInputField, password);
    }

    public void clickLoginButton() {
        clickOnWebElement(loginButton);
    }

    public void login(String username, String password) {
        writeIntoUsernameInputField(username);
        writeIntoPasswordInputField(password);
        clickLoginButton();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(100));
    }
    public boolean isLoginErrorMessageDisplayed() {
        return loginErrorMessage.isDisplayed();
    }
}
