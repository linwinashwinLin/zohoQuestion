import java.util.*;
public class countleast {

    public static void main( String args[])
    {
        Scanner scn=new Scanner(System.in);
        System.out.println("Enter The Array Size");
        int n =scn.nextInt();
        System.out.println(n);
        int [] array = new int [n];
        int [] array2 = new int [n];
        for(int i =0;i<n;i++)
        {
            array[i]=scn.nextInt();
        }

        int count1=array.length;
        int count2=array[0];
        
        for(int i:array)
        {
            int count=0;
            for(int j=0;j<array.length;j++)
            {
                if(array[j]==i)
                {
                    count++;
                }
            }
           if(count1>count)
           {
               count1=count;
               count2=i;
           }
        }

        System.out.println("Least Count Is of " + count2);
     
    }

    
}
