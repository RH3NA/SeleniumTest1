package com.example.seleniumtest1;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.FindBy;

import java.util.Random;

public class Survey extends PageObject {
    public Survey(EdgeDriver driver) {
        super(driver);

    }

    @FindBy(id = "i5")
    private WebElement wafflesButton;

    @FindBy(id = "i8")
    private WebElement pancakesButton;

    @FindBy(id = "i11")
    private WebElement bothButton;

    @FindBy(id = "i14")
    private WebElement dependsButton;

    @FindBy(id = "i17")
    private WebElement noneButton;

    @FindBy(xpath = "//span[text()='Skicka']")
    private WebElement skickaButton;


    public void chooseOption() {
        Random rand = new Random(); //instance of random class
        int upperbound = 4;
        int int_random = rand.nextInt(upperbound);
        System.out.println("" +int_random);

        if (int_random == 0) {
            this.wafflesButton.click();
        } if (int_random == 1) {
            this.pancakesButton.click();
        } if (int_random == 2) {
            this.bothButton.click();
        } if (int_random == 3) {
            this.dependsButton.click();
        } else if (int_random == 4) {
            this.noneButton.click();
        }
    }

    public void submitSurvey() {
        this.skickaButton.click();
    }
}