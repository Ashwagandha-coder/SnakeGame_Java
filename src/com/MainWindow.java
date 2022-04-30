package com;

import javax.swing.*;

public class MainWindow extends JFrame {

    public MainWindow() {

        setTitle("Змейка");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setSize(320,245);
        add(new GameField());
        setLocation(400,400);
        setVisible(true);

    }

    public static void main(String[] args) {

        MainWindow mainWindow = new MainWindow();

    }


}
