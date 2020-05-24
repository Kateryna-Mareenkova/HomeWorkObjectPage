package Steps;

import PageOblects.BaseTest;
import PageOblects.MainPage;
import PageOblects.SingUpPage;



public class SingUp extends BaseTest {
    MainPage mainPage = new MainPage(getDriver());
    SingUpPage singUpPage = new SingUpPage(getDriver());

    public void navigateToSingUpForm(){
        mainPage.clickSingUpLink();
    }

    public void enterZipCode() {
        singUpPage.sendKeysZipCodeField("12345");
        singUpPage.clickContinueBtn();
    }
    public void enterMailData() {
        singUpPage.sendKeysFirstNameField("Katerina");
        singUpPage.sendKeysLastNameField("Mareenkova");
        singUpPage.sendKeysEmailField("kat.m@gmail.com");
        singUpPage.sendKeysPasswordField("123456");
        singUpPage.sendKeysConfirmPasswordField("123456");
        singUpPage.clickRegisterBtn();
    }
    public String getRegisteredEmail() {
        return singUpPage.getRegisteredEmail();
    }

    public String getRegisteredPassword() {
        return singUpPage.getRegisteredPassword();
    }

    public String checkThatConfirmationMessageAppears () {
            return singUpPage.getTextConfirmationMessage();
        }

    }
