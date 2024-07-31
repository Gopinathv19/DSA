package Insertion_Sort;

public class Insertion_sort_Algo {
    public static void main(String[] args) {
        int[]arr={5,4,3,2,1};
        insertion_sort(arr);
    }
    static void insertion_sort(int[]arr){
        for(int i=0;i<arr.length-1;i++){
            for(int j=i+1;j>0;j--){
                if(arr[j]<arr[j-1]){
                    int temp=arr[j];
                    arr[j]=arr[j-1];
                    arr[j-1]=temp;
                }
                else{
                    break;
                }
            }
        }
        for(int n:arr){
            System.out.print(n+" ");
        }
    }
}
