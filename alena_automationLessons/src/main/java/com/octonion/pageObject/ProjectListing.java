package com.octonion.pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProjectListing extends BasePage {

    private WebDriver driver;

    @FindBy(xpath = "//a[@href='/projects']")
    private WebElement projectsListing;

    @FindBy(xpath = "//div[@class='project-card__context-menu-button-wrapper']")
    private WebElement threeDropsMenu;

    @FindBy(xpath = "//button[.//span[text()='Remove']]")
    private WebElement removeLink;

    @FindBy(xpath = "//button[.//span[text()='Confirm']]")
    private WebElement confirmBtn;

    public ProjectListing(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void openProjectsListing() {
        projectsListing.click();
    }

    public void clickThreeDropsMenu() {
        threeDropsMenu.click();
    }

    public void doRemoveOfProject() {
        removeLink.click();
    }

    public void clickOnConfirmBtn() {
        confirmBtn.click();
    }


}
