package mypatterns;

public class pattern1 {
    public static void main(String[] args) {
        patttern(5);
    }
    static void patttern(int n)
    {
        for(int row=1;row<=n;row++)
        {
            for(int space=1;space<=n-row;space++)
            {
                System.out.print(" ");
            }
            for(int col=row;col>=1;col--)
            {
                System.out.print(col);
            }
            for(int col=2;col<=row;col++)
            {
                System.out.print(col);
            }
            System.out.println();
        }
    }
}

/* 
    1
   212
  32123
 4321234
543212345
*/