//Name:   Date:   
//Expected output is at the bottom.
public class HailstoneBroken
{
 // Generates the Hailstone Sequence from Lab03.
   public static void main(String[] args)
   {
      int longest= 0;   
      System.out.println("Hailstone Numbers");
      // Generate the hailstone sequence for
      // numbers between 1 and 20.  Count the
      // sequence (the chain length) until the 
      // sequence reaches 1.
      for (int hs = 1; hs <= 20; hs++)
      {
         int chain = (int)calcchain(hs);
         System.out.println("\tLength: " + chain);
         if( chain > longest )
            longest = chain;
      }
      System.out.println("Longest Chain: " + longest);
   }
   // displays the hailstone numbers
   // returns the chain length of the given hailstone number
   private static long calcchain (int b)
   {
      int c = 1;
      while (b != 1)
      {
         c++;
         System.out.print(" "+b);
         if((c % 2) == 0)
            b = b / 2;
         else b = 3 * b + 1;
      }
      System.out.print(" 1");
      return b;  
   }   
}
/*  Expected Output  
 Hailstone Numbers
  1	Length: 1
  2 1	Length: 2
  3 10 5 16 8 4 2 1	Length: 8
  4 2 1	Length: 3
  5 16 8 4 2 1	Length: 6
  6 3 10 5 16 8 4 2 1	Length: 9
  7 22 11 34 17 52 26 13 40 20 10 5 16 8 4 2 1	Length: 17
  8 4 2 1	Length: 4
  9 28 14 7 22 11 34 17 52 26 13 40 20 10 5 16 8 4 2 1	Length: 20
  10 5 16 8 4 2 1	Length: 7
  11 34 17 52 26 13 40 20 10 5 16 8 4 2 1	Length: 15
  12 6 3 10 5 16 8 4 2 1	Length: 10
  13 40 20 10 5 16 8 4 2 1	Length: 10
  14 7 22 11 34 17 52 26 13 40 20 10 5 16 8 4 2 1	Length: 18
  15 46 23 70 35 106 53 160 80 40 20 10 5 16 8 4 2 1	Length: 18
  16 8 4 2 1	Length: 5
  17 52 26 13 40 20 10 5 16 8 4 2 1	Length: 13
  18 9 28 14 7 22 11 34 17 52 26 13 40 20 10 5 16 8 4 2 1	Length: 21
  19 58 29 88 44 22 11 34 17 52 26 13 40 20 10 5 16 8 4 2 1	Length: 21
  20 10 5 16 8 4 2 1	Length: 8
  Longest Chain: 21
 */