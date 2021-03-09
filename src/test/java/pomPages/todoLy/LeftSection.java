package pomPages.todoLy;

import controls.Button;
import controls.TextBox;
import org.openqa.selenium.By;

public class LeftSection {
    public Button addNewProjectButton= new Button(By.xpath("//td[contains(.,'Add New Project') and @class='ProjItemContent']"));
    public Button addButton= new Button(By.xpath("//input[@id='NewProjNameButton']"));
    public TextBox nameProjectTextBox= new TextBox(By.xpath("//input[@id='NewProjNameInput']"));

    //Delete
    public Button deleteCurrentProject = new Button(By.xpath("//li[last()]//td[contains(.,'DeleteProject') and @class='ProjItemContent']"));
    public Button dropdown = new Button(By.xpath("//div[@style='display: block;']/img[@src='/Images/dropdown.png']"));
    public Button deleteProject = new Button(By.xpath("//ul[@id='projectContextMenu']//a[@href='#delete']"));
    public Button deleteVerification = new Button(By.xpath("//div[@id=\"ProjectListPlaceHolder\"]//li[last()]"));
  //Update
    public Button updateCurrentProject = new Button(By.xpath("//li[last()]//td[contains(.,'UpdateProject') and @class='ProjItemContent']"));
    public Button updateProject = new Button(By.xpath("//ul[@id='projectContextMenu']//a[@href='#edit']"));
    public TextBox nameUpdateTextBox= new TextBox(By.id("ItemEditTextbox"));
    public Button saveUpdate = new Button(By.xpath("//li//div[@id='ProjectEditDiv']/*[@id=\"ItemEditSubmit\"]"));
    public Button updateVerification = new Button(By.xpath("//div[@id='CurrentProjectTitle']"));
    public LeftSection(){

    }

}

