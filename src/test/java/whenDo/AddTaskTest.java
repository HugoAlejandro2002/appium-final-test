package whenDo;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Date;

public class AddTaskTest extends WhenDoBase{
    @Test
    public void addTaskTest(){
        String task = "UPB"+new Date().getTime();
        String noteTask= "UPB";

        mainPage.addTaskButton.click();
        taskFormsPage.taskNameTextBox.setText(task);
        taskFormsPage.notesTextBox.setText(noteTask);
        taskFormsPage.addTaskButton.click();
        String actualTask = mainPage.nameOfTaskLabel.getText();
        String actualNoteTask = mainPage.noteOfTaskLabel.getText();
        Assertions.assertEquals(task, actualTask);
        Assertions.assertEquals(noteTask,actualNoteTask);
    }

}
