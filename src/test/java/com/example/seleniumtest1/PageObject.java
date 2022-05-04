package com.example.seleniumtest1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.PageFactory;

public class PageObject {
    protected EdgeDriver driver;

    public PageObject(EdgeDriver driver) {
    this.driver = driver;
        PageFactory.initElements(driver, this);
    }
}
