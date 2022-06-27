import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.image.*;

public class GamePanel extends JPanel
{
   private Window window[][];
   private final int xframe = 350;
   private final int yframe = 500;
   private BufferedImage myImage;
   private Graphics myBuffer;
   private Timer t;
   private ImageIcon background;
   private Ralph ralph;
   private Felix felix;
   private Scoreboard scores;
   private int fixed;
   private JButton button;
   public GamePanel() //throws Exception - replaced with try/catch - done
   {
      //modular programming
      createGraphics();
  
      //modular programming
      createObject();
  
      addKeyListener(new Key());
      setFocusable(true);
     
      //modular programming
      createScoreboard();
     
      //modular programming
      createButtons();
     
      t = new Timer(5, new Listener());
      t.start();
     
   }
   
   public void createGraphics()
   {
      myImage =  new BufferedImage(xframe, yframe, BufferedImage.TYPE_INT_RGB);
      myBuffer = myImage.getGraphics();
      myBuffer.setColor(Color.WHITE);
      myBuffer.fillRect(0,0,xframe,yframe);
      paintComponent(myBuffer);
    }
   
   public void createObject()
   {
      ralph = new Ralph();
      felix = new Felix();
  
  
      window = new Window[5][3];
      for(int x=0; x <window.length; x++)
      {
         for(int y=0; y< window[0].length-1; y++)
         {
            boolean b = (int)(Math.random()*2)==1;
            window[x][y]=new Window(b, x*63, y*120 +110);
            window[x][y].update(myBuffer);
            if(b)
               fixed++;
         }
      }
      for(int y=0; y < window.length; y++)
      {
         boolean b = (int)(Math.random()*2)==1;
         window[y][2] = new Window(b, y*63, 320);
         window[y][2].update(myBuffer);
         if(b)
            fixed++;
      }
  
      ralph.draw(myBuffer);
      felix.draw(myBuffer);
   }
   
   public void createScoreboard()
   {
      scores=new Scoreboard();
      scores.update(fixed);
      scores.win();
      add(scores);
   }
   
   public void createButtons()
   {
      button = new JButton("Reset");
      button.addActionListener( new L());
      button.setEnabled(false);
      add(button);
   }
   
   public void paintComponent(Graphics g)
   {
      background=new ImageIcon("Building.JPG");
      g.drawImage(background.getImage(), 0, 0, xframe, yframe, null);
      g.drawImage(myImage, 0, 0, xframe, yframe, null);
   }
   public int getFixed()
   {
      return fixed;
   } 
   private class Listener implements ActionListener
   {
      public void actionPerformed(ActionEvent e)
      {
     
         myBuffer.setColor(Color.WHITE);
         myBuffer.fillRect(0,0,xframe,yframe);
         endGame();
         repaint();
      }
   }
   private class L implements ActionListener
   {
      public void actionPerformed(ActionEvent e)
      {
            scores.win();
      scores.store();
      fixed=0;
         myBuffer.setColor(Color.WHITE);
      myBuffer.fillRect(0,0,xframe,yframe);
      paintComponent(myBuffer);
  
      ralph = new Ralph();
      felix = new Felix();
  
  
      window = new Window[5][3];
      for(int x=0; x <window.length; x++)
      {
         for(int y=0; y< window[0].length-1; y++)
         {
            boolean b = (int)(Math.random()*2)==1;
            window[x][y]=new Window(b, x*63, y*120 +110);
            window[x][y].update(myBuffer);
            if(b)
               fixed++;
         }
      }
      for(int y=0; y < window.length; y++)
      {
         boolean b = (int)(Math.random()*2)==1;
         window[y][2] = new Window(b, y*63, 320);
         window[y][2].update(myBuffer);
         if(b)
            fixed++;
      }
  
      ralph.draw(myBuffer);
      felix.draw(myBuffer);
      button.setEnabled(false);
      }
   }

   public void endGame()
   {
   //scores.store();
      if(fixed==12)
      {
         scores.update(fixed);
         /*myBuffer.setColor(Color.RED);
         myBuffer.setFont(new Font("Monospaced", Font.BOLD, 20));
         myBuffer.drawString("Ralph Wins!!",20,180);*/
         ImageIcon gameDone;
         gameDone = new ImageIcon("gameoverRalphwin.JPG");
         myBuffer.drawImage(gameDone.getImage(),0,80, 350, 330, null);
      
         button.setEnabled(true);
      }
      else if(fixed==3)
      {
         scores.update(fixed);
         /*myBuffer.setColor(Color.RED);
         myBuffer.setFont(new Font("Monospaced", Font.BOLD, 20));
         myBuffer.drawString("Felix Wins!!",20,180);*/
         ImageIcon gameDone;
         gameDone = new ImageIcon("gameoverfelixwin.JPG");
         myBuffer.drawImage(gameDone.getImage(),0,80, 350, 330, null);
         button.setEnabled(true);
      }
      else
      {
         paintComponent(myBuffer);
         for(int x=0; x < window.length; x++)
         {
            for(int y=0; y < window[0].length; y++)
            {
               window[x][y].update(myBuffer);
            }
         }
         felix.draw(myBuffer);
         ralph.draw(myBuffer);
         scores.update(fixed);
      }
   }
   private class Key extends KeyAdapter
   {
      public void keyPressed(KeyEvent e)
      {
         if(e.getKeyCode() == KeyEvent.VK_S)//DOWN
            felix.down();
     
         if(e.getKeyCode() == KeyEvent.VK_W)//UP
            felix.up();
     
         if(e.getKeyCode() == KeyEvent.VK_A)//LEFT
            felix.left();
     
         if(e.getKeyCode() == KeyEvent.VK_D)//RIGHT
            felix.right();
     
         if(e.getKeyCode() == KeyEvent.VK_X)//HIT WINDOW
        
            if( window[felix.getWindey()][felix.getWindex()].getState()==true)
            {
               fixed--;
               window[felix.getWindey()][felix.getWindex()].setState(felix.hitWindow());
            }
           
         if(e.getKeyCode() == KeyEvent.VK_K)//RIGHT
            ralph.right();
        
         if(e.getKeyCode() == KeyEvent.VK_H)//LEFT
            ralph.left();
           
         if(e.getKeyCode() == KeyEvent.VK_J)//DOWN
            ralph.down();
        
         if(e.getKeyCode() == KeyEvent.VK_U)//UP
            ralph.up();
           
         if(e.getKeyCode() == KeyEvent.VK_N)//HIT WINDOW
            if(window[ralph.getWindey()][ralph.getWindex()].getState()==false)
            {
               fixed++;
               window[ralph.getWindey()][ralph.getWindex()].setState(ralph.hitWindow());
            }
      }
   }

}


