package Strings.stringBuilder;
import java.util.*;
public class stringMethods {
    public static void main(String[] args) {
        String str = "gopi nath";
        System.out.println("************** The string methods **************");
        System.out.println(str.length());
        System.out.println(str.substring(1,5));
        System.out.println(str.indexOf("nath"));
        System.out.println(str.equals("gopinath"));
        System.out.println(str.equalsIgnoreCase("Gopinath"));
        System.out.println(str.replace('o','q'));
        System.out.println(str.trim());
        String[] str2 = str.split(" ");
        System.out.println(Arrays.toString(str2));
        System.out.println(str.contains("na"));
        System.out.println(str.substring(1,4));


        System.out.println("*************** The String Builder Methods");

        StringBuilder sb = new StringBuilder(str);

        sb.insert(0,"V ");
        System.out.println(sb);

        System.out.println(sb.delete(2,5));

        System.out.println(sb.reverse());

        sb.setCharAt(0,'q');
        System.out.println(sb);

        sb.replace(0,5,"gopi");
        System.out.println(sb);

        System.out.println(sb.capacity());


    }
}
