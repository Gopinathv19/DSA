
import java.util.*;
public class multidimensionalarray {
    public static void main(String[] args) 
    {
        Scanner in =new Scanner(System.in);
        int[][] array=new int[3][3];
        for (int row=0;row<array.length;row++)
        {
             for(int col=0;col<array[row].length;col++)
             {
                array[row][col]=in.nextInt();
             }
        }
        // Method one to print 
        /*for (int row=0;row<array.length;row++)
        {
             for(int col=0;col<array[row].length;col++)
             {
                 System.out.print(array[row][col]+" ");
             }
             System.out.println();
        }*/
        // Advanced for loop method
        /*for(int[] a:array)
        {
            System.out.println(Arrays.toString(a));
        }*/
        // Method 3
        /*for (int row=0;row<array.length;row++)
        {
             System.out.println(Arrays.toString(array[row]));
        }*/
        in.close();

    }
}
