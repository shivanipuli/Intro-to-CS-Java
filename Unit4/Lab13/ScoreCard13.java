   //Name______________________________ Date_____________
   import javax.swing.*;
   import java.awt.*;
   public class ScoreCard13 extends JPanel
   {
      private JTextField[][] input;
      public ScoreCard13()
      {
         setLayout(new GridLayout(5, 18));
      
         for(int hole = 1; hole <= 18; hole++)
         {
            add(new JLabel("" + hole, SwingConstants.CENTER));
         }
      
         input = new JTextField[4][18];
         for(int r = 0; r < input.length; r++)
            for(int c = 0; c < input[0].length; c++)
            {
               input[r][c] = new JTextField();
               add(input[r][c]);
            }
      }
      public void randomize()
      {
         	/************************/
         	/*                      */
         	/* Your code goes here. */
         	/*                      */
         	/************************/
      }
      public int findTotal(int r)
      {
         	/************************/
         	/*                      */
         	/* Your code goes here. */
         	/*                      */
         	/************************/
      }
      public int findAces(int r)
      {
         	/************************/
         	/*                      */
         	/* Your code goes here. */
         	/*                      */
         	/************************/
      }
      public int findHardestHole(int r)
      {
         	/************************/
         	/*                      */
         	/* Your code goes here. */
         	/*                      */
         	/************************/
      }
      public int findHardestHole()
      {
         	/************************/
         	/*                      */
         	/* Your code goes here. */
         	/*                      */
         	/************************/
      }
   }