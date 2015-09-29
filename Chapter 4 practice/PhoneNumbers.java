import java.util.Scanner;

public class PhoneNumbers
{
    public static void main(String[] args)
    {
        Scanner s=new Scanner(System.in);
        System.out.print("Please enter your phone number: ");
        String phoneNum=s.next();
        String phoneLast4=phoneNum.substring(phoneNum.length()-4);
        String phoneMiddle=phoneNum.substring(phoneNum.length()-7,phoneNum.length()-4);
        String phoneFirst=phoneNum.substring(0,phoneNum.length()-7);
        phoneNum="("+phoneFirst+") "+phoneMiddle+"-"+phoneLast4;
        System.out.println(phoneNum);
    }

}
