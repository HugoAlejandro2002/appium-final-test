package whenDo;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Date;

public class CRUDTask extends WhenDoBase{
    @Test
    public void taskCRUDIsSuccessfull(){
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

        String updatedTask = task + "UPDATED";
        String updatedNote = noteTask + "UPDATED";

        mainPage.taskButton.click();
        taskFormsPage.taskNameTextBox.clearSetText(updatedTask);
        taskFormsPage.notesTextBox.clearSetText(updatedNote);
        taskFormsPage.updateTaskbutton.click();
        actualTask = mainPage.nameOfTaskLabel.getText();
        actualNoteTask = mainPage.noteOfTaskLabel.getText();
        Assertions.assertEquals(updatedTask, actualTask);
        Assertions.assertEquals(updatedNote,actualNoteTask);

        mainPage.taskButton.click();
        taskFormsPage.deleteTaskButton.click();
        deleteProjectPopUp.confirmDeleteButton.click();
        Assertions.assertTrue(mainPage.noTasksLabel.isControlDisplayed());
    }
}
