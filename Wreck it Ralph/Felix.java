import java.awt.*;
import javax.swing.*;

public class Felix extends Character
{
public Felix()
{
super (270,320,2,4);
}
public boolean hitWindow()
{
return false;
}
public void draw(Graphics myBuffer)
{
ImageIcon r = new ImageIcon("Felix.jpg");
myBuffer.drawImage(r.getImage(),getX(),getY(),80,80,null);
}

}