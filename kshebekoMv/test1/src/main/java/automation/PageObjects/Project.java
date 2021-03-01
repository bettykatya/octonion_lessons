package automation.PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Project extends BasePageObjects {

    private WebDriver driver;

    @FindBy(xpath = "//button[@class = 'btn btn--floating oct-h8']")
    private WebElement btnCreateProject;

    @FindBy(css = "#project-name")
    private WebElement inputProjectName;

    @FindBy(xpath = "//button[@class ='btn btn--contained oct-h9 btn--primary']")
    private WebElement btnCreate;

    @FindBy(xpath = "//div[@class='custom-icon btn__icon']")
    private WebElement clickAddDevice;

    @FindBy(xpath = "//span[contains(text(), 'Add to the Project')]")
    private WebElement addToTheProject;

    @FindBy(xpath = "//a[@aria-label = 'List of Projects']/div/div")
    private WebElement listOfProjects;

    @FindBy(xpath = "//div[@class = 'milfei-dimmable projects-page__cards-row'][1]/a[1]/child::*[2]")
    private WebElement projectSetting;

    @FindBy(xpath = "//span[contains(text(), 'Remove')]/..")
    private WebElement projectRemoveBtn;

    @FindBy(xpath = "//span[contains(text(), 'Confirm')]/..")
    private WebElement confirmRemoveProject;

    public void clickCreateProject() { btnCreateProject.click();}

    public void inputName(String name) {inputProjectName.sendKeys(name);}

    public void btnCreate() {btnCreate.click();}

    public void clickDevice() {clickAddDevice.click();}

    public void btnAddDevice() {addToTheProject.click();}

    public void clickListOfProjects() {listOfProjects.click();}

    public void clickProjectSetting() {projectSetting.click();}

    public void clickProjectRemove() {projectRemoveBtn.click();}

    public void confirmRemoveProjectBtn() {confirmRemoveProject.click();}

    public Project(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }


}
