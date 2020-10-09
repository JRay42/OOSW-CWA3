package view;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.util.ArrayList;

import javax.swing.JPanel;

import model.CompanyPersonnel;
import model.Employee;
import model.Executive;
import model.Manager;
import model.President;

public class WorkCanvas extends JPanel{
    
    private WorkPanel panel;
    private ArrayList<Employee> personnel;
    
    public WorkCanvas(WorkPanel panel) {
        this.panel = panel;
        setPreferredSize(new Dimension(670, 650));
        setBackground(Color.BLACK);
        personnel = CompanyPersonnel.database;
    }

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);

        Graphics2D g2 = (Graphics2D) g;
        int i = 0;
        for (var p: personnel) {
            p.render(g2, i);
            ++i;
        }
    }

    public ArrayList<Employee> getPersonnel() {
        return personnel;
    }
}
