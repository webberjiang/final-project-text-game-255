/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package game;
import javax.swing.JFrame;
import java.awt.Color;
import java.awt.Font;
import java.awt.Container;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;
import java.util.Scanner;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JTextArea;

/**
 *
 * @author Webber_Jiang
 */
public class Game {
 JFrame gamewindow;
 Container cont;
 JPanel title, buttonP, mainStory, choicemaking,playerinfo;
 JLabel titleL, hp, hpnumber, weapon, weaponname;
 JButton buttonstart, decison1,decison2,decison3,decison4;
 Font titleF = new Font("Times New Roman", Font.BOLD, 40);
 Font standard = new Font("Times New Roman", Font.PLAIN ,20);
 JTextArea gametextinfo;
 ScreenHandler stool= new ScreenHandler();
 choicemaker dmaker = new choicemaker();
 int playerhp;
 String weapons;
 
    /**gs the command line arguments
     */
    public static void main(String[] args) {   
 
        new Game();
// TODO code application logic here
    }
    public Game()
    {
        
        gamewindow = new JFrame();
        gamewindow.setSize(800,600);
        gamewindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        gamewindow.getContentPane().setBackground(Color .LIGHT_GRAY);
        gamewindow.setLayout(null);
        gamewindow.setVisible(true);
        cont = gamewindow.getContentPane();
        
     
        title= new JPanel();
        title.setBounds(100,100,600,150);
        title.setBackground(Color .LIGHT_GRAY);
        titleL = new JLabel("TEXT ROLE PLAY GAME");
        titleL.setForeground(Color .BLUE);
        titleL.setFont(titleF);
        
        buttonP = new JPanel();        
        buttonP.setBounds(300,400,200,100);
        buttonP.setBackground(Color .LIGHT_GRAY);
        
        buttonstart = new JButton("CLICK TO START");
        buttonstart.setBackground(Color .LIGHT_GRAY);
        buttonstart.setForeground(Color .white);
        buttonstart.setFont(standard);
        buttonstart.addActionListener(stool);
        buttonstart.setFocusPainted(false);
        
        title.add(titleL);
        buttonP.add(buttonstart);
        cont.add(title);
        cont.add(buttonP);
        
        
        
    }
   public void createGame(){
       title.setVisible(false);
       buttonP.setVisible(false);
       mainStory = new JPanel();
       mainStory.setBounds(100, 100, 600,250);
       mainStory.setBackground(Color .LIGHT_GRAY);
       cont. add(mainStory);
   
       gametextinfo = new JTextArea("______________________");
       gametextinfo.setBounds(100,100,600,250);
       gametextinfo.setBackground(Color .LIGHT_GRAY);
       gametextinfo.setForeground(Color .white);
       gametextinfo.setFont(standard);
       gametextinfo.setLineWrap(true);
       mainStory.add(gametextinfo);
       
       choicemaking = new JPanel();
       choicemaking.setBounds(250, 350, 300, 150);
       choicemaking.setBackground(Color .LIGHT_GRAY);
       choicemaking.setLayout(new GridLayout(4,1));
       cont.add(choicemaking);
       
       decison1 = new JButton("decison");
       decison1.setBackground(Color .BLACK);
       decison1.setForeground(Color .WHITE);
       decison1.setFont(standard);
       decison1.setFocusPainted(false);
       decison1.addActionListener(dmaker);
       decison1.setActionCommand("d1");
       choicemaking.add(decison1);
       
         decison2 = new JButton("decison");
       decison2.setBackground(Color .BLACK);
       decison2.setForeground(Color .WHITE);
       decison2.setFont(standard);
       decison2.setFocusPainted(false);
        decison2.addActionListener(dmaker);
        decison2.setActionCommand("d2");
       choicemaking.add(decison2);
       
         decison3 = new JButton("decison");
       decison3.setBackground(Color .BLACK);
       decison3.setForeground(Color .WHITE);
       decison3.setFont(standard);
       decison3.setFocusPainted(false);
        decison3.addActionListener(dmaker);
       decison3.setActionCommand("d3");
        choicemaking.add(decison3);
       
         decison4 = new JButton("decison");
       decison4.setBackground(Color .BLACK);
       decison4.setForeground(Color .WHITE);
      decison4.setFont(standard);
      decison4.setFocusPainted(false);
       decison4.addActionListener(dmaker);
       decison4.setActionCommand("d4");
       choicemaking.add(decison4);
       
       playerinfo = new JPanel();
       playerinfo.setBounds(100,15,600,50);
       playerinfo.setBackground(Color .LIGHT_GRAY);
       playerinfo.setLayout(new GridLayout(1,4));
       cont. add(playerinfo);
       
      hp = new JLabel("HP:");
      hp.setFont(standard);
      hp.setForeground(Color .WHITE);
      playerinfo.add(hp);
      hpnumber = new JLabel();
      hpnumber.setFont(standard);
      hpnumber.setForeground(Color .WHITE);
      playerinfo.add(hpnumber);
     weapon = new JLabel("Weapon:");
      weapon.setFont(standard);
      weapon.setForeground(Color .WHITE);
      playerinfo.add(weapon);
    weaponname = new JLabel();
      weaponname.setFont(standard);
      weaponname.setForeground(Color .WHITE);
      playerinfo.add(weaponname);
      
      playersetup();
   }           

    public void playersetup() {
        
        playerhp = 15;
        weapons = "Sword";
        weaponname.setText(weapons);
        hpnumber.setText(""+playerhp);
        stage1();
    }
    public void stage1()
    {
        gametextinfo = new JTextArea("________________");
        decison1.setText("___");
        decison2.setText("___");
        decison3.setText("___");
        decison3.setText("___");
    }
   public class ScreenHandler implements ActionListener {
       public void actionPerformed(ActionEvent event){           
           createGame();
       }
   }
   public class choicemaker implements ActionListener{
   public void actionPerformed(ActionEvent event){
   }
   }
   }


