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
        //todo Assert: new page
    }

    @Test(dependsOnMethods = "enterLoginData")
    public void createProject() throws InterruptedException {
        Thread.sleep(5000); // todo wait
        project = new Project(driver);
        project.clickCreateProject();
        project.inputName("testKaty");
        project.btnCreate();
        //todo Assert there is project new
    }

    @Test(dependsOnMethods = "createProject")
    public void addDeviceInProject() throws InterruptedException {
        Thread.sleep(5000); //todo Wait
        project.clickDevice();
        Thread.sleep(5000); //todo Wait
        project.btnAddDevice();
        //todo Assert add device
    }

    //todo: create widget device

    @Test(dependsOnMethods = "addDeviceInProject")
    public void deleteProject() throws InterruptedException {
        project.clickListOfProjects();
        Thread.sleep(5000); // todo wait
        project.clickProjectSetting();
        project.clickProjectRemove();
        project.confirmRemoveProjectBtn();

    }



}
