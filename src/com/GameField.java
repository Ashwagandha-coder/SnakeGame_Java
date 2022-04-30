package com;

import javax.swing.*;
import java.awt.*;

public class GameField extends JPanel {

    private final int SIZE = 320;
    private final int DOT_SIZE = 16;
    private final int ALL_DOTS = 400;

    private Image dot;
    private Image meet;

    private int AppleX;
    private int AppleY;

    private int[] x = new int[ALL_DOTS];
    private int[] y = new int[ALL_DOTS];

    private int dots;
    private Timer timer;

    private boolean left = false;
    private boolean right = true;
    private boolean up = false;
    private boolean down = false;
    private boolean inGame = true;


    public GameField() {

        setBackground(Color.BLACK);
        loadImage();
    }

    public void loadImage() {

        ImageIcon imageIconMeet = new ImageIcon("мясо.jpg");
        meet = imageIconMeet.getImage();

        ImageIcon imageIconBox = new ImageIcon("коробка.png");
        dot = imageIconBox.getImage();




    }

}
