import javax.swing.*;
import java.awt.*;
import java.util.*;
import java.io.*;

public class Scoreboard extends JPanel
{
   private JLabel ralphS;
   private JLabel ralphH;
   private JLabel felixS;
   private JLabel felixH;
  //private int highscoreralph;
  //private int highscorefelix;
   private int scorefelix;
   private int gamecount=0;
   private int scoreralph;
   private JPanel scores;


   public Scoreboard()
   {
      //Read from data.txt file and initialize game (MP)
      setGames();
      createLayout();
   
   }
   
   public void createLayout()
   {
      setLayout(new BorderLayout());
      setBackground(Color.BLACK);
      setForeground(Color.YELLOW);
      JLabel title = new JLabel("Scoreboard", JLabel.CENTER);
      title.setForeground(Color.YELLOW);   
      add(title, BorderLayout.NORTH);
      //add(new JLabel("Scoreboard", SwingConstants.CENTER), BorderLayout.NORTH);
      scores = new JPanel();
      scores.setLayout(new GridLayout(3, 3));
      scores.setBackground(Color.BLACK);
   
      //scores.add( new JLabel("Game Count: ", SwingConstants.CENTER));
      JLabel gc = new JLabel("Game Count:", SwingConstants.CENTER);
      //setBackground(Color.BLACK);
      gc.setForeground(Color.YELLOW);   
      scores.add(gc);

   
      ralphH = new JLabel("" + gamecount);
      ralphH.setHorizontalAlignment(0);
      ralphH.setForeground(Color.YELLOW);
      scores.add(ralphH);
      
      scores.add(new JLabel("  ", SwingConstants.CENTER));
      scores.add(new JLabel("  ", SwingConstants.CENTER));
      /*scores.add( new JLabel(" Ralph", SwingConstants.CENTER));
      scores.add( new JLabel(" Felix", SwingConstants.CENTER));*/
      JLabel ral;
      ral = new JLabel("  Ralph", SwingConstants.CENTER);
      ral.setForeground(Color.YELLOW);
      scores.add(ral);
      
      ral = new JLabel("  Felix", SwingConstants.CENTER);
      ral.setForeground(Color.YELLOW);
      scores.add(ral);
   
      JLabel label4 = new JLabel("Windows: ");
      label4.setHorizontalAlignment(0);
      label4.setForeground(Color.YELLOW);
      scores.add(label4);
   
      ralphS = new JLabel("0");
      ralphS.setHorizontalAlignment(0);
      ralphS.setForeground(Color.YELLOW);
      scores.add( ralphS);
   
      felixS = new JLabel("0");
      felixS .setHorizontalAlignment(0);
      ralphS.setForeground(Color.YELLOW);
      scores.add( felixS );
   
      add(scores,BorderLayout.CENTER);
      }

   public void setScoreFelix(int x)
   {
      scorefelix = x;
      felixS.setText("" + x);
      felixS.setForeground(Color.YELLOW);
   }

   public void setScoreRalph(int x)
   {
      scoreralph = x;
      ralphS.setText("" + x);
      ralphS.setForeground(Color.YELLOW);
   }
   public int getScoreFelix()
   {
      return scorefelix;
   }

   public int getScoreRalph()
   {
      return scoreralph;
   }
/*public void winRalph()
{
highscoreralph++;
}
public void winFelix()
{
highscorefelix++;
}*/
   public void win()
   {
      gamecount++;
   }
   public void setGames()
   {
      try
      {
         Scanner infile = new Scanner(new File("data.txt"));
         gamecount=(infile.nextInt());
      }
      catch (FileNotFoundException ex) {   // Exception handlers below
         System.out.println("data.txt file not found");
      } 
   }
   public void store()
   {
      try
      {
         System.setOut(new PrintStream(new FileOutputStream("data.txt")));
         //System.out.println("Game Count:");
         System.out.println("" + gamecount);
      }
      catch (FileNotFoundException ex) {   // Exception handlers below
         System.out.println("data.txt file not found");
      }
   }
   public void update(int x)
   {
      scoreralph=x;
      scorefelix=15-x;
   
   /*if(scorefelix>highscorefelix)
   highscorefelix=scorefelix;
   
   if(scoreralph>highscoreralph)
   highscoreralph=scoreralph;*/
   
      setScoreRalph(scoreralph);
      setScoreFelix(scorefelix);
      ralphH.setText("" + gamecount);
   }
   

 
}









