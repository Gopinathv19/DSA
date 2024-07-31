package patterns;

import java.util.Scanner;

public class pattern7 {

    public static void main(String[] args) {
        
        
        
        
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        pattern(n);
        sc.close();
        
    }
    static void pattern(int n)
    {
        for(int row =1;row<=n;row++)
        {
            for(int col=1;col<=n-row+1;col++)
            {
               int value=96;
               char character=(char)(value+col);
               System.out.print(character);
               
              
            }
            System.out.println();
                 
        }
    }
}
