package testClean;

import org.junit.After;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import pomPages.todoLy.*;
import singletonSession.Session;

public class DeleteProjectTest {
    MainPage mainPage= new MainPage();
    LoginModal loginModal= new LoginModal();
    LeftSection leftSection= new LeftSection();
    CenterSection centerSection= new CenterSection();
    String user="upbui@upbui.com";
    String pwd="1234";

    @Test
    public void verify_delete_project_todoly() throws InterruptedException {
        String name="DeleteProject";
        Session.getSession().getDriver().get("http://todo.ly/");
        mainPage.loginImage.click();
        loginModal.loginAction(user,pwd);

        leftSection.addNewProjectButton.click();
        leftSection.nameProjectTextBox.set(name);
        leftSection.addButton.click();

        Thread.sleep(4000);
        Assert.assertEquals("ERROR !!Projecto No Creado",name, centerSection.projectNameLabel.getText());

        leftSection.deleteCurrentProject.click();
        leftSection.dropdown.click();
        leftSection.deleteProject.click();
        centerSection.acceptAlert();
        Thread.sleep(3000);

        String actualResult = leftSection.deleteVerification.getText();
        System.out.println(actualResult);
        //Assert.assertFalse("No borro el projecto",!name.equals(actualResult));

    }

    @After
    public void close(){
        Session.getSession().closeSession();
    }


}
