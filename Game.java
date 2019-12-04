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
 JButton buttonstart, decison1,decison2,decison3;
 Font titleF = new Font("Times New Roman", Font.BOLD, 40);
 Font standard = new Font("Times New Roman", Font.PLAIN ,20);
 JTextArea gametextinfo;
 ScreenHandler stool= new ScreenHandler();
 choicemaker dmaker = new choicemaker();
 int playerhp,damage;
 String weapons,stagenum;
 
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
   
       gametextinfo = new JTextArea("");
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
        weapons = "Knife";
        weaponname.setText(weapons);
        hpnumber.setText(""+playerhp);
        choosepath();
    }
    public void choosepath()
    {
        stagenum = "choosepath";
        gametextinfo.setText("You’re wandering through a magical forest alone and see 3 paths diverge before you.");
        decison1.setText("Take the Path 1");
        decison2.setText("Take the Path 2");
        decison3.setText("Take the Path 3");
    }
    
    public void TakethePath1()
    {
        stagenum = "TakethePath1";
        gametextinfo.setText("You take the first path and see an old castle over a hill.");
        decison1.setText("Walk to the castle.");
        decison2.setText("Continue down the path.");
        decison3.setText("Stop and have a picnic.");
  
    }
      public void walktocastle()
    {
        stagenum = "walkoverhill";
        gametextinfo.setText("You walk over the hill and enter the castle, a peasant man flags you down and asks you to go on a quest to find his daughter.");
        decison1.setText("Accept the quest.");
        decison2.setText("Murder him and take his stuff");
        decison3.setText("Tell him no.");
  
    }
          public void accept()
{
stagenum = "accept";
gametextinfo.setText("He gives you a map and a pineapple cake and you follow the map and come across a cave with a dragon in it.");
decison1.setText("Go to cave.");
decison2.setVisible(false);
 decison3.setVisible(false);
}
public void murder()
{
stagenum = "murder";
gametextinfo.setText("The castle guards corner you and execute you for crimes.");
decison1.setText("Death.");
decison2.setVisible(false);
 decison3.setVisible(false);
}
public void no()
{
stagenum = "no";
gametextinfo.setText("What kind of knight are you, refusing quests SMH.");
decison1.setText("Death.");
decison2.setVisible(false);
 decison3.setVisible(false);
}
    public void pit()
{
stagenum = "pit";
gametextinfo.setText("You continue down the path and see a large pit blocking the path");
decison1.setText("keep going");//river//
decison2.setText("climb into the pit with a rope");
decison3.setText("Jump into the pit without looking");
}
  public void climb()
{
stagenum = "climb";
gametextinfo.setText(" There is a sword stuck in a stone you collect the sword.");
decison1.setText("pick up the sword and keep going back to the ground.");
decison2.setText("Ingore the sword and keep going back to the ground.");
decison3.setVisible(false);
}
  public void jump()
{
stagenum = "jump";
gametextinfo.setText("You land on a large rock and break your back, unable to move you die.");
decison1.setText("Death.");
decison2.setVisible(false);
 decison3.setVisible(false);
}

      public void picnic()
    {
        stagenum = "stage2d1d3";
        gametextinfo.setText("You stop and have a picnic.");
        decison1.setText("Eat bread.");
        decison2.setText("Drink Wine.");
        decison3.setText("Eat some mysterious berries you find next to you");
  
    }
      
      public void bread()
    {
        stagenum = "bread";
        gametextinfo.setText("It was moldy and bad, you die.");
            decison1.setText("Death.");
       decison2.setVisible(false);
        decison3.setVisible(false);
      }
        public void wine()
    {
        stagenum = "wine";
        gametextinfo.setText("You drink too much wine, and are too distracted to notice the bandits sneaking up on you. They kill you and take all your stuff");
            decison1.setText("Death.");
       decison2.setVisible(false);
        decison3.setVisible(false);
    }
              public void berries()
    {
        stagenum = "berries";
        gametextinfo.setText("They were poisonous, you die.");
            decison1.setText("Death.");
       decison2.setVisible(false);
        decison3.setVisible(false);
    }
    public void TakethePath2()
    {
        stagenum = "TakethePath2";
        gametextinfo.setText("You come across a small village. It seems quiet and empty, with nobody in sight.");
        decison1.setText("Keep walking through.");
        decison2.setText("Look around and see if anyone’s there.");
        decison3.setText(" Loot the houses. No one’s there to stop you.");
    }
public void keepwalkingthrough()
    {
        stagenum = "keepwalkingthrough";
        gametextinfo.setText("You get run over by a knight on horse and die");
      decison1.setText("Death.");
       decison2.setVisible(false);
        decison3.setVisible(false);
    }
public void Lookaround()
    {
        stagenum = "Lookaround";
        gametextinfo.setText("You go into the town square and get attacked by wolves and die.");
      decison1.setText("Death.");
       decison2.setVisible(false);
        decison3.setVisible(false);
    }
