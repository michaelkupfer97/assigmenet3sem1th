package semester1.assigmenet3;
// assignment:3
// Author: Michael Kupfer , ID: 209493246
import java.util.Scanner;

public class ex4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter your 8 digit ID:");
        String str = input.nextLine();
        System.out.println(Idcheckdigit(str));
    }
    public static int Idcheckdigit(String id) {
//gets 8-digit id from main and return the check digit of that israeli id number.
        int sum = 0;
        for (int i = 0; i < id.length()-1; i += 2) {
            sum += Integer.parseInt(String.valueOf(id.charAt(i)));
            int i1 = Integer.parseInt(String.valueOf(id.charAt(i + 1))) * 2;
            if (i1 >= 10)
                sum += ((i1 % 10 )+( i1 / 10));
            else
                sum += i1;
        }
        return 10 - (sum % 10);
    }
}
