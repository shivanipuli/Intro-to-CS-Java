   //
   // Torbert, 24 July 2013
	//
   import java.awt.Color;
   import java.awt.FlowLayout;
   import javax.swing.JLabel;
   import javax.swing.JPanel;
   //
   public class ScoreboardPix extends JPanel
   {
      private JLabel xy,red,green,blue,rgb;
        
      public ScoreboardPix()
      {
         setLayout(new FlowLayout());
			//
         setBackground(Color.white);
         //
         xy = new JLabel("(r,c)=(?,?)");
         add(xy);
			//
         add(new JLabel("   ")); // blank
			//
         red = new JLabel(  "R=???");
         add(red);
         green = new JLabel("G=???");
         add(green);
         blue = new JLabel( "B=???");
         add(blue);
			//
         add(new JLabel("   ")); // blank
			//
         rgb = new JLabel("      ");
         rgb.setOpaque(true);
         rgb.setBackground(Color.black);
         add(rgb);
      }
		//
      public void update(int x, int y, int rgbval)
      {
         Color tmp = new Color(rgbval);
         //
         int redval   = tmp.getRed();
         int greenval = tmp.getGreen();
         int blueval  = tmp.getBlue();
      	//
         xy.setText("(r,c)=("+y+","+x+")");  // row-major order
			//
         red.setText(  "R="+redval);
         green.setText("G="+greenval);
         blue.setText( "B="+blueval);
			//
         rgb.setBackground(tmp);
      }
   }
   //
	// end of file
	//