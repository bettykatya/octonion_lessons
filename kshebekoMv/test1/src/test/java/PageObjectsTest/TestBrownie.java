package PageObjectsTest;

import org.testng.Assert;
import org.testng.annotations.Test;
import automation.PageObjects.Login;
import automation.PageObjects.Project;

public class TestBrownie extends BaseTest {

    private Login login;
    private Project project;

    @Test
    public void enterLoginData() throws InterruptedException {
        login = new Login(driver);
        login.enterLogin("kkrechko@octonion.com");
        login.enterPassword("qwertyQ1");
        login.submit();
        Thread.sleep(5000);
    }

    @Test(dependsOnMethods = "enterLoginData")
    public void createProject() throws InterruptedException {
        Thread.sleep(5000);
        project = new Project(driver);
        project.clickCreateProject();
        project.inputName("testKaty");
        project.btnCreate();
    }

    @Test(dependsOnMethods = "createProject")
    public void addDeviceInProject() throws InterruptedException {
        Thread.sleep(5000); //Wait
        project = new Project(driver);
        project.clickDevice();
    }



}
