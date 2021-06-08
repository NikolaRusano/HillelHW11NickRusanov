package Task1Till4;


import java.util.Scanner;

public class Task1 {
    public String afterFellInUpperCase (String inputString) {
        System.out.println("The string: \n" + inputString + "\n " +
                "Input word in the string: after that need to be taken");
        Scanner scanner = new Scanner(System.in);
        String s = "0";
        String foundAfterWord = scanner.nextLine();
        //ArrayList<String>splitString = new ArrayList<>();
        //int i = 0;
        /*for(String element:InputString.split("//W+")) {
            splitString.add(element);

        }*/
        String wordReturn="";
        String[] splitString1 = inputString.split("\\W+");
        for (int i = 0; i < splitString1.length; i++) {
            //System.out.println(splitString1[i]);
            if (foundAfterWord.contains(splitString1[i])) {
                wordReturn += splitString1[i + 1];
                wordReturn = wordReturn.toUpperCase();
                break;
            }



        }
        System.out.println(wordReturn);
        return wordReturn.toUpperCase();
    }








    public static void main(String[] args) {
        String inputString= "I guess you think you know this story. " +
                "You don't. The real one's much more gory." +
                "The phoney one, the one you know, " +
                "Was cooked up years and years ago, ";
        Task1 task1 = new Task1();
        task1.afterFellInUpperCase(inputString);
    }




}
