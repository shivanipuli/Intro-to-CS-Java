//
//name:        date:
//
   import java.awt.*;
   import java.awt.event.*;
   import javax.swing.*;
//
   public class PanelPix extends JPanel
   {
   
      private DisplayPix display;
   
      private ScoreboardPix scoreboard;
   
      public PanelPix()
      {
         setLayout(new BorderLayout());
      //
      // north
      //
         scoreboard = new ScoreboardPix();
         add(scoreboard,BorderLayout.NORTH);
      //
      // east
      //
         JPanel east = new JPanel();
         east.setLayout(new GridLayout(18,1));
      /******************************************************************  1 */
         JButton zero = new JButton("Zero Blue");
         zero.addActionListener(new Listener_zeroBlue());
         east.add(zero);
      /******************************************************************  2 */
         JButton negate = new JButton("Negate");
         negate.addActionListener(new Listener_negate());
         east.add(negate);
      /******************************************************************  3 */
         JButton gray = new JButton("Grayscale");
         gray.addActionListener(new Listener_grayscale());
         east.add(gray);
      /******************************************************************  4 */
         JButton sepia = new JButton("Sepia Tone");
         sepia.addActionListener( new Listener_sepia());
         east.add(sepia);
      /******************************************************************  5 */
         JButton blur = new JButton("Blur");
         blur.addActionListener(new Listener_blur());
         east.add(blur);			
      /******************************************************************  6 */
         JButton posterize = new JButton("Posterize");
         posterize.addActionListener(new Listener_posterize());
         east.add(posterize);			
      /******************************************************************  7 */
         JButton splash = new JButton("Color Splash");
         splash.addActionListener(new Listener_grayred());
         east.add(splash);					
      /******************************************************************  8 */
         JButton mirrorLR = new JButton("Mirror Left-Right");
         mirrorLR.addActionListener(new Listener_mirrorlr());
         east.add(mirrorLR);			
      /******************************************************************  9 */
         JButton mirrorUD = new JButton("Mirror Up-Down");
         mirrorUD.addActionListener(new Listener_mirrorud());
         east.add(mirrorUD);
      /****************************************************************** 10 */
         JButton flipLR = new JButton("Flip Left-Right");
         flipLR.addActionListener(new Listener_fliplr());
         east.add(flipLR);
      /****************************************************************** 11 */
         JButton flipUD = new JButton("Flip Up-Down");
         flipUD.addActionListener(new Listener_flipud());
         east.add(flipUD);			
      /****************************************************************** 12 */
         JButton pixelate = new JButton("Pixelate");
         pixelate.addActionListener(new Listener_pixelate());
         east.add(pixelate);			
      /****************************************************************** 13 */
         JButton sunsetize = new JButton("Sunsetize");
         sunsetize.addActionListener(new Listener_sunsetize());
         east.add(sunsetize);	
      /****************************************************************** 14 */
         JButton redeye = new JButton("Remove Red-Eye");
         redeye.addActionListener(new Listener_redeye());
         east.add(redeye);									
      /****************************************************************** 15 */
         JButton detect = new JButton("Edge Detector");
         detect.setEnabled(false);
         east.add(detect);
      /****************************************************************** 16a */
         JButton encoder = new JButton("Encode");
         encoder.addActionListener(new Listener_encode());
         east.add(encoder);
      /****************************************************************** 16b */
         JButton decoder = new JButton("Decode");
         decoder.addActionListener(new Listener_decode());
         east.add(decoder);		
      
      /****************************************************************** 17 */
         JButton chromakey = new JButton("Chromakey");
         chromakey.setEnabled(false);
         east.add(chromakey);		
      
      /****************************************************************** END */      
         add(east,BorderLayout.EAST);
      //
      // center
      //
         display = new DisplayPix();
         display.addMouseListener(new Mouse());
      
         display.addKeyListener(new Key());
         display.setFocusable(true);
         add(display,BorderLayout.CENTER);
      //
      // south
      //
         JPanel south = new JPanel();
         south.setLayout(new FlowLayout());
         JButton restore = new JButton("Restore Original Image");
         restore.addActionListener(new Listener_restore());
         south.add(restore);
         JButton openimg = new JButton("Open an Image File");
         openimg.addActionListener(new Listener_openimg());
         south.add(openimg);
         JButton undo = new JButton("Undo");
         undo.setEnabled(false);
         south.add(undo);
         add(south,BorderLayout.SOUTH);
      }    
   //
   /**********************************************************************/
   //
   // pixel operation listener
   // 
      private class Listener_zeroBlue implements ActionListener
      {
         public void actionPerformed(ActionEvent e)
         {
            display.zeroBlue();
            update( display.getXval() , display.getYval() );
         }
      } 
   //  ---------->  add more Listeners here   <-----------
   private class Listener_redeye implements ActionListener
   {
   public void actionPerformed(ActionEvent e)
         {
            display.redeye();
            update( display.getXval() , display.getYval() );
         }
      } 
      private class Listener_posterize implements ActionListener
   {
   public void actionPerformed(ActionEvent e)
         {
            display.posterize();
            update( display.getXval() , display.getYval() );
         }
      }
        private class Listener_encode implements ActionListener
   {
   public void actionPerformed(ActionEvent e)
         {
            display.encode();
            update( display.getXval() , display.getYval() );
         }
      }
      private class Listener_decode implements ActionListener
   {
   public void actionPerformed(ActionEvent e)
         {
            display.decode();
            update( display.getXval() , display.getYval() );
         }
      } 
   private class Listener_negate implements ActionListener
   {
   public void actionPerformed(ActionEvent e)
   {
   display.negate();
   update( display.getXval(), display.getYval());
   }
   }
   private class Listener_grayscale implements ActionListener
   {
   public void actionPerformed(ActionEvent e)
   {
   display.grayscale();
   update(display.getXval(), display.getYval());
   }
   }
   private class Listener_grayred implements ActionListener
   {
   public void actionPerformed(ActionEvent e)
   {
   display.grayred();
   update(display.getXval(), display.getYval());
   }
   }

   private class Listener_sepia implements ActionListener
   {
   public void actionPerformed(ActionEvent e)
   {
   display.sepia();
   update(display.getXval(), display.getYval());
   }
   }
   private class Listener_blur implements ActionListener
   {
   public void actionPerformed(ActionEvent e)
   {
   display.blur();
   update(display.getXval(), display.getYval());
   }
   }
private class Listener_sunsetize implements ActionListener
   {
   public void actionPerformed(ActionEvent e)
   {
   display.sunsetize();
   update(display.getXval(), display.getYval());
   }
   }
private class Listener_mirrorlr implements ActionListener
   {
   public void actionPerformed(ActionEvent e)
   {
   display.mirrorlr();
   update(display.getXval(), display.getYval());
   }
   }
   private class Listener_pixelate implements ActionListener
   {
   public void actionPerformed(ActionEvent e)
   {
   display.pixelate();
   update(display.getXval(), display.getYval());
   }
   }
   private class Listener_fliplr implements ActionListener
   {
   public void actionPerformed(ActionEvent e)
   {
   display.fliplr();
   update(display.getXval(), display.getYval());
   }
   }
private class Listener_flipud implements ActionListener
   {
   public void actionPerformed(ActionEvent e)
   {
   display.flipud();
   update(display.getXval(), display.getYval());
   }
   }
private class Listener_mirrorud implements ActionListener
   {
   public void actionPerformed(ActionEvent e)
   {
   display.mirrorud();
   update(display.getXval(), display.getYval());
   }
   }


   
   //   
   /**********************************************************************/
   //
      private class Listener_restore implements ActionListener
      {
         public void actionPerformed(ActionEvent e)
         {
            display.resetImage();
            update( display.getXval() , display.getYval() );
         }
      }
      private class Listener_openimg implements ActionListener
      {
         public void actionPerformed(ActionEvent e)
         {
            if( display.openImage() )
            {
               update( display.getXval() , display.getYval() );
            }
         }
      }
      private class Mouse extends MouseAdapter
      {
         public void mouseClicked(MouseEvent e)
         {
            update( e.getX() , e.getY() );
         }
      }
      private class Key extends KeyAdapter
      {
         public void keyPressed(KeyEvent e)
         {
            switch( e.getKeyCode() )
            {
               case KeyEvent.VK_UP:    display.up();    
                  break;
               case KeyEvent.VK_DOWN:  display.down();  
                  break;
               case KeyEvent.VK_LEFT:  display.left();  
                  break;
               case KeyEvent.VK_RIGHT: display.right(); 
                  break;
            }
         //
            update( display.getXval() , display.getYval() );
         }
      }     
      private void update(int x, int y)
      {
      int rgb = display.getRGB(x,y);
   //
      display.update(x,y);
      scoreboard.update(display.getCol(),display.getRow(),rgb);
   //
      display.repaint();
   //
      display.requestFocus();
      }
   }
//
// end of file
//