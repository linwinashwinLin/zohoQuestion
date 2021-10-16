import java.util.*;
public class ropeMin {
    public static void main(String args[]){
        Scanner scn=new Scanner(System.in);
        System.out.println("Enter No. Of Test Casses");
        int t =scn.nextInt();
        while(t>0)
        {
            t--;
            System.out.println("Enter Array Size");
            int n =scn.nextInt();
            System.out.println(n);
            int [] array = new int [n];
            for(int i =0;i<n;i++)
            {
                array[i]=scn.nextInt();
            }


            Arrays.sort(array);
            for(int i=0;i<n;i++)
            System.out.println(array[i]);
            int sum1=0;
            
            for(int i=0;i<n-1;i++)
            {
                int sum=array[i]+array[i+1];
                array[i+1]=sum;
                sum1=sum1+sum;
                Arrays.sort(array);
            }

            System.out.println("---------------------------");

            System.out.println(sum1);


        }
    }
}
