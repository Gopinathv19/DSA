package segmentTree;

//https://leetcode.com/problems/fruits-into-baskets-iii/description
public class fruitsIntoBaskets3 {
    public static void main(String[] args) {
        // fruits = [4,2,5], baskets = [3,5,4]
        int [] fruits = {4,2,5};
        int[] baskets = {3,5,4};
        segmentTreeImplementation sc = new segmentTreeImplementation();
        System.out.println(sc.numOfFruitsNotFited(fruits,baskets));
    }
}
