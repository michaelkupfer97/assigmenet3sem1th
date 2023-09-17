package semester1.assigmenet3;

import java.util.Scanner;

// assignment:3
// Author: Michael Kupfer , ID: 209493246
public class ex7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String str= "hello";
        System.out.println("enter your words: ");
        String[][] array = new String[2][3];
        for (int i =0;i< array.length;i++)
            for (int j=0;j<array[0].length;j++) {
                array[i][j] = input.nextLine();
            }
        System.out.println("number of words before your string is :"+numwordsbefore(array,str));
        String [] words =wordsbefore(array,str);
        System.out.println("the words are:");
        for (int i=0;i<words.length;i++)
            System.out.println(words[i]);
    }


    public static int numwordsbefore(String array[][], String str) {
        //function that gets array and string from main and return the number of words that lexicographic before it.
        int count = 0;
        for (int i = 0; i < array.length; i++)
            for (int j = 0; j < array[0].length; j++) {
                if (str.compareTo(array[i][j]) > 0)
                    count++;
            }
        return count;
    }

    public static String[] wordsbefore(String array[][], String str) {
        //function that gets array and string from main and return array of words that lexicographic before it.
        String[] words = new String[numwordsbefore(array, str)];//determine the size of array by using numwordsbefore function/
        int h = 0;
        for (int i = 0; i < array.length; i++)
            for (int j = 0; j < array[0].length; j++) {
                if (str.compareTo(array[i][j]) > 0) {
                    words[h] = array[i][j];
                    h++;
                }
            }
        return words;
    }
}