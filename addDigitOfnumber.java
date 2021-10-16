import java.util.*;
public class addDigitOfnumber {

    static int sum1(int number)
    {
        int sum=0;
        int digit;
        while(number > 0)  
        {  
        digit = number % 10;  
        sum = sum + digit;  
        number = number / 10;  
        }  

        return sum;

    }
    public static void main( String args[])
    {
        Scanner scn=new Scanner(System.in);
        System.out.println("Enter The No.");
        int number =scn.nextInt();
        int sm=number;

        while(sm/10!=0)
        {
            sm=sum1(sm);
            System.out.println(sm);
        }
        

       

    }
}
