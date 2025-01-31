package patterns;

public class pattern6 {
    public static void printer(int n)
    {
        for(int row=1;row<=n;row++)
        {
            for(int space=1;space<=row;space++)
            {
                System.out.print(" ");
            }
            for(int col =1;col<=n-row+1;col++)
            {
                System.out.print("*");
            }
            for(int k=1;k<=n-row;k++)
            {
                System.out.print("*");
            }
 
            System.out.println();
        }
    }
}

/*
        *********
         *******
          *****
           ***
            *

*/
