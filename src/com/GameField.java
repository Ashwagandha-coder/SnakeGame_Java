package com;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class GameField extends JPanel implements ActionListener {

    private final int SIZE = 320;
    private final int DOT_SIZE = 16;
    private final int ALL_DOTS = 400;

    private Image dot;
    private Image meet;

    private int MeetX;
    private int MeetY;

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

        setBackground(Color.YELLOW);
        loadImage();
        initGame();
    }

    public void loadImage() {

        ImageIcon imageIconMeet = new ImageIcon("meet.png");
        meet = imageIconMeet.getImage();

        ImageIcon imageIconBox = new ImageIcon("dot.png");
        dot = imageIconBox.getImage();


    }

    public void initGame() {

        dots = 3;

        for (int i = 0; i < dots; i++) {
            x[i] = 48 - i * DOT_SIZE;
            y[i] = 48;
        }

        timer = new Timer(250,this);
        timer.start();
        createMeet();

    }

    public void createMeet() {

        MeetX = new Random().nextInt(20) * DOT_SIZE;
        MeetY = new Random().nextInt(20) * DOT_SIZE;

    }
    @Override
    public void paintComponents(Graphics g) {
        super.paintComponents(g);

        if (inGame) {
            g.drawImage(meet,MeetX,MeetY,this);
            for (int i = 0; i < dots; i++) {
                g.drawImage(dot,x[i],y[i],this);
            }
        }
    }


    public void move() {

        for (int i = dots; i > 0 ; i--) {

            x[i] = x[i - 1];
            y[i] = y[i - 1];

        }
        if (left)
            x[0] -= DOT_SIZE;
        if (right)
            x[0] += DOT_SIZE;
        if (up)
            x[0] -= DOT_SIZE;
        if (down)
            x[0] += DOT_SIZE;

    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if (inGame) {
            move();
        }
        repaint();

    }
}

// Недоделал
