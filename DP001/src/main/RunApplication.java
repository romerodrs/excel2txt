package main;

import controller.MainWindowController;
import view.MainWindow;

public class RunApplication {
	/**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        MainWindow mainWindow = new MainWindow();
        MainWindowController mainWindowController = new MainWindowController(mainWindow);
        mainWindow.setVisible(true);
        mainWindow.setLocationRelativeTo(null);
    }
}
