package Strings.stringBuilder;

public class reverseWordInString {

    public static void main(String[] args) {
        String s = "        the blue is   the        sky    ";
        reverseWordInString rs = new reverseWordInString();
        String news=rs.reverseWords(s);
        System.out.println(news);
    }
    public String reverseWords(String s) {
        String[] arrayOfWords = s.trim().split("\\s+");
        int left = 0;
        int right = arrayOfWords.length - 1;

        while (left < right) {
            String temp = arrayOfWords[left];
            arrayOfWords[left] = arrayOfWords[right];
            arrayOfWords[right] = temp;
            left++;
            right--;
        }

        return String.join(" ", arrayOfWords);
    }
}




