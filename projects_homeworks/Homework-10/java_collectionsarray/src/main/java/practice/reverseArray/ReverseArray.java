package practice.reverseArray;

import java.util.*;

public class ReverseArray {

    public static void main(String[] args) {
        String[] arr = {"a", "b", "c", "d"};
        System.out.println(Arrays.toString(reverse(arr)));
    }
    public static String[] reverse(String[] strings) {
        List<String> list = Arrays.asList(strings);
        Collections.reverse(list);
        strings = list.toArray(strings);
        return strings;
    }

}