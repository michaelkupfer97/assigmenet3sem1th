package semester1.assigmenet3;
// assignment:3
// Author: Michael Kupfer , ID: 209493246

//program that gets from uesr square array and check if its magic square.
public class ex3 {
//    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//        System.out.println("what is the size you want the square will be?");
//        int size = input.nextInt();
//        int arr[][] = new int[size][size];
//        System.out.println("enter numbers one by one to check if they in magic square");
//        for (int i = 0; i < arr.length; i++) {
//            for (int j = 0; j < arr.length; j++) {
//                arr[i][j] = input.nextInt();
//            }
//        }
//        if(magicsquare(arr)) System.out.println("it IS a magic square!!!");
//        else System.out.println("its NOT a magic square!!! ");
//    }
    public static boolean magicsquare(int[][] arr) {
        //function that gets from user array[][] and checking if he is a magic square
        //array to check if all the numbers in the square appear only once.
        int arrtest[] = new int[(arr.length * arr.length)+1];
        //the function will put 1 in every []that is appearing in the square.
        int sumend = (arr.length * ((arr.length * arr.length) + 1)) / 2;
        int sum = 0;
        //check sum on every row.
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                sum += arr[i][j];
                if (arrtest[(arr[i][j])] == 1) {
                    System.out.println("error in the square ");
                    return false;
                }
                arrtest[(arr[i][j])] = 1;
            }
                if (sum != sumend) return false;
                sum = 0;
        }
        //check sum on every column
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                sum += arr[j][i];
            }
            if (sum != sumend) return false;
            sum = 0;
        }

        //check the slants (first).
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if(i==j) {
                    sum += arr[j][i];
                }
            }
        }
        if (sum != sumend) return false;
        sum = 0;

        //second slant.
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if(i+j+1==arr.length) {
                    sum += arr[j][i];
                }
            }
        }
        if (sum != sumend) return false;
        return true;
    }
}