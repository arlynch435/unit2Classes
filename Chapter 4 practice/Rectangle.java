import java.util.Scanner;
public class Rectangle
{
    public static void main(String[] args)
        {
            Scanner s=new Scanner(System.in);
            System.out.print("Enter the length of the rectangle: ");
            double length=s.nextDouble();
            System.out.print("Enter the width of the rectangle: ");
            double width=s.nextDouble();
            double perimeter=(2*length)+(2*width);
            double area= length*width;
            double diagonal= (Math.pow(length,2))+(Math.pow(width,2));
            diagonal=Math.pow(diagonal,0.5);
            System.out.print("The perimeter is: ");
            System.out.println(perimeter);
            System.out.print("The area is: ");
            System.out.println(area);
            System.out.print("The diagonal is: ");
            System.out.println(diagonal);
        }
    }
    
