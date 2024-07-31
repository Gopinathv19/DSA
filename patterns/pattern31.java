public class pattern31
{
    public static void main(String[] args) {
        pattern(4);
    }
    static void pattern(int n)
    {
        int originaln=n;
        n=2*n-1;
        for(int row=1;row<=n;row++)
        {
            for(int col=0;col<=n;col++)
            {
                int rule=originaln-Math.min(Math.min(row, col),Math.min(n-row,n-col));
                if(rule!=0)
                System.out.print(rule);
            }
            System.out.println();
        }
    }
}