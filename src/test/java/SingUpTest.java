import PageOblects.BaseTest;

import Steps.SingUp;
import org.junit.Assert;
import org.junit.Test;


public class SingUpTest extends BaseTest {
    SingUp singUp =  new SingUp();

    @Test
    public void signUp() throws Exception{
       singUp.navigateToSingUpForm();
       singUp.enterZipCode();
       singUp.enterMailData();
       Assert.assertEquals("Account is created!",singUp.checkThatConfirmationMessageAppears());
    }

}