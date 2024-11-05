package activities.whendo;

import controls.Button;
import controls.TextBox;
import org.openqa.selenium.By;

public class TaskFormsPage {
    public TextBox taskNameTextBox = new TextBox(By.xpath("//android.widget.EditText[@resource-id=\"com.vrproductiveapps.whendo:id/noteTextTitle\"]"));
    public TextBox notesTextBox = new TextBox(By.xpath("//android.widget.EditText[@resource-id=\"com.vrproductiveapps.whendo:id/noteTextNotes\"]"));
    public Button addTaskButton = new Button(By.id("com.vrproductiveapps.whendo:id/saveItem"));
    public Button updateTaskbutton = new Button(By.xpath("//android.widget.TextView[@content-desc=\"Save\"]"));
    public Button deleteTaskButton = new Button(By.xpath("//android.widget.TextView[@content-desc=\"Delete\"]"));

    public void addTask(String nameOfTask){
        taskNameTextBox.setText(nameOfTask);
        addTaskButton.click();
    }
}
