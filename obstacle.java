import java.util.*;
public class obstacle {
    public static void main(String args[]){


        Scanner scn=new Scanner(System.in);
        System.out.println("Enter Array Size");
        int n =scn.nextInt();
        System.out.println(n);
        int [] array = new int [n];
        for(int i =0;i<n;i++)
        {
            array[i]=scn.nextInt();
        }

        Arrays.sort(array);
        int flag=0;

        for(int j=1;j<=array[array.length-1]+1;j++)
        {
            for(int k=j;k<=array[array.length-1]+1;)
            {

                for(int i:array)
                {
                    if(i==k)
                    {
                        flag=1;
                        break;
                    }

                }

                if(flag==1)
                    {
                        break;
                    }
                k=k+j;
            }

            if(flag==0)
                    {
                      System.out.println(j);
                      break;
                    }
            flag=0;
        
        }

    

    }

    
}
