package uk.co.library.testsuite;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import resources.runners.TestData;
import uk.co.library.customListeners.CustomListeners;
import uk.co.library.pages.HomePage;
import uk.co.library.pages.ResultPage;
import uk.co.library.testbase.BaseTest;

@Listeners(CustomListeners.class)
public class JobSearchTest extends BaseTest {
    HomePage homePage;
    ResultPage resultPage;

    @BeforeMethod
    public void iNit() {
        homePage = new HomePage();
        resultPage = new ResultPage();
    }

    @Test(dataProvider = "credentials", dataProviderClass = TestData.class)
    public void verifyJobSearchResultUsingDifferentDataSet(String jobTitle, String location, String distance, String salaryMin, String salaryMax, String salaryType, String jobType,String result) {


        homePage.sendData(jobTitle, location, distance, salaryMin, salaryMax, salaryType, jobType,result);

        String expected = result;
        String actual = getTextFromElement(By.className("search-header__title"));
        Assert.assertEquals(actual, expected);
        }

    }



