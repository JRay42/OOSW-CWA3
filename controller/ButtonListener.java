package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

import model.CompanyPersonnel;
import model.Employee;
import view.Menu;
import view.WorkPanel;

public class ButtonListener implements ActionListener {

    private ArrayList<Employee> personnel;
    private JRadioButton[] radioButtons;
    private WorkPanel panel;

    public ButtonListener(WorkPanel panel) {
        this.panel = panel;
        radioButtons = panel.getRadioButtons();
        personnel = CompanyPersonnel.database;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        
        ArrayList<Employee> people = panel.getCanvas().getPersonnel();
        Object source = (JButton) e.getSource();
        
        if (source == panel.getQuitButton()) {
            panel.getWindow().getContentPane().removeAll();
            var menu = new Menu(panel.getWindow());
            menu.init();
            panel.getWindow().pack();
            panel.getWindow().revalidate();
        } else if (source == panel.getViewButton()) {
            panel.getCanvas().repaint();
        } else if (source == panel.getRaiseButton()) {
            double percentage;
            try{
                percentage = Double.parseDouble(panel.getRaiseField().getText());
            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(panel.getWindow(), "Please input a valid number.", "Percentage Format Error", 0);
                return;
            }
            ArrayList <Employee> temp = personnelSelection();
            for (var p: temp) {
                p.raiseSalary(percentage);
            }
            panel.getCanvas().repaint();
        } else if (source == panel.getSalaryButton()) {
            double salary;
            try{
                salary = Double.parseDouble(panel.getSalaryField().getText());
            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(panel.getWindow(), "Please input a valid number.", "Percentage Format Error", 0);
                return;
            }
            ArrayList <Employee> temp = personnelSelection();
            for (var p: temp) {
                p.setSalary(salary);
            }
            panel.getCanvas().repaint();
        }
    }

    public ArrayList<Employee> personnelSelection() {
        ArrayList<Employee> temp = new ArrayList<>();
        if (radioButtons[0].isSelected()) {
            for (int i = 0; i < personnel.size(); ++i) {
                if (personnel.get(i).getType()  == "Employee") {
                    temp.add(personnel.get(i));
                }
            }
        } else if (radioButtons[1].isSelected()) {
            for (int i = 0; i < personnel.size(); ++i) {
                if (personnel.get(i).getType()  == "Manager") {
                    temp.add(personnel.get(i));
                }
            }
        } else if (radioButtons[2].isSelected()) {
            for (int i = 0; i < personnel.size(); ++i) {
                if (personnel.get(i).getType()  == "Executive") {
                    temp.add(personnel.get(i));
                }
            }
        } else if (radioButtons[3].isSelected()) {
            for (int i = 0; i < personnel.size(); ++i) {
                if (personnel.get(i).getType()  == "President") {
                    temp.add(personnel.get(i));
                }
            }
        }
        return temp;
    }
}
