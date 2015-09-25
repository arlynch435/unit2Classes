public class Milk
{
   public static void main(String[] args)
   {
      double milkStuff = 5.5; // gallons
      double jarCapacity = 0.75; // gallons
      int completelyFilledJars = (int) (milkStuff / jarCapacity);
      
      System.out.println(completelyFilledJars);
   }
}
