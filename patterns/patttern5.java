package patterns;

public class patttern5 {

    static void pattern5(int n)
    {
        for(int row=1;row<=(2*n)-1;row++)
        {
            int rule=row>n?(2*n)-row:row;
            for(int col=1;col<=rule;col++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}


/*output 


*
**
***
****
*****
****
***
**
*


*/