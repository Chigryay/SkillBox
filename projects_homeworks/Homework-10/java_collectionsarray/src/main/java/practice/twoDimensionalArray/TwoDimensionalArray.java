package practice.twoDimensionalArray;

import java.util.Arrays;
import java.util.stream.Stream;

public class TwoDimensionalArray {

    public static final char SYMBOL = 'X';

    public static void main(String[] args) {
        char[][] arr = getTwoDimensionalArray(7);
        for (char[] chars : arr) {
            System.out.println(Arrays.toString(chars));
        }
    }

    public static char[][] getTwoDimensionalArray(int size) {

        //TODO: Написать метод, который создаст двумерный массив char заданного размера.
        // массив должен содержать символ SYMBOL по диагоналям, пример для size = 3
        // [X,  , X]
        // [ , X,  ]
        // [X,  , X]

        char[][] arr = new char[size][size];

        char x = 'X';


        int start = 0;
        int end = arr.length - 1;


        for (int i = 0; i < arr.length; i++) {

            for (int j = 0; j < arr.length; j++) {
                arr[i][j] = ' ';
                arr[i][start] = x;
                arr[i][end] = x;
            }
            start++;
            end--;
        }

        return arr;
    }
}
