import java.util.*;

public class leftRight {

    public static int[] breakArray(int array[],int i)
    {

        int[] arrayTemp = new int[array.length - 1];

                        for (int j = 0, k = 0; j < array.length; j++) {


                
                            if (j == i) {
                                continue;
                            }

                            arrayTemp[k++] = array[j];
                        }

        return arrayTemp;

    }
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


        int flag=1;


        while(flag==1)
        {
            flag=0;
        for(int i=0;i<n-1;i++)
        {

            if((array[i]>0 && array[i+1]<0))
            {
                if(array.length==2)
                {
                    System.out.println("[]");
                    break;
                }
                flag=1;
                if(Math.abs(array[i])>Math.abs(array[i+1])){
                        array=breakArray(array,i+1);
                        n=array.length;
                }
                else if(Math.abs(array[i])==Math.abs(array[i+1]))
                {
                    array=breakArray(array,i+1);
                    array=breakArray(array,i);
                    n=array.length;
                }
                else
                {
                    array=breakArray(array,i);
                    n=array.length;                  
                }
            }

            

        }
    }
    

    
    System.out.println("-------------------1");
    for(int k=0;k<n;k++)
    System.out.print(" "+array[k]);
    System.out.println("");
    System.out.println("-------------------1");
      

    }

    
}
