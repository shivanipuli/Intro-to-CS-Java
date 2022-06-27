   //
   // Torbert, 24 July 2013
	//
import java.awt.Color;
import java.awt.image.BufferedImage;
	//
public class PixelOperations
{
   public Color[][] getArray(BufferedImage img)
   {
      Color[][] arr;
      	//
      int numcols = img.getWidth();
      int numrows = img.getHeight();
      	//
      arr = new Color[numrows][numcols];
      	//
      for(int j = 0; j < arr.length; j++)
      {
         for(int k = 0; k < arr[0].length; k++)
         {
            int rgb = img.getRGB(k,j);
            	//
            arr[j][k] = new Color(rgb);
         }
      }
      	//
      return arr;
   }
   public void setImage(BufferedImage img, Color[][] arr)
   {
      for(int j = 0; j < arr.length; j++)
      {
         for(int k = 0; k < arr[0].length; k++)
         {
            Color tmp = arr[j][k];
               //
            int rgb = tmp.getRGB();
               //
            img.setRGB(k,j,rgb);
         }
      }
   }
      //
   	/**********************************************************************/
   	//
   	// pixel operations
   	// 
   public void zeroBlue(Color[][] arr)
   {
      for(int j = 0; j < arr.length; j++)
      {
         for(int k = 0; k < arr[0].length; k++)
         {
            Color tmp = arr[j][k];
            arr[j][k] = new Color( tmp.getRed(), tmp.getGreen(), 0 );
         }
      }
   }
   	//--------> your new methods go here   <--------------
  
   public void negate(Color[][] arr)
   {
      for(int m=0; m < arr.length; m++)
      {
         for(int v=0; v < arr[0].length; v++)
         {
            Color grk = arr[m][v];
            arr[m][v] = new Color ( (255-grk.getRed()), (255-grk.getGreen()), (255-grk.getBlue()));
         }
      }
   }
   public void mirrorlr(Color[][] arr)
   {
      for(int m=0; m < arr.length; m++)
      {
         for(int v=0; v < arr[0].length; v++)
         {
            arr[m][arr[0].length-1-v]=arr[m][v];
         }
      }
   }
   public void fliplr(Color[][] arr)
   {
      for(int m=0; m < arr.length; m++)
      {
         for(int v=0; v < arr[0].length / 2; v+=1)
         {
            Color grk = arr[m][arr[0].length-1-v];
            arr[m][arr[0].length-1-v]=arr[m][v];
            arr[m][v]= new Color(grk.getRed(), grk.getGreen(), grk.getBlue());
         }
      }
   }
   public void flipud(Color[][] arr)
   {
      for(int v=0; v < arr[0].length; v+=1)
      {
         for(int m=0; m < arr.length / 2; m+=1)
         {
            Color grk = arr[arr.length-1-m][v];
            arr[arr.length-1-m][v]=arr[m][v];
            arr[m][v]= new Color(grk.getRed(), grk.getGreen(), grk.getBlue());
         }
      }
      
   }
   public void posterize(Color[][] arr)
   {
   for(int r=0; r < arr.length; r ++)
   {
   for(int c=0; c < arr[0].length; c++)
   {
   Color f = arr[r][c];
   int red = f.getRed();
   int green = f.getGreen();
   int blue = f.getBlue();
   if(red<51)
   red=25;
   else if(red < 102)
   red=76;
   else if(red < 153)
   red=127;
   else if(red < 204)
   red=178;
   else
   red=229;
   if(green<51)
   green=25;
   else if(green < 102)
   green=76;
   else if(green < 153)
   green=127;
   else if(green < 204)
   green=178;
   else
   green=229;
   
if(blue<51)
   blue=25;
   else if(blue < 102)
   blue=76;
   else if(blue < 153)
   blue=127;
   else if(blue < 204)
   blue=178;
   else
   blue=229;
   arr[r][c] = new Color(red,green,blue);
   }
   }
   }
   public void encode(Color[][] arr, Color[][] msg)
   {
   for(int m=0; m < arr.length; m+=1)
         {
   for(int v=0; v < arr[0].length; v+=1)
      {
      Color grk = arr[m][v];
      if(grk.getRed()%2==0)
      arr[m][v] = new Color( grk.getRed()-1, grk.getGreen(), grk.getBlue());
      }
      }
    for(int m=0; m < msg.length; m+=1)
         {
   for(int v=0; v < msg[0].length; v+=1)
      {
      Color grk = msg[m][v];
      if(grk.getRed() < 50)
      arr[m][v] = new Color(grk.getRed() + 1, grk.getGreen(), grk.getBlue());
     }
     }
   }
   public void decode(Color[][] arr)
   {
   for(int m=0; m < arr.length; m+=1)
         {
   for(int v=0; v < arr[0].length; v+=1)
      {
Color grk = arr[m][v];
if(grk.getRed()%2==0)
arr[m][v] = new Color(0,0,0);
else
arr[m][v] = new Color(255,255,255);
}
}
}
   public void mirrorud(Color[][] arr)
   {
      for(int v=0; v < arr[0].length; v+=1)
      {
         for(int m=0; m < arr.length / 2; m+=1)
         {
            arr[arr.length-1-m][v]=arr[m][v];
         }
      }
      
   }
   public void pixelate(Color[][] arr)
   {
   for(int r=0; r < arr.length; r+=3)
   {
   for(int c=0; c < arr[0].length-2; c+=3)
   {
   Color t = arr[r+1][c+1];
   arr[r][c] = t;
   arr[r][c+1] = t;
   arr[r][c+2]= t;
   arr[r+1][c] = t;
   arr[r+1][c+2] = t;
   arr[r+2][c] = t;
   arr[r+2][c+2] = t;
   }
   }
   }
   
