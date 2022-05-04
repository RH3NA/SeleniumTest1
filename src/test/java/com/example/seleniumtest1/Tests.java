package com.example.seleniumtest1;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class Tests {

    @BeforeSuite
    public void initializeTest() {
        System.out.println("Initializing tests...");
    }



    @Test(testName = "Survey tests", invocationCount = 3)
    public static void submitSurvey() {
        System.setProperty("webdriver.edge.driver","C:\\Users\\Rebecca\\Documents\\Edgedriver\\msedgedriver.exe");
        EdgeDriver driver = new EdgeDriver();
        driver.get("https://docs.google.com/forms/d/e/1FAIpQLSdpAvMHvw1LKPX8ZD-zICG7yB3MMb57d6flvlYv2ptiJ5Mg9A/viewform?usp=sf_link");
        Survey survey = new Survey(driver);
        survey.chooseOption();
        survey.submitSurvey();
    }

    }
