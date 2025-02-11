package pages.AdminPages;

import base.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class DashboardPage extends BasePage {

    @FindBy(xpath = "//*[@class='fa fa-sign-out']/ ..")
    @CacheLookup
    private WebElement logoutButton;

    @FindBy(id = "user-profile")
    @CacheLookup
    private WebElement userProfile;

    @FindBy(xpath = "//*[@class='fa fa-user-circle-o fa-fw']")
    @CacheLookup
    private WebElement yourProfile;

    @FindBy(id = "input-username")
    @CacheLookup
    private WebElement userNameInput;

    @FindBy(id = "input-firstname")
    @CacheLookup
    private WebElement firstNameInput;

//    @FindBy(id = "thumb-image")
//    private WebElement userImage;
//
//    @FindBy(id="button-image")
//    private WebElement addButtonImage;
//
    @FindBy(xpath = "//*[@class='fa fa-save']")
    @CacheLookup
    private WebElement saveButtonForProfile;
//
//    @FindBy(xpath = "//*[@class='fa fa-upload']")
//    private WebElement uploadNewImageManager;
    @FindBy(id="input-confirm")
    @CacheLookup
    private WebElement confirmPassword;

    public DashboardPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    public void verifyLogoutButtonIsPresent() {
        verifyWebElementIsPresent(logoutButton);
    }

    public void clickOnUserProfile() {
        userProfile.click();
    }

    public void clickOnYourProfile() {
        yourProfile.click();
    }

    public void typeIntoUsernameInput(String username) {
        userNameInput.sendKeys(username);
    }

    public void typeIntoUserFirstNameInput(String firstName) {
        firstNameInput.sendKeys(firstName);
    }
//
//    public void clickOnAddImage(){
//        addButtonImage.click();
//    }
//
//    public void uploadNewImage(){
//        uploadNewImageManager.click();
//    }
//
//    public void changeUserImage(String imageUrl) {
//        userImage.sendKeys(imageUrl);
//    }

    public void clickOnSaveButton(){
        saveButtonForProfile.click();
    }

    public void typeIntoConfirmPassword(String password){
        confirmPassword.sendKeys(password);
    }
}
