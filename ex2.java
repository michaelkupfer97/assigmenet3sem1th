package semester1.assigmenet3;
// assignment:3
// Author: Michael Kupfer , ID: 209493246
import java.util.Scanner;
//gets from user range of numbers and print the numbers that are plindrome and prime in that range.
public class ex2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //System.out.println("enter positive number:");
       // int n = input.nextInt();
        //check ex1
       // if(ispalindrome(n)) System.out.println("yes");
       // else System.out.println("no");
        //check ex2
       // if(isprime(n)) System.out.println("yes");
        //else System.out.println("no");
        //check ex3
        // System.out.println("enter 2 numbers to get all prime and palindrome numbers in the range:");
       // int num1 =input.nextInt();
       // int num2=input.nextInt();
       // rangepaliandprime(num1,num2);
    }

    public static boolean ispalindrome(int number){
   //function that get number from the main and check if he is palindrome and return T/F
        int n=0;
        int number1=number;
        int count=0;
        //count number of digits
        while(number1>0){
            count++;
            number1/=10;
        }
        int number2=number;
        int digit=0;
        //loop that makes new number upside-down from original number
        while(number2>0){
            digit = (number2 % 10);
            //multiply num of digit in any number
            for (int i=1;i<count;i++) {
                digit*=10;
            }
            n+=digit;
            number2/=10;
            count--;
        }
        //check if the number from the main and the new numbers is the same and returns T/F
        if (number==n)return true;
        return false;
    }
    public static boolean isprime(int number) {
        //get number from the main and check if he is primary
        for (int i = 2; i < (int) Math.sqrt(number)+1; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void rangepaliandprime(int num1, int num2) {
        //get 2 numbers of range from the main and check if they are prime and palindrome
        //loop that uses the other 2 functions to check info about the range and print true ones
        for (int i = num1; i < num2; i++) {
            if(isprime(i)&&ispalindrome(i))
                System.out.print(i+" ");
        }
    }
}
