import javax.swing.JFrame;

import model.Employee;
import view.Menu;

public class Main {

    public static void main(String[] args) {
        JFrame window = new JFrame();
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setLocation(400, 100);
        window.setTitle("Main Menu");

        var menu = new Menu(window);
        menu.init();

        window.pack();
        window.setVisible(true);
    }
}