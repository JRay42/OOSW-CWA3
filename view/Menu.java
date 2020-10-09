package view;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Menu {
    
    public JFrame window;

    public Menu(JFrame window) {
        this.window = window;
    }

    public void init() {
        Container cp = window.getContentPane();

        JPanel menuPanel = new JPanel();
        menuPanel.setLayout(new GridLayout(1, 1));
        menuPanel.setPreferredSize(new Dimension(400, 200));

        JButton workButton = new JButton("Work Classes");
        menuPanel.add(workButton);

        cp.add(BorderLayout.CENTER, menuPanel);

        workButton.addActionListener(event -> {
            window.getContentPane().removeAll();
            var panel = new WorkPanel(window);
            panel.init();
            window.pack();
            window.revalidate();
        });
    }
}
