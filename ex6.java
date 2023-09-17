    package semester1.assigmenet3;
    // assignment:3
    // Author: Michael Kupfer , ID: 209493246
    import java.util.Scanner;

    public class ex6 {
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            String str= "mike";
            System.out.println("enter the char table: ");
            char[][] array = new char[5][5];
            for (int i =0;i< array.length;i++)
                for (int j=0;j<array[0].length;j++){
                    array[i][j]=input.next().charAt(0);
                }
            System.out.print("the index is in: ");
            findstrinarr(array,str);

        }


        //function that get array of chars and string from main and check if string appear in the array (row, column,slant)
        //return when find the first appearance.
        public static void findstrinarr(char[][] array, String str) {
            //loop that check if string appear in rows of array
            for (int row = 0; row < array.length; row++) {
                //turn each row to new string
                String sentencerow = String.copyValueOf(array[row]);
                //check if string that we need to find is appear in the row-string we made.
                if (sentencerow.contains(str)) {//if true print the index of it.
                    System.out.println("(" + row + "," + sentencerow.indexOf(str.charAt(0)) + ")" + "(" + row + "," + sentencerow.indexOf(str.charAt(str.length() - 1)) + ")");
                    return;
                }
            }
            //loop that check if string appear every column in array
            for (int col = 0; col < array[0].length; col++) {
                //turn each column to new string
                String sentencecol = "";
                for(int i =0;i<array[0].length;i++)sentencecol+=array[i][col];
                //check if string that we need to find is appear in the column-string we made.
                if (sentencecol.contains(str)) {//if true print the index of it.
                    System.out.println("(" + sentencecol.indexOf(str.charAt(0)) + "," + col + ")" + "(" + sentencecol.indexOf(str.charAt(str.length() - 1)) + "," + col + ")");
                    return;
                }
            }

            //make 2 new char array to contain the slants values and then compare with original string.
            //make the main slant array
            char[] mainslant = new char[array.length];
            for (int i = 0; i < array.length; i++)
                for (int j = 0; j < array[0].length; j++)
                    if (i == j) mainslant[i] = array[i][j];
            //make string from the array mainslant.
            String mains = String.copyValueOf(mainslant);
            if (mains.contains(str)) {//check if he contains the string and if true print the index.
                System.out.println("(" + mains.indexOf(str.charAt(0)) + "," + mains.indexOf(str.charAt(0)) + ")" + "(" + mains.indexOf(str.charAt(str.length() - 1)) + "," + mains.indexOf(str.charAt(str.length() - 1)) + ")");
                return;
            }


            //make the second slant array
            char[] secondslant = new char[array[0].length];
            int h = 0;
            for (int i = array.length-1; i >= 0; i--)
                for (int j = 0; j < array[0].length; j++)
                    if ((i + j) == (array.length - 1)) {
                        secondslant[h] = array[i][j];
                        h++;
                    }
            //make string from the array secondslant.
            String seconds = String.copyValueOf(secondslant);
            if (seconds.contains(str)) {//check if he contains the string and if true print the index.
                int index1 = (seconds.indexOf(str.charAt(0)));
                int arraylength = array.length-1;
                System.out.println("(" + (arraylength - index1) + "," + index1 + ")" + "(" + (arraylength - seconds.indexOf(str.charAt(str.length() - 1))) + "," + seconds.indexOf(str.charAt(str.length()-1)) + ")");
                return;
            }
            System.out.println("the word does not appear in the table!");
        }
    }


