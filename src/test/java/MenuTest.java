import base.BaseTest;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import org.testng.annotations.Test;

public class MenuTest extends BaseTest {

    @Test
    public void shouldOpenMainPage() {
        MainPage mainPage = new MainPage(driver);
        ExtentTest MainPageTest = extent.createTest("MainPageTest");

        MainPageTest.log(Status.INFO, "Starting shouldOpenMainPage test");

        mainPage.mainPageClick();
        MainPageTest.log(Status.PASS, "Clicked Logo button");

        if (driver.getTitle().equals("TesterSii")) {
            MainPageTest.log(Status.PASS, "Checked if title is equal");
        } else {
            MainPageTest.log(Status.FAIL, "Checked if title is equal");
        }
    }

    @Test
    public void shouldOpenClothesPage() {
        MainPage mainPage = new MainPage(driver);
        ExtentTest clothesPageTest = extent.createTest("ClothesPageTest");

        clothesPageTest.log(Status.INFO, "Starting shouldOpenClothesPage test");

        mainPage.clothesPageClick();
        clothesPageTest.log(Status.PASS, "Clicked Clothes button");

        if (driver.getTitle().equals("Clothes")) {
            clothesPageTest.log(Status.PASS, "Checked if title is equal");
        } else {
            clothesPageTest.log(Status.FAIL, "Checked if title is equal");
        }
    }

    @Test
    public void shouldOpenAccessoriesPage() {
        MainPage mainPage = new MainPage(driver);

        ExtentTest accessoriesPageTest = extent.createTest("AccessoriesPageTest");

        accessoriesPageTest.log(Status.INFO, "Starting shouldOpenAccessoriesPage test");

        mainPage.accessoriesPageClick();
        accessoriesPageTest.log(Status.PASS, "Clicked Accessories button");

        if (driver.getTitle().equals("Accessories")) {
            accessoriesPageTest.log(Status.PASS, "Checked if title is equal");
        } else {
            accessoriesPageTest.log(Status.FAIL, "Checked if title is equal");
        }
    }
}
