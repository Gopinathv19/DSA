package patterns;
import java.util.*;
public class zohoPattern {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();

      int[][] pattern = new int[n][n];
      int num=1;
      int rowEnd=0;
      for(int i=0;i<n;i++) {
          for(int j=n-1;j>=rowEnd;j--) {
              pattern[j][i] = num++;
          }
          rowEnd++;
      }

      for(int i=0;i<pattern.length;i++){
          for(int j=0;j<pattern[0].length;j++){
              if(pattern[i][j]==0){
                  continue;
              }
              else {
                  System.out.print(pattern[i][j]);
              }
          }
          System.out.println();
      }
    }

}




