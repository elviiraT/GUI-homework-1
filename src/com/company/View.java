package com.company;
import javax.swing.*;
import java.awt.event.ActionEvent;

public class View extends JFrame
{
    public View(Controller controller)
    {
        super ("window");
        this.controller = controller;
        setVisible(true);

        setSize(500, 400);

        menuBar = new JMenuBar();
        JMenu fileMenu = new JMenu("file");
        JMenuItem quitItem = new JMenuItem ("quit");
        quitItem.addActionListener((ActionEvent e) -> System.exit(0));

        setJMenuBar(menuBar);
        menuBar.add (fileMenu);
        fileMenu.add (quitItem);

        JComboBox <String> comboBox = new JComboBox<>();
        comboBox.addItem ("first");
        comboBox.addItem ("second");
        comboBox.addItem ("third");
        comboBox.addActionListener((ActionEvent e)-> System.out.println(comboBox.getSelectedItem()));


        menuBar.add(comboBox);


    }
    private Controller controller;
    private JMenuBar menuBar;

}
