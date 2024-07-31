package BubbleSorting;
import java.util.*;
public class BubbleSortingAlgo {
    public static void main(String[] args) {
int [] arr={2,4,3,10,7};
sorter(arr);
System.out.println(Arrays.toString(arr));
    }
    static void  sorter(int []arr){
        boolean swaped=false;
        for(int i=0;i<arr.length;i++){
            for(int j=1;j<arr.length-i;j++){
                if(arr[j-1]>arr[j]){
                    int temp = arr[j];
                    arr[j]=arr[j-1];
                    arr[j-1]=temp;
                    swaped=true;
                }
                if(!swaped){
                    break;
                }
            }
        }
    }
}
