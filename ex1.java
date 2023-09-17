package semester1.assigmenet3;
// assignment:3
// Author: Michael Kupfer , ID: 209493246
import java.util.Scanner;

//get a number from user and printing a diamond.
public class ex1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter positive odd number:");
        int n = input.nextInt();
        Diamond(n);
    }

    public static void Diamond(int n){
        //function that gets positive odd number from main and printing diamond
        //creating array in length of the number
        char arr[] = new char[n];
        //puts ' ' in every []
        for (int h =0;h< arr.length;h++)
            arr[h]=' ';
//create the diamond by 4 pieces, one in the top
        arr[(n/2)]='*';
        //second piece triangleuo
        for (int i =1; i<= (n/2);i++) {
            for (int m=0;m< arr.length;m++) System.out.print(arr[m]);
            System.out.println(' ');
            arr[(n/2)+i]='*';
            arr[(n/2)-i]='*';
        }
        //third piece
        arr[0]='*';
        arr[arr.length-1]='*';
        for (int m=0;m< arr.length;m++) System.out.print(arr[m]);
        System.out.println(' ');
//fourth piece
        for(int j=n/2;j>0;j--){
            arr[(n/2)+j]=' ';
            arr[(n/2)-j]=' ';
            for (int m=0;m< arr.length;m++) System.out.print(arr[m]);
            System.out.println(' ');
        }
    }
}

