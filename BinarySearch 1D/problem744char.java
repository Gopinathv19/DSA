//https://leetcode.com/problems/find-smallest-letter-greater-than-target/description/

/*You are given an array of characters letters that is sorted in non-decreasing order, and a character target. There are at least two different characters in letters.

Return the smallest character in letters that is lexicographically greater than target. If such a character does not exist, return the first character in letters.*/
/*letters = ["x","x","y","y"]    target = "z"*/
/* ["c","f","j"], target = "c" */


public class problem744char
{
    public static void main(String[] args) {
        char[] letters={'c','f','j'};
        System.out.println(nextGreatestLetter(letters,'c'));

    }
    static  char nextGreatestLetter(char[] letters, char target)
    {
        int start=0;
        int end=letters.length-1;
 
        while(start<=end)
        {
            int mid=start+(end-start)/2;
            if(target<letters[mid])
            {
                end=mid-1;
            }
            else
            {
                start=mid+1;
            }
        }
        return letters[start % letters.length];
    }
}