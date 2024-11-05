package activities.whendo;

import controls.Button;
import controls.Label;
import controls.ViewGroup;
import org.openqa.selenium.By;


public class MainPage {
    public Button addTaskButton = new Button(By.xpath("//android.widget.ImageButton[@resource-id=\"com.vrproductiveapps.whendo:id/fab\"]"));
    public Label nameOfTaskLabel = new Label(By.xpath("//android.widget.TextView[@resource-id=\"com.vrproductiveapps.whendo:id/home_list_item_text\"]"));
    public Label noteOfTaskLabel = new Label(By.xpath("//android.widget.TextView[@resource-id=\"com.vrproductiveapps.whendo:id/home_list_item_text2\"]"));
    public Button taskButton = new Button(By.xpath("//android.widget.ListView[@resource-id=\"com.vrproductiveapps.whendo:id/notesList\"]/android.view.ViewGroup/android.widget.LinearLayout"));
    public Label noTasksLabel = new Label(By.xpath("//android.widget.TextView[@resource-id=\"com.vrproductiveapps.whendo:id/noNotesText\"]"));
    public Button sortByOrder = new Button(By.xpath("//android.widget.ImageView[@content-desc=\"Expand\"]"));
    public Button alphabeticOption = new Button(By.xpath("//android.widget.CheckedTextView[@resource-id=\"android:id/text1\" and @text=\"Alphabetic\"]"));

    public Button openNavigationDrawerButton = new Button(By.xpath("//android.widget.ImageButton[@content-desc=\"Open navigation drawer\"]"));
    public Button editListsOption = new Button(By.xpath("//android.widget.CheckedTextView[@resource-id=\"com.vrproductiveapps.whendo:id/design_menu_item_text\" and @text=\"Edit Lists\"]"));

    public String getLabelOfTask(int numberOfLabel){
        String xpath = "//android.widget.ListView[@resource-id=\"com.vrproductiveapps.whendo:id/notesList\"]/android.view.ViewGroup[" + numberOfLabel + "]/android.widget.LinearLayout";
        ViewGroup viewGroup = new ViewGroup(By.xpath(xpath));
        return viewGroup.findContentOfChildByXpath("//android.widget.TextView[@resource-id=\"com.vrproductiveapps.whendo:id/home_list_item_text\"]");
    }
}
