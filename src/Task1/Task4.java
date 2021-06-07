package Task1;

import java.util.Scanner;

public class Task4 {
    public String backAround(String str) {
        char tempChar = str.charAt(str.length()-1);
        String resString="";
        StringBuilder resString1 = new StringBuilder();
        resString1.append(tempChar);
        resString1.append(str);
        resString1.append(tempChar);
        resString = resString1.toString();

        //resString = str.concat(tempChar.tos);

        return resString;
    }




    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input string for executing in backAround operations");
        String inputString = scanner.nextLine();
        Task4 t4 = new Task4();
        System.out.println("Result String: " + t4.backAround(inputString));

    }
}
