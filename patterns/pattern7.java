package patterns;

 

public class pattern7 {


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
