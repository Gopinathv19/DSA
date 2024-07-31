import java.util.Arrays;
public class MergingSortedArrays {
    public static void main(String[] args) {
        int[] a = {23, 45, 67, 89};
        int[] b = {45, 89, 100, 204, 300};

        int[] mergedArray = mergeSortedArrays(a, b);
        System.out.println(Arrays.toString(mergedArray));

    }

    static int[] mergeSortedArrays(int[] a, int[] b) {
        int len1 = a.length-1;
        int len2 = b.length-1;
        int[] mergedArray = new int[len1 + len2];
        int i = 0, j = 0, k = 0;

        while (i < len1 && j < len2) {
            if (a[i] < b[j]) {
                mergedArray[k++] = a[i++];
            } if (a[i]>b[j]) {
                mergedArray[k++]=b[j++];
                
            }
            else{
                mergedArray[k++] = b[j++];
                i++;
            }
        }

        while (i < len1) {
            mergedArray[k++] = a[i++];
        }

        while (j < len2) {
            mergedArray[k++] = b[j++];
        }

        return mergedArray;
    }
}
