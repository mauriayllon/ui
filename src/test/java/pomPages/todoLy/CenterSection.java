package pomPages.todoLy;

import controls.Button;
import controls.Control;
import controls.Label;
import factoryBrowser.Chrome;
import org.openqa.selenium.By;

public class CenterSection {
    public Label projectNameLabel= new Label(By.xpath("//div[@id='CurrentProjectTitle']"));
    public Chrome chrome = new Chrome();

    public void acceptAlert(){
        this.chrome.acceptAlert();
    }
    public CenterSection(){}
}

