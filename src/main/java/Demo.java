package main.java;

import main.java.mac.MacGUIFactory;
import main.java.windows.WindowsGUIFactory;

public class Demo {
    static Application app;
    public static void main(String[] args) {
        app = configureApp();
        app.runApplication();
    }

    private static Application configureApp() {
        String os = System.getProperty("os.name").toLowerCase();
        if (os.contains("windows")) {
            return new Application(new WindowsGUIFactory());
        } else {
            return new Application(new MacGUIFactory());
        }
    }
}
