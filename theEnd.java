//Name: Eric Engman
//Final Project
//Description: Displays a window that says "The End :)"

import javax.swing.JFrame;
import java.awt.Color;
import java.awt.Container;
import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Font;

public class theEnd {

   private JFrame gameWindow;
   private Container con;
   private JPanel titlePanel;
   private JLabel titleLabel;
   private Font titleFont = new Font("Times New Roman", Font.PLAIN, 120);
   
   //constructor 
   public theEnd(){
      gameWindow = new JFrame(); //window is initialized
      gameWindow.setSize(800,600); //window size (800 pixel, by 600 pixel)
      gameWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //window close operation
      gameWindow.getContentPane().setBackground(Color.black); //sets color
      gameWindow.setLayout(null); //Disabled default layout, want to use custom for our game
      gameWindow.setLocationRelativeTo(null); //Centers the window on the screen
      gameWindow.setVisible(true); //So you can see the window
      con = gameWindow.getContentPane(); //Made a container
      
      titlePanel = new JPanel(); //title is initialized
      titlePanel.setBounds(100,200,600,150); //Where we place the title panel (a space for the text)
      titlePanel.setBackground(Color.black);
      con.add(titlePanel);//Adds the title panel to the window content pane container
      
      titleLabel = new JLabel("THE END :)"); //The title 
      titleLabel.setForeground(Color.white); //sets the color of the text
      titlePanel.add(titleLabel); //adds the title name to the panel created previously
      titleLabel.setFont(titleFont); //Sets font for the titleNameLabel
   
   }//the end constructor method

}//theEnd class 