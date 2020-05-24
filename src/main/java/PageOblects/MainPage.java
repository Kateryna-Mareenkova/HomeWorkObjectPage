package PageOblects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class MainPage extends BasePage {

    //private WebDriver driver;
    public  MainPage(WebDriver driver){
       super(driver);
    }
    SingUpPage singUpPage = new SingUpPage();


    @FindBy(xpath = "/html/body/center/table/tbody/tr[3]/td/table/tbody/tr/td[4]/a")
    private WebElement signUpBtn;
    @FindBy(xpath = "/html/body/center/table/tbody/tr[3]/td/table/tbody/tr/td[1]/p/input")
    private WebElement email;
    @FindBy(xpath = "/html/body/center/table/tbody/tr[3]/td/table/tbody/tr/td[2]/p/input")
    private WebElement password;
    @FindBy(xpath = "/html/body/center/table/tbody/tr[3]/td/table/tbody/tr/td[3]/input")
    private WebElement login;
    @FindBy(xpath = "/html/body/center/table/tbody/tr[3]/td/a")
    private WebElement logOutBtn;



    public void clickSingUpLink(){
        signUpBtn.click();
    }
    public void sendKeysEmailsTextField(String a){
        email.sendKeys(a);
    }

     public void sendKeysPasswordTextField(String a){
        password.sendKeys(a);
    }

    public void clickLoginBtn(){
        login.click();
    }

    public String logOutBtnHasDisplayed(){
        return logOutBtn.getText();
    }
    public void nAviGate() {
        driver.get("https://www.sharelane.com/cgi-bin/main.py");
    }
}
