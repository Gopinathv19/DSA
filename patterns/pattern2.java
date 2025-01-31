package patterns;

public class pattern2 {
    static void pattern(int n)
    {
        for(int row=1;row<=2*n-1;row++)
        {
            int rule2=row>n?2*n-row:row;
            int rule1=row>n?row-n:n-row;
            for(int space=1;space<=rule1;space++)
            {
                System.out.print(" ");
            }
            for(int col=1;col<=rule2;col++)
            {
                System.out.print("* ");
            }
 
            System.out.println();
        }
    }
}
                                                          
 


/*  out put
    * 
   * *
  * * *
 * * * *
* * * * *
 * * * *
  * * *
   * *
    *

    */