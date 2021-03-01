package automation.PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login extends BasePageObjects{

    private WebDriver driver;

    @FindBy(css = "#email")
    private WebElement loginInput;

    @FindBy(css = "#password-field")
    private WebElement passInput;

    @FindBy(xpath = "//button[@class = \"btn inverted-btn --mt-24 --fluid\"]")
    private WebElement submitBtn;

    public void enterLogin(String email) {loginInput.sendKeys(email);}

    public void enterPassword(String psw) {passInput.sendKeys(psw);}

    public void submit() {submitBtn.click();}

    public Login(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

}
