package main;

import javax.swing.*;
import java.awt.*;


public class Main {
    public static void main(String[] args){
        System.out.println("Pauline's game");
        /* dont add code if you dont know what it does */
        createTheWindow();
    }
 
    /* this should be in a seperate class, probably extending JFrame */
    private static void createTheWindow(){
        JFrame frame;
        JPanel panel;

        frame = new JFrame ("gameFrame"); //this creates the JFrame
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);	//what happens when the window is closed
        panel = new JPanel();
        panel.setBackground(new Color(255,0,0));
        panel.setPreferredSize(new Dimension(400,400));
        frame.getContentPane().add(panel);
        frame.pack();	//size the frame
        frame.setVisible(true); //show it
    }
}




