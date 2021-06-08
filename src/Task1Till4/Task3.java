package Task1Till4;

import java.util.Scanner;

public class Task3 {

    public String repeatRepeatRepeat(String inputString) {
        try {
            String tempString = inputString.substring(0, 3);
            if (inputString.length()>3) {
                String resString = tempString.repeat(3);
                return resString;
            }else{
                return inputString;
            }
        }catch (Exception e){
            System.out.println(e.getMessage());
        }

        return inputString;
    }





    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input string for executing in repeat operations");
        String inputString = scanner.nextLine();
        Task3 t3 = new Task3();

        System.out.println(t3.repeatRepeatRepeat(inputString));
    }
}
