package Strings.stringBuilder;
import java.util.*;
public class stringRotatedOrNot  {
    public static void main(String[] args) {
          String str1 = "I am eating the apple";
          String str2 = "apple I am eating the apple";
          String concatenated = str1+str2;
        System.out.println(concatenated.contains(str2));
    }


}
