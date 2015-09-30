import java.util.Scanner;

public class ChangeMaker
{
    public static void main(String[] args)
    {
        Scanner s=new Scanner(System.in);
        int pennies=0;
        int nickels=0;
        int dimes=0;
        int quarters=0;
        System.out.print("Please enter the price in pennies ");
        int price=s.nextInt();
        System.out.print("Please enter the money recieved in pennies ");
        int money=s.nextInt();
        int change=money-price;
        quarters=change/25;
        change-=quarters*25;
        dimes=change/10;
        change-=dimes*10;
        nickels=change/5;
        change-=nickels*5;
        pennies=change;
        System.out.println("You will need: ");
        System.out.println("Pennies: "+ pennies);
        System.out.println("Nickels: "+nickels);
        System.out.println("Dimes: "+dimes);
        System.out.println("Quarters: "+quarters);
        
    }

}
