package testClean;

import controls.TextBox;
import org.junit.After;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import pomPages.todoLy.*;
import singletonSession.Session;

public class UpdateProjectTest {
    MainPage mainPage= new MainPage();
    LoginModal loginModal= new LoginModal();
    LeftSection leftSection= new LeftSection();
    CenterSection centerSection= new CenterSection();
    String user="upbui@upbui.com";
    String pwd="1234";

    @Test
    public void verify_update_project_todoly() throws InterruptedException {
        String name="UpdateProject";
        Session.getSession().getDriver().get("http://todo.ly/");
        mainPage.loginImage.click();
        loginModal.loginAction(user,pwd);

        leftSection.addNewProjectButton.click();
        leftSection.nameProjectTextBox.set(name);
        leftSection.addButton.click();

        Thread.sleep(4000);
        Assert.assertEquals("ERROR !!Projecto No Creado",name, centerSection.projectNameLabel.getText());

        leftSection.updateCurrentProject.click();
        leftSection.dropdown.click();
        leftSection.updateProject.click();

        leftSection.nameUpdateTextBox.clear();
        leftSection.nameUpdateTextBox.set(name+"2");
        leftSection.saveUpdate.click();
        Thread.sleep(3000);
        String expectedResult="UpdateProject2";
        String actualResult = leftSection.updateVerification.getText();
        System.out.println(actualResult);
        Assert.assertEquals("El projecto no fue actualizado",expectedResult,actualResult);
    }

    @After
    public void close(){
        Session.getSession().closeSession();
    }



}
