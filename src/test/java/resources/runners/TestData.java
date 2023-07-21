package resources.runners;

import org.testng.annotations.DataProvider;

public class TestData {
    @DataProvider(name = "credentials")
    private Object[][] getdata() {

        Object[][] data = new Object[][]{
                {"Tester", "Harrow", "5 miles", "30000", "50000", "Per annum", "Permanent","Permanent Tester jobs in Harrow"},
                {"Tester", "Dublin", "10 miles", "4500", "5500", "Per month", "Contract","Contract Tester jobs in Dublin"},
                {"Tester", "London", "15 miles", "100", "200", "Per week", "Part Time","Part Time Tester jobs in London"},

                {"Tester", "Derby", "25 miles", "180", "200", "Per day", "Temporary","Temporary Tester jobs in Derby"},
                {"Tester", "Bradford", "35 miles", "20", "25", "Per hour", "Apprenticeship","Apprenticeship Tester jobs in Bradford"},
                {"Tester", "Belfast", "50 miles", "45000", "55000", "Per annum", "Permanent","Permanent Tester jobs in Belfast" }
        };


        return data;
    }
}


