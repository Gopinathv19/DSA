package patterns;

public class pattern1 {

    static void patttern1(int n)
    {
        for(int row=1;row<=2*n-1;row++)
        {
            int rule=row>n?2*n-row:row;
            int rule2=row>n?row-n:n-row;
            for(int col=1;col<=rule;col++)
            {
                System.out.print("*");
            }
            for(int space=1;space<=rule2;space++)
            {
                System.out.print(" ");
            }
            for(int space=1;space<=rule2;space++)
            {
                System.out.print(" ");
            }
            for(int col=1;col<=rule;col++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
         
    }
}

/*out put  

*        *
**      **
***    ***
****  ****
**********
****  ****
***    ***
**      **
*        *



*/