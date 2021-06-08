package Task1Till4;

import java.util.Scanner;

public class Task2 {
    public String withoutFirstAndLastChar(String inputString) {
        String resString = "";
        try {
            char[] inputStringChar = inputString.toCharArray();
            char[] tmpCharArr = new char[inputStringChar.length - 2];

           /* for(int i = 1; i < inputStringChar.length-1; i++){
                tmpCharArr[i-1] = inputStringChar[i];*/
            //System.out.println(tmpCharArr[i-1]);

            //System.out.println(resString += tmpCharArr.toString());
            System.out.println(resString = inputString.substring(1, inputString.length() - 1));
            if (resString.length() == 0) {
                System.out.println("the word is too short there is only 2 char for cut off");
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e.getMessage());
            System.out.println("The string is too short and can't be cut off with first and last characters");
        } catch (NegativeArraySizeException e1) {

            System.out.println("Incorrect string len for cut off");
            System.out.println(e1.getMessage());

        }

        return resString;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input string for remove first and last character");
        String inputString = scanner.nextLine();
        Task2 t2 = new Task2();
        System.out.println(t2.withoutFirstAndLastChar(inputString));
    }


}
