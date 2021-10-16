import java.lang.*;
import java.util.*;
public class obstacleNew {
    public static void main(String args[]){
    Scanner scn=new Scanner(System.in);
    System.out.println("Enter Array Size");
    int n =scn.nextInt();
    int [] array = new int [n];
    for(int i =0;i<n;i++)
    {
        array[i]=scn.nextInt();
    }

    Arrays.sort(array);

    int flag=0;

    for(int i =2;i<array[array.length-1]+2;i++)
    {
        for(int k:array)
        {
            if(k%i==0)
            {
                flag=1;
            }
        }

        if(flag==0)
        {
            System.out.println(i);
            break;
        }
        flag=0;
    }

}

}
