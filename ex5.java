package semester1.assigmenet3;

import java.util.Scanner;

// assignment:3
// Author: Michael Kupfer , ID: 209493246
public class ex5 {
    public static void main(String[] args) {
        //main to check the function
        Scanner input = new Scanner(System.in);
        System.out.println("enter string for sorting ");
        String str = input.nextLine();
        int[] sorted = sorterstring(str);
        System.out.println("number of capital letter appear is "+sorted[0]);
        System.out.println("number of small letter appear is "+sorted[1]);
        System.out.println("number of numbers appear is "+sorted[2]);
        System.out.println("number of other chars appear is "+sorted[3]);
    }

    public static int[] sorterstring(String str) {
        //gets string from main and return sorted array
        int[] sorted = new int[4];
        //0-number of capital letters appear in string.
        //1-number of small letters appear in string.
        //2-number of numbers appear in string.
        //3-number of other chars appear in string.
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) > 64 && str.charAt(i) < 91) sorted[0]++;
            else if (str.charAt(i) > 96 && str.charAt(i) < 123) sorted[1]++;
            else if (str.charAt(i) > 47 && str.charAt(i) < 58) sorted[2]++;
            else if (str.charAt(i) > 31 && str.charAt(i) < 127) sorted[3]++;
        }
        return sorted;
    }
}
