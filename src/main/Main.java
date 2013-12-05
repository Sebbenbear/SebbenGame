package main;

import javax.swing.*;
import java.awt.*;


public class Main {
    public static void main(String[] args){
        //System.out.println("Pauline's game");
        
        javax.swing.SwingUtilities.invokeLater(new Runnable(){
        	public void run() {
        		createTheWindow();
        }
        });
    }
        
            private static void createTheWindow(){
        	JFrame frame = new JFrame ("gameFrame"); //this creates the JFrame
        	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);	//what happens when the window is closed
        	
        	//create a green menu bar- makes it have a green background
        	JMenuBar greenMenuBar = new JMenuBar();
        	greenMenuBar.setOpaque(true);
        	greenMenuBar.setBackground(new Color(154,165, 127 ));
        	greenMenuBar.setPreferredSize(new Dimension(200, 20));
        	
        	
        	/*
        	//create yellow label to put in the content pane
        	JLabel yellowLabel = new JLabel();
        	yellowLabel.setOpaque(true);
        	yellowLabel.setBackground(new Color(248,213,131 ));
        	yellowLabel.setPreferredSize(new Dimension(200,180));
        	
        	//set the menu bar and add the content to the content pane.
        	*/
        	
        	

            //display the window
            frame.pack();	//size the frame
            frame.setVisible(true); //show it
        }
        
        
        
 }
    



