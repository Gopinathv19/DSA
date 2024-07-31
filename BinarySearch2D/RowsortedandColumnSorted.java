package BinarySearch2D;

import java.util.Arrays;

public class RowsortedandColumnSorted {
    public static void main(String[] args) {
        int [][] array={
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}

        };
        int[] result=answer(array,6);
        System.out.println(Arrays.toString(result));
    }
    static int[] answer(int[][]array,int target){

        int row=0;
        int col=array.length-1;
        while(row<array.length && col>=0){
            if(target==array[row][col]){
                return new int[]{row,col};
            }
            if(target>array[row][col]){
                row++;
            }
            else{
                col--;
            }
        }
        return new int[]{-1,-1};

    }

}
