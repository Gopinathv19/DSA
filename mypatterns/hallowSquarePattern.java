
package mypatterns;

public class hallowSquarePattern {
    public static void main(String[] args) {
        pattern(5);
    }
    static void pattern(int n){
        for(int row=1;row<=n;row++){
            for(int col=1;col<=n;col++){
                if(row==1||col==1||col==n||row==n){
                    System.out.print("* ");
                }
                else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
