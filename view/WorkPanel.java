package view;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.GridLayout;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

import controller.ButtonListener;


public class WorkPanel {
    
    private JFrame window;
    private JButton quitButton = new JButton("Quit");
    private JButton raiseButton = new JButton("Raise Salary");
    private JButton salaryButton = new JButton("Set Salary ");
    private JButton viewButton = new JButton("View Salaries");
    private JRadioButton[] radioButtons;
    private JTextField raiseField = new JTextField(5);
    private JTextField salaryField = new JTextField(5);
    
    private WorkCanvas canvas;

    public WorkPanel(JFrame window) {
        this.window = window;
    }

    public void init() {
        Container cp = window.getContentPane();

        JPanel southPanel = new JPanel();
        southPanel.setLayout(new GridLayout(3, 1));
        window.setTitle("Work Panel");
        cp.add(BorderLayout.SOUTH, southPanel);

        radioButtons = new JRadioButton[4];
        radioButtons[0] = new JRadioButton("Employee");
        radioButtons[1] = new JRadioButton("Manager");
        radioButtons[2] = new JRadioButton("Executive");
        radioButtons[3] = new JRadioButton("President");
        JPanel radioPanel = new JPanel();
        ButtonGroup workerGroup = new ButtonGroup();
        for (var b: radioButtons) {
            radioPanel.add(b);
            workerGroup.add(b);
        }
        southPanel.add(radioPanel);

        JPanel south2 = new JPanel();
        south2.add(new JLabel("Salary ($): "));
        south2.add(salaryField);
        south2.add(salaryButton);
        south2.add(new JLabel("Raise  (%):"));
        south2.add(raiseField);
        south2.add(raiseButton);
        southPanel.add(south2);

        JPanel south3 = new JPanel();
        south3.add(viewButton);
        south3.add(quitButton);
        southPanel.add(south3);
        south3.setLayout(new GridLayout(1, 2));

        canvas = new WorkCanvas(this);
        cp.add(BorderLayout.CENTER, canvas);

        ButtonListener listener = new ButtonListener(this);
        quitButton.addActionListener(listener);
        raiseButton.addActionListener(listener);
        salaryButton.addActionListener(listener);
        viewButton.addActionListener(listener);
    }

    public JRadioButton[] getRadioButtons() {
        return radioButtons;
    }

    public JButton getRaiseButton() {
        return raiseButton;
    }
    
    public JButton getSalaryButton() {
        return salaryButton;
    }
    
    public JButton getQuitButton() {
        return quitButton;
    }
    
    public JTextField getRaiseField() {
        return raiseField;
    }

    public JTextField getSalaryField() {
        return salaryField;
    }

    public JButton getViewButton() {
        return viewButton;
    }

    public JFrame getWindow() {
        return window;
    }

    public WorkCanvas getCanvas() {
        return canvas;
    }
}
