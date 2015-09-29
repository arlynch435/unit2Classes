import java.util.Scanner;
public class Annuity
{
   public static void main(String[] args)
   {
     Scanner s=new Scanner(System.in);
     double pmt;
     double interest;
     double numPay;
     System.out.print("Enter the periodic payment: ");
     pmt=s.nextDouble();
     System.out.print("Enter the interest: ");
     interest=s.nextDouble();
     System.out.print("Enter the number of payments: ");
     numPay=s.nextDouble();
     double presentAnn=Math.pow((1+interest),(numPay-1));
     presentAnn= presentAnn-1;
     presentAnn=presentAnn/interest;
     presentAnn=presentAnn/(Math.pow((1+interest),(numPay-1)));
     presentAnn+=1;
     presentAnn=presentAnn*pmt;
     System.out.println(presentAnn);
   }
}