public void loot()
    {
        stagenum = "Loot";
        gametextinfo.setText(" You kick down the door to a house and take all the valuables inside. You go to the next house to do the same, but as soon as you enter you’re stabbed with a pitchfork by an angry neighbor. You are dead.");
      decison1.setText("Death.");
       decison2.setVisible(false);
        decison3.setVisible(false);
    }

    public void TakethePath3()
    {
        stagenum = "TakethePath3";
        gametextinfo.setText("You take the third path and have to cross a river to continue.");
        decison1.setText("Cross the river.");
        decison2.setText("Look for a bridge.");
        decison3.setText("Turn back.");
  
    }
  
   
    public void crossriver()
    {
        stagenum = "crossriver";
        gametextinfo.setText("While attempting to cross the river you drown and die.");
        decison1.setText("Death.");
       decison2.setVisible(false);
        decison3.setVisible(false);
  
    }
      public void bridge()
    {
        stagenum = "bridge";
        gametextinfo.setText("After crossing the bridge, you wander upon an old farm.");
        decison1.setText("Go investigate.");
        decison2.setText("Stake out the property.");
        decison3.setText("Continue down the river.");
  
    }
     public void investigate()
    {
        stagenum = "investigate";
        gametextinfo.setText("You are ambushed by a group of bandit and they kill you.");
      decison1.setText("Death.");
       decison2.setVisible(false);
        decison3.setVisible(false);
  
    }

     public void stakeout()
    {
        stagenum = "stakeout";
        gametextinfo.setText("You see bandits leaving the farm.");
        decison1.setText("Trail them.");
        decison2.setText("Enter the farm.");
        decison3.setText("Continue down the river.");
  
    }
       public void trail()
    {
        stagenum = "trail";
        gametextinfo.setText("They disappear into the woods, you can't track them down and must go back.");
      decison1.setText("Enter the farm.");
       decison2.setText("Continue down the river.");
     
    }
     public void Enterthefarm()
    {
        stagenum = "Enterthefarm";
        gametextinfo.setText("You are ambushed by a bandit a lone and start a battle.");
      decison2.setText("Eat some cheese you found.");
       decison3.setText("Drink some milk you found.");
      decison1.setText("Keep looking around the farm.");
  
    }
      public void Keeplookingaroundthefarm()
    {
        stagenum = "Keeplookingaroundthefarm";
        gametextinfo.setText("You find a map to great treasure along with a pineapple cake and follow the map to a cave and you enter it. You have to fight a giant dragon.");
      decison1.setText("Throw pineapple cake.");
       decison2.setText("Attack!");
      decison3.setText("Beg for mercy.");
  
    }

public void Throwpineapplecake()
    {
        stagenum = "Throwpineapplecake";
        gametextinfo.setText("The cake is super effective, killing the dragon instantly. WIth all the gold you find, you retire.");
      decison1.setText("THE END!");
      decison2.setVisible(false);
        decison3.setVisible(false);
  
    }
public void Attack()
    {
        stagenum = "Attack";
        gametextinfo.setText("Your pitiful attack does nothing, the dragon eats you.");
       decison1.setText("Death.");
       decison2.setVisible(false);
        decison3.setVisible(false);
  
    }
public void Begformercy()
    {
        stagenum = "Begformercy";
        gametextinfo.setText("The dragon doesn't take kindly to cowards,you die.");
       decison1.setText("Death.");
       decison2.setVisible(false);
        decison3.setVisible(false);
  
    }
     public void Eatsomecheeseyoufound()
    {
        stagenum = "Eatsomecheeseyoufound";
        gametextinfo.setText("The cheese has been there for months and has gone bad.");
       decison1.setText("Death.");
       decison2.setVisible(false);
        decison3.setVisible(false);
  
    }
   public void Drinksomemilkyoufound()
    {
        stagenum = "Drinksomemilkyoufound";
        gametextinfo.setText("he milk is chunky, you choke and die.");
        decison1.setText("Death.");
       decison2.setVisible(false);
        decison3.setVisible(false);
  
    }
   
     public void continuedown()
    {
        stagenum = " continuedown";
        gametextinfo.setText("You continue along the riverbank  and see an old castle over a hill.");
      decison1.setText("Walk to the castle.");
        decison2.setText("Continue down the path.");
        decison3.setText("Stop and have a picnic.");
  
    }
              public void gameover()
    {
        stagenum = "gameover";
        gametextinfo.setText("GAME OVER!");
        decison1.setText("Return from beginning.");
        decison2.setVisible(false);
        decison3.setVisible(false);
  
    }
              public void end()
    {
        stagenum = "end";
        gametextinfo.setText("THE END");
        decison1.setText("Return from beginning.");
        decison2.setVisible(false);
        decison3.setVisible(false);
  
    }
    
    
   public class ScreenHandler implements ActionListener {
       public void actionPerformed(ActionEvent event){           
           createGame();
       }
   }
   
   public class choicemaker implements ActionListener{
   public void actionPerformed(ActionEvent event){
   String choicemake = event.getActionCommand();
   
   switch(stagenum){
       case "choosepath":
              switch (choicemake){
                  case "d1": break;
                  case "d2": break;
                  case "d3": TakethePath3();break;
              }
       case "TakethePath3":
            switch (choicemake){
                  case "d1": break;
                  case "d2": break;
                  case "d3": bridge(); break;
            }
       case "bridge":
           switch(choicemake){
               case "d1": break;
               case "d2": stakeout();break;
               case "d3": break;
           }
       case "stakout":
            switch(choicemake){
                case "d1":break;
                case "d2": Enterthefarm();break;
                case "d3": break;
            }
           }
   }
   
   }
   }


