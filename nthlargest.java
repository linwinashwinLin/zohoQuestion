import java.util.*;

public class nthlargest {

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

        System.out.println("Enter The Nth Possition");
        int nth=scn.nextInt();

        if(nth>0 & nth<array.length)
        System.out.println("The number you looking for is: "+array[array.length-nth]);
        else
        {
            System.out.println("index out of bound");
        }



    }
    
    
}
