import base.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SignInPage extends BasePage {
    public SignInPage(WebDriver driver){
        super(driver);
    }

    @FindBy(css = ".no-account a")
    private WebElement createAccountBtn;

    public void createAccountClick(){
        createAccountBtn.click();
    }
}
