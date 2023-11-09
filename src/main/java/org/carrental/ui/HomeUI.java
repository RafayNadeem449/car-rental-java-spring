package org.carrental.ui;

import javax.swing.*;
import java.awt.*;

public class HomeUI {

    public HomeUI()
    {
        JFrame frame = new JFrame("Car Rental App - Home");
        frame.setLayout(new BorderLayout(10,50));

        JPanel btnPanel = new JPanel();
        btnPanel.setLayout(new FlowLayout(FlowLayout.CENTER,10,10)); // Use FlowLayout for the button panel

        btnPanel.add(new JButton("1"));
        btnPanel.add(new JButton("2"));
        btnPanel.add(new JButton("3"));
        btnPanel.add(new JButton("4"));
        btnPanel.add(new JButton("5"));


        JPanel tablePanel = new JPanel();

        String data[][] = {{"101","Rafay","67000"},{"101","Rafay","67000"},{"101","Rafay","67000"},{"101","Rafay","67000"}};

        String column[] = {"ID","NAME","DATA"};

        JTable jtable = new JTable(data,column);

        JScrollPane sp = new JScrollPane(jtable);

        tablePanel.add(sp);



        frame.add(btnPanel, BorderLayout.SOUTH);
        frame.add(tablePanel,BorderLayout.CENTER);
        frame.add(new JButton("Hello"),BorderLayout.NORTH);


        frame.setSize(1500, 1000);
        frame.setVisible(true);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


    }
}
