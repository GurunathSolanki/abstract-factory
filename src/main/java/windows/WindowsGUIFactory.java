package main.java.windows;

import main.java.Button;
import main.java.Checkbox;
import main.java.GUIFactory;

public class WindowsGUIFactory implements GUIFactory {
    @Override
    public Button createButton() {
        return new WindowsButton();
    }

    @Override
    public Checkbox createCheckbox() {
        return new WindowsCheckbox();
    }
}
