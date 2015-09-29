import java.util.Scanner;
public class NumberToString
{
    public static void main(String[] args)
    {
        Scanner s=new Scanner(System.in);
        //System.out.print("Please enter an integer between 1,000 and 999,999: ");
        //String stringNum=s.next();
        //stringNum=stringNum.replace(",","");
        //System.out.println(stringNum);
        System.out.print("Please enter an integer between 1000 and 999999: ");
        String stringNum=s.next();
        String stringNumLast3=stringNum.substring(stringNum.length()-3);
        String stringNumFirst=stringNum.substring(0,stringNum.length()-3);
        stringNum=stringNumFirst+","+stringNumLast3;
        System.out.println(stringNum);
    }
        

}
