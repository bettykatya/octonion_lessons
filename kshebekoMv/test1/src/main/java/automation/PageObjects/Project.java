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

    public void clickCreateProject() { btnCreateProject.click();}

    public void inputName(String name) {inputProjectName.sendKeys(name);}

    public void btnCreate() {btnCreate.click();}

    public void clickDevice() {clickAddDevice.click();}


    public Project(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }


}
