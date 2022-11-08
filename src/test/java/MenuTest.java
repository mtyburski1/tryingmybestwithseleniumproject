import base.BaseTest;
import org.testng.annotations.Test;

public class MenuTest extends BaseTest {

    @Test
    public void shouldClickMainPage(){
        MainPage mainPage = new MainPage(driver);
        mainPage.mainPageClick();
    }
}
