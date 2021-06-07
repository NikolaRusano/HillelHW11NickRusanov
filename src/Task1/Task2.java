package Task1;

import java.util.Scanner;

public class Task2 {
    public   String   withoutFirstAndLastChar(String  inputString)   {
        String resString="";
        try{
            char[] inputStringChar = inputString.toCharArray();
            char[] tmpCharArr = new char[inputStringChar.length-2];
            for(int i = 1; i < inputStringChar.length-1; i++){
                tmpCharArr[i-1] = inputStringChar[i];
            }
            resString = tmpCharArr.toString();
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println(e.getMessage());
            System.out.println("The string is too short and can't be cut off with first and last characters");
        }catch (NegativeArraySizeException e){

            System.out.println("Inncorrect string len for cut off");
            System.out.println(e.getMessage());
        }

        return resString;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input string for remove first and last character");
        String inputString = scanner.nextLine();
        Task2 t2 = new Task2();
        t2.withoutFirstAndLastChar(inputString);
    }






}
