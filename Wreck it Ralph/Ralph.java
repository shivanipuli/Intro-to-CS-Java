import java.awt.*;
import javax.swing.*;

public class Ralph extends Character
{
   public Ralph()
   {
      super (0,320,2,0);
   }
   public boolean hitWindow()
   {
      return true;
   }
   public void draw(Graphics myBuffer)
   {
      ImageIcon r = new ImageIcon("ralph.jpg");
      myBuffer.drawImage(r.getImage(),getX(),getY(),80,80,null);
   }
}