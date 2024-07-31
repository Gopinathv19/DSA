package mypatterns;

public class pattern2
    {
    public static void main(String[] args) {
        pattern(5);
    }
    static void pattern(int n)
    {
        for(int rows=1;rows<=n;rows++)
        {
            for(int space=1;space<=rows-1;space++)
            {
                System.out.print(" ");
            }
            for(int col=1;col<=n-rows+1;col++)
            {
                System.out.print("* ");
            }
 
            System.out.println();
        }
    }
}

/* 

* * * * * 
 * * * *
  * * *
   * *
    *
*/