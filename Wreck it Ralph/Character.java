	/*****************************************************************
	* A Character is a class that has x and y position and window posistion . A Character
	* knows how to return its xpos and ypos, set its xpos, ypos. calculate and move up, down 
	* left and right window. Abstract method hitWindow that is overloaded in subclasses
	 
	* @author - Shivani Puli, Trisha Rayan
	* @version - 1.0
	****************************************************************/
public abstract class Character
{
   private int xpos;
   private int ypos;
   private int windx;
   private int windy;
   /************************************************************* 
   	* Constructs a Chanracter with initial x, y  position and window position.
   	* @param x    initial x position 
      * @param y    initial y position
      * @param w    initial w window x position
      * @param z    initial z window y position
  **************************************************************/
   public Character(int x, int y, int w, int z)
   {
      xpos=x;
      ypos=y;
      windx=w;
      windy=z;
   }
   
   /*************************************************************** 
   	* Moves character one window up and validates 
      * to check it does not go out of range
  **************************************************************/
   public void up()
   {
      if(windx!=0)
      {
         ypos-=110;
         windx--;
      }
   }
    /*************************************************************** 
   	* Moves character one window down and validates 
      * to check it does not go out of range
  **************************************************************/
   public void down()
   {
      if(windx!=2)
      {
         ypos+=110;
         windx++;
      }
   }
   /*************************************************************** 
   	* Moves character one window left and validates 
      * to check it does not go out of range
  **************************************************************/
   public void left()
   {
      if(windy!=0)
      {
         xpos-=63;
         windy--;
      }
   }
   /*************************************************************** 
   	* Moves character one window right and validates 
      * to check it does not go out of range
  **************************************************************/
   public void right()
   {
      if(windy!=4)
      {
         xpos+=63;
         windy++;
      }
   }
   /*************************************************************** 
   	* Returns the x position
   	* @return	 x position 
   **************************************************************/
   public int getX()
   {
      return xpos;
   }
   /*************************************************************** 
   	* Returns the y position
   	* @return	 y position 
   **************************************************************/
   public int getY()
   {
      return ypos;
   }
   /***************************************************************
   	* Sets the xpos to the input number x.
   	* @param x	 assigns x to xpos
  **************************************************************/
   public void setX(int x)
   {
      xpos=x;
   }
   /***************************************************************
   	* Sets the ypos to the input number y.
   	* @param y	 assigns y to ypos
  **************************************************************/
   public void setY(int y)
   {
      ypos=y;
   }
   /*************************************************************** 
   	* Returns the windx position
   	* @return	 windx position 
   **************************************************************/
   public int getWindex()
   {
      return windx;
   }
    /*************************************************************** 
   	* Returns the windy position
   	* @return	 windy position 
   **************************************************************/
   public int getWindey()
   {
      return windy;
   }
   /*************************************************************** 
   	* Abstract method hitWindow implemented in subclass
   **************************************************************/
   public abstract boolean hitWindow();
}




