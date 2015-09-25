import java.util.Scanner;
public class Annuity
{
   public static void main(String[] args)
   {
     double pmt=10000.0;
     double interest=0.08;
     double numPay=20.0;
     double presentAnn=Math.pow((1+interest),(numPay-1));
     presentAnn= presentAnn-1;
     presentAnn=presentAnn/interest;
     presentAnn=presentAnn/(Math.pow((1+interest),(numPay-1)));
     presentAnn+=1;
     presentAnn=presentAnn*pmt;
     System.out.println(presentAnn);
   }
}
