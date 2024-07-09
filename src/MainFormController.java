import javafx.scene.control.TextField;
import javafx.scene.input.KeyEvent;

public class MainFormController {
    public TextField txtKeyPressedAnswer;
    public TextField txtKeyPressed;
    public TextField txtKeyReleased;
    public TextField txtKeyReleasedAnswer;

    public void onKeyPressedActionEvent(KeyEvent keyEvent) {
        String value = txtKeyPressed.getText();
        txtKeyPressedAnswer.setText(value);
    }

    public void onKeyReleasedActionEvent(KeyEvent keyEvent) {
        String value = txtKeyReleased.getText();
        txtKeyReleasedAnswer.setText(value);
    }
}
