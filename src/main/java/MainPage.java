import base.BasePage;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MainPage extends BasePage {

    public MainPage(WebDriver driver){
        super(driver);
    }

    @FindBy(css = "#menu-item-133")
    private WebElement mainPageBtn;

    public void mainPageClick(){
        mainPageBtn.click();
    }
}
