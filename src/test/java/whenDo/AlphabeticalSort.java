package whenDo;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

public class AlphabeticalSort extends WhenDoBase{
    @Test
    public void alphabeticalSort(){
        String[] taskNames = {"AAAA",  "GGGG", "ZZZ"};
        for (String taskName : taskNames) {
            addTask(taskName);
        }
        mainPage.sortByOrder.click();
        mainPage.alphabeticOption.click();
//        for(int i = 1; i <= 3; i++){
        Assertions.assertEquals(taskNames[0], mainPage.getLabelOfTask(3));
        Assertions.assertEquals(taskNames[1], mainPage.getLabelOfTask(2));
        Assertions.assertEquals(taskNames[2], mainPage.getLabelOfTask(1));

//        }
    }
    private void addTask(String taskName){
        mainPage.addTaskButton.click();
        taskFormsPage.addTask(taskName);
    }
}