   public void sunsetize(Color[][] arr)
   {
      for(int m=0; m < arr.length; m++)
      {
         for(int v=0; v < arr[0].length; v++)
         {
            Color th = arr[m][v];
            arr[m][v] = new Color( th.getRed() , (int)(th.getGreen() * .8), (int)(th.getBlue() * .8));
         }
      }
   }
   public void grayscale(Color[][] arr)
   {
      for(int m=0; m < arr.length; m++)
      {
         for(int v=0; v < arr[0].length; v++)
         {
            Color th = arr[m][v];
            int tot = th.getRed() + th.getBlue() + th.getGreen();
            arr[m][v] = new Color( tot/3 , tot/3, tot/3);
         }
      }
   }
   public void grayred(Color[][] arr)
   {
      for(int m=0; m < arr.length; m++)
      {
         for(int v=0; v < arr[0].length; v++)
         {
            Color th = arr[m][v];
            int tot = th.getRed() + th.getBlue() + th.getGreen();
            if(th.getRed() > (th.getBlue() + th.getGreen()))
               arr[m][v] = new Color( th.getRed() , tot/3, tot/3);
            else 
               arr[m][v] = new Color( tot/3 , tot/3, tot/3);
         }
      }
   }
   public void redeye(Color[][] arr)
   {
      for(int m=420; m < 520; m++)
      {
         for(int v=590; v < 1090; v++)
         {
            Color th = arr[m][v];
            int tot = th.getRed() + th.getBlue() + th.getGreen();
            if(th.getRed() > (th.getBlue() + th.getGreen()))
               arr[m][v] = new Color( 0,0,0);
         }
      }
      /*for(int m=446; m < 460; m++)
      {
         for(int v = 680; v < 700; v++)
         {
            arr[m][v] = new Color( 0,0,0);
         }
      }*/
   }
   
   public void sepia(Color[][] arr)
   {
      for(int m=0; m < arr.length; m++)
      {
         for(int v=0; v < arr[0].length; v++)
         {
            Color th = arr[m][v];
            double red = (th.getRed()*0.393) + (th.getBlue() * 0.189) + (th.getGreen()*0.769);
            double green = (th.getRed()*0.349) + (th.getBlue() * 0.168) + (th.getGreen()*0.686);
            double blue = (th.getRed()*0.272) + (th.getBlue() * 0.131) + (th.getGreen()*0.534);
            if(red>255)
               red=255;
            if(green>255)
               green=255;
            if(blue>255)
               blue=255;
            arr[m][v] = new Color( (int)(red) , (int)(green), (int)(blue));
         }
      }
   }
   public void blur(Color[][] arr)
   {
      for(int m=1; m < arr.length-1; m++)
      {
         for(int v=1; v < arr[0].length-1; v++)
         {
            int green = (int)((arr[m][v].getGreen()+arr[m+1][v].getGreen() + arr[m-1][v].getGreen() + arr[m][v+1].getGreen() + arr[m][v-1].getGreen()) / 5);
            int red = (int)((arr[m][v].getRed()+arr[m+1][v].getRed() + arr[m-1][v].getRed() + arr[m][v+1].getRed() + arr[m][v-1].getRed()) / 5);
            int blue = (int)((arr[m][v].getBlue()+arr[m+1][v].getBlue() + arr[m-1][v].getBlue() + arr[m][v+1].getBlue() + arr[m][v-1].getBlue()) / 5);
         
            if(green>255)
               green=255;
            if(red>255)
               red = (255);
            if(blue>255)
               blue = (255);
            arr[m][v] = new Color( red, green, blue);
         }
      }
   }
}
   //
	// end of file
	//