import base.BasePage;
import base.BaseTest;
import org.testng.annotations.Test;

public class LoginAndRegisterTest extends BaseTest {

@Test
    public void shouldRegister(){
    MainPage mainPage = new MainPage(driver);

    mainPage.signInClick()
            .createAccountClick();
}
}
