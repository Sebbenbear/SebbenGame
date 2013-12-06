package gui;

import javax.swing.*;
import java.awt.*;

public class SebbenFrame extends JFrame {
    private JPanel panel;

    public SebbenFrame(String name){
        super(name);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);	
        panel = new JPanel();
        panel.setBackground(new Color(255,0,0));
        panel.setPreferredSize(new Dimension(400,400));
        getContentPane().add(panel);
        pack();	                            
        setVisible(true);                   
    }
}
