import PageOblects.BaseTest;

import PageOblects.MainPage;
import Steps.Login;
import Steps.SingUp;
import org.junit.Assert;

import org.junit.Test;

public class LoginTest extends BaseTest {
    Login logIn = new Login();
    MainPage mainPage = new MainPage(getDriver());
    SingUp singUp =new SingUp();


    @Test
    public void testLogin() throws Exception{
        singUp.navigateToSingUpForm();
        singUp.enterZipCode();
        singUp.enterMailData();
        String registeredEmail=singUp.getRegisteredEmail();
        String registeredPassword=singUp.getRegisteredPassword();
        logIn.nAviGate();
        logIn.login(registeredEmail,registeredPassword);

        Assert.assertEquals("Logout",mainPage.logOutBtnHasDisplayed());
    }


}
