package activities.youtube;

import controls.Button;
import controls.Label;
import controls.TextBox;
import org.openqa.selenium.By;

public class ResultsSearchPage {
    public TextBox searchTextBox = new TextBox(By.xpath("//android.widget.EditText[@resource-id=\"com.google.android.youtube:id/search_edit_text\"]"));
    public Button firstResultButton = new Button(By.xpath("(//android.view.ViewGroup[@resource-id='com.google.android.youtube:id/linearLayout'])[1]"));
    public Label resultOfSearch = new Label(By.xpath("//android.view.ViewGroup[@content-desc=\"One Direction - Steal My Girl - 5 minutes, 19 seconds - Go to channel - OneDirectionVEVO - 445M views - 10 years ago - play video\"]"));
}
