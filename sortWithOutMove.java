import java.util.*;
public class sortWithOutMove {

    public static void main( String [] args_)
    {
        Scanner scn=new Scanner(System.in);
        System.out.println("Enter The Array Size");
        int n =scn.nextInt();
        System.out.println(n);
        int [] array = new int [n];
        for(int i =0;i<n;i++)
        {
            array[i]=scn.nextInt();
        }
    
    
        for(int i =0;i<n;i++)
        {
            for(int j=i+1;j<n;j++)
            {
                
                if(array[i]>array[j] & (array[j]!=-1) & (array[i]!=-1))
                {
                    int tmp=array[i];
                    array[i]=array[j];
                    array[j]=tmp;
                    
                }
            }
        }

        
      System.out.println("-------------");
        for(int i =0;i<n;i++)
        {
            System.out.println(array[i]);
        }

    }

    
}
