public class MagicNumbers
{
   public static void main(String[] args)
   {
      final double feetPerYard=3;
      final double inchPerFeet=12;
      double yards = 3.5;
      double feet = yards * feetPerYard;
      double inches = feet * inchPerFeet;
      
      System.out.println(yards + "yards are" + feet + "feet");
      System.out.println(yards + "yards are" + inches + "inches");
   }
}