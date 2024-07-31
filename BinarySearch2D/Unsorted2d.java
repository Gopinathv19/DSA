package BinarySearch2D;

import java.util.Arrays;

public class Unsorted2d {
    public static void main(String[] args) {
         int[][] arr={
                 {1, 2, 3},
                 {4, 5, 6},
                 {7, 8, 9}
         };
         int[] result=searcher(arr,8);
        System.out.println(Arrays.toString(result));
    }
    static int [] searcher(int[][] arr,int target){
        for(int row=0;row<arr.length;row++){
            for(int col=0;col<arr[row].length;col++){
                if(target==arr[row][col]){
                    return new int[]{row+1,col+1};
                }
            }
        }
        return new int[]{-1,-1};
    }
}
