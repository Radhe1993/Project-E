package uk.co.library.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import uk.co.library.utility.Utility;

public class HomePage extends Utility
{

    @CacheLookup
    @FindBy(xpath = "//input[@id='keywords']")
    WebElement jobTitle;

    @CacheLookup
    @FindBy(xpath = "//input[@id='location']")
    WebElement location;

    @CacheLookup
    @FindBy(xpath = "//select[@id='distance']")
    WebElement distance;

    @CacheLookup
    @FindBy(xpath = "//button[@id='toggle-hp-search']")
    WebElement moreSearchLink;

    @CacheLookup
    @FindBy(xpath = "//input[@id='salarymin']")
    WebElement salaryMin;

    @CacheLookup
    @FindBy(xpath = "//input[@id='salarymax']")
    WebElement salaryMax;

    @CacheLookup
    @FindBy(xpath = "//select[@id='salarytype']")
    WebElement salaryType;

    @CacheLookup
    @FindBy(xpath = "//select[@id='tempperm']")
    WebElement jobType;

    @CacheLookup
    @FindBy(xpath = "//input[@id='hp-search-btn']")
    WebElement findJob;

    @CacheLookup
    @FindBy(xpath = "//body/main[@id='site-main']/div[1]/section[1]/div[1]/form[1]/div[1]/div[3]/div[1]/div[4]/select[1]/option[6]")
    WebElement result;


   // @CacheLookup
 //   @FindBy(xpath = "//body/main[@id='site-main']/div[1]/div[1]/div[2]")
    //WebElement result;

    public void enterJobTitle(String job)
    {
        sendTextToElement(jobTitle,job);
    }

    public void enterLocation(String location1)
    {
        sendTextToElement(location,location1);
    }
    public void selectDistance(String text)
    {
        selectByVisibleTextFromDropDown(distance,text);
    }
    public void setMoreSearchLink()
    {
        clickOnElement(moreSearchLink);
    }
    public void enterMinSalary(String min)
    {
        sendTextToElement(salaryMin,min);
    }
    public void enterMaxSalary(String max)
    {
        sendTextToElement(salaryMax,max);
    }
    public void setSalaryType(String  text1)
    {
        selectByVisibleTextFromDropDown(salaryType,text1);
    }
    public void setJobType(String type)
    {
        sendTextToElement(jobType,type);

    }
    public void clickOnFindJob()
    {
        clickOnElement(findJob);
    }
    public void setResult()
    {
        getTextFromElement(result);
    }

    public void sendData(String jobTitle, String location, String distance, String salaryMin, String salaryMax, String salaryType, String jobType,String result)
    {
        enterJobTitle(jobTitle);
        enterLocation(location);
        selectDistance(distance);
        setMoreSearchLink();
        enterMinSalary(salaryMin);
        enterMaxSalary(salaryMax);
        setSalaryType(salaryType);
        setJobType(jobType);
        clickOnFindJob();
        setResult();




    }

}
