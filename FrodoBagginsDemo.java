import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class FrodoBagginsDemo
{
   public static void main (String[] args)
   {
      String frodo = "frodoBaggins";
      System.out.println(" 9:  " + frodo);   
      String gandalf;
      gandalf = "gandalfTheGrey";
      System.out.println("12:  " + gandalf);
      frodo = gandalf;
      System.out.println("14:  " + frodo);
      if (frodo == gandalf)
         System.out.println("16:  " + "frodo has the same reference as gandalf");
      if (frodo.equals(gandalf)) // also:  equalsIgnoreCase()
         System.out.println("18:  " + "frodo is an identical string to gandalf");
          //at this point, draw a picture of the references to the String objects.
       
      int len = frodo.length();
      System.out.println("22:  " + len);
      frodo = "frodoBaggins";
      gandalf = "frodo";
      int i = gandalf.compareTo(frodo);
      if (i < 0)
         System.out.println("27:  " + "gandalf is alphabetically before frodo");
      i = frodo.compareTo(frodo);
      if (i == 0)
         System.out.println("30:  " + "frodo is the same as frodo!");
      i = frodo.compareTo(gandalf);
      if (i > 0) 
         System.out.println("33:  " + "frodo is alphabetically after gandalf");
          
      System.out.println("35:  " + frodo.substring(7));
      System.out.println("36:  " + frodo.substring(7,10));
      System.out.print("37:  ");
      for (i = 0; i < frodo.length(); i++)
         System.out.print("   " + frodo.substring(i,i+1));
      System.out.println();
      System.out.print("41:  ");
      for (i = 0; i < frodo.length(); i++)
         System.out.print("   " + frodo.charAt(i));
      System.out.println();
         
      frodo = "   * frodoBaggins *   ";
      System.out.println("47:  " + frodo);
      System.out.println("48:  " + frodo.trim());
      frodo = "frodoBagginsfrodoBagginsfrodoBaggins";
      System.out.println("50:  " + frodo.indexOf("i"));
      System.out.println("51:  " + frodo.indexOf("ice"));
      System.out.println("52:  " + frodo.indexOf("i", 1));
      System.out.println("53:  " + frodo.lastIndexOf("ice"));
      String tomBombadil = "tomBombadil";
      System.out.println("55:  " + tomBombadil.toUpperCase());
      System.out.println("56:  " + "tOMBomBAdIl".toLowerCase());
   }
}
