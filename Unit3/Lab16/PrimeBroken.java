// Name:     Date:
// Expected output is at the bottom.
public class PrimeBroken
{
   public static void main(String[] args)
   {
      final int START = 0;
      final int END = 40;
      for(int k = START; k <= END; k++)
      {
         if(isPrime(k))
            System.out.println(k + " is prime.");
         else
            System.out.println(k + " isn't prime.");
      }
   }
   public static boolean isPrime(int x)
   {
      if(x == 1)
         return false;
      for(int j = 2; j < (int) Math.sqrt(x); j++)
         if(x % j == 0)
            return false;
      return true;
   }
}
/*  Expected output
 0 is prime.
 1 isn't prime.
 2 is prime.
 3 is prime.
 4 isn't prime.
 5 is prime.
 6 isn't prime.
 7 is prime.
 8 isn't prime.
 9 isn't prime.
 10 isn't prime.
 11 is prime.
 12 isn't prime.
 13 is prime.
 14 isn't prime.
 15 isn't prime.
 16 isn't prime.
 17 is prime.
 18 isn't prime.
 19 is prime.
 20 isn't prime.
 21 isn't prime.
 22 isn't prime.
 23 is prime.
 24 isn't prime.
 25 isn't prime.
 26 isn't prime.
 27 isn't prime.
 28 isn't prime.
 29 is prime.
 30 isn't prime.
 31 is prime.
 32 isn't prime.
 33 isn't prime.
 34 isn't prime.
 35 isn't prime.
 36 isn't prime.
 37 is prime.
 38 isn't prime.
 39 isn't prime.
 40 isn't prime.
 */