import base.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MainPage extends BasePage {

    public MainPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(css = "#_desktop_logo")
    private WebElement mainPageBtn;

    @FindBy(css = "#category-3")
    private WebElement clothesPageBtn;

    @FindBy(css = "#category-6")
    private WebElement accessoriesPageBtn;

    @FindBy(css = ".user-info .hidden-sm-down")
    private WebElement signInBtn;

    public SignInPage signInClick(){
        signInBtn.click();
        return new SignInPage(driver);
    }

    public void accessoriesPageClick() {
        accessoriesPageBtn.click();
    }

    public void clothesPageClick() {
        clothesPageBtn.click();
    }

    public void mainPageClick() {
        mainPageBtn.click();
    }
}
