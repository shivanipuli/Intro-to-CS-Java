import java.awt.*;
import javax.swing.*;

public class Window
{
private boolean fob;//fixed or broken
private int xpos, ypos;
public Window(boolean b, int x, int y)
{
fob=b;
xpos=x;
ypos=y;
}
public boolean getState()
{
return fob;
}
public void setState(boolean b)
{
fob=b;
}
public int getXpos()
{
return xpos;
}
public void setXpos(int x)
{
xpos=x;
}
public int getYpos()
{
return ypos;
}
public void setYpos(int x)
{
ypos=x;
}
public boolean isFixed()
{
return fob;
}
public void change()
{
if(fob)
fob=false;
else
fob=true;
}
public void update(Graphics myBuffer)
{
ImageIcon Window;
if(fob)
{
Window = new ImageIcon("Broken.JPG");
}
else
{
Window = new ImageIcon("fixed.JPG");
}
myBuffer.drawImage(Window.getImage(),xpos,ypos, 100, 80, null);    
      }

}