package index.php.demo.com.tutorialsninja.pages;

import index.php.demo.com.tutorialsninja.utilities.Utility;
import org.openqa.selenium.By;

public class RegisterAccountPage extends Utility {

    By pageTitle = By.xpath("//h1[contains(text(),'Register Account')]");
    By firstName = By.id("input-firstname");
    By lastName = By.id("input-lastname");
    By email = By.id("input-email");
    By phoneNumber = By.id("input-telephone");
    By password = By.id("input-password");
    By confirmPassword = By.id("input-confirm");
    By subscribeButton = By.xpath("//fieldset[3]//input");
    By privacyPolicy = By.xpath("//div[@class = 'buttons']//input[@name='agree']");
    By continueButton = By.xpath("//div[@class = 'buttons']//input[@value='Continue']");
    By confirmationMessage = By.xpath("//h1[contains(text(),'Your Account Has Been Created!')]");
    By continueConfirmation = By.xpath("//a[contains(text(),'Continue')]");

    public String getRegisterAccountTitle() {
        return getTextFromElement(pageTitle);
    }
    public void enterFirstName(String fstName) {
        sendTextToElement(firstName, fstName);
    }
    public void enterLastName(String lstName) {
        sendTextToElement(lastName, lstName);
    }
    public void enterEmail(String mail) {
        sendTextToElement(email, mail);
    }
    public void enterPhoneNumber(String number) {
        sendTextToElement(phoneNumber, number);
    }
    public void enterPassword(String pwd) {
        sendTextToElement(password, pwd);
    }
    public void enterConfirmPassword(String cnfrmPwd) {
        sendTextToElement(confirmPassword, cnfrmPwd);
    }
    public void selectSubscribe(String option) {
        selectByContainsTextFromDropDown(subscribeButton, option);
    }
    public void clickOnPrivacyPolicyCheckBox() {
        clickOnElement(privacyPolicy);
    }
    public void clickOnContinueButton() {
        clickOnElement(continueButton);
    }
    public String getAccountRegistrationConformationMessage() {
        return getTextFromElement(confirmationMessage);
    }
    public void clickOnContinueWithConfirmation() {
        clickOnElement(continueConfirmation);
    }
}
