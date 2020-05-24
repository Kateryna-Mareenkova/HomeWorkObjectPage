package Steps;


import PageOblects.BaseTest;
import PageOblects.MainPage;
import PageOblects.SingUpPage;


public class Login extends BaseTest {
  MainPage mainPage = new MainPage(getDriver());
  SingUpPage singUp = new SingUpPage(getDriver());

    public void login(String em, String pass ){
   mainPage.sendKeysEmailsTextField(em);
   mainPage.sendKeysPasswordTextField(pass);
   mainPage.clickLoginBtn();
    }
    public void nAviGate(){
        mainPage.nAviGate();
    }


}
