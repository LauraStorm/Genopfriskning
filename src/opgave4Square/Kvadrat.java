package opgave4Square;

import java.util.Scanner;

public class Kvadrat {

    public void printKvadrat (int number, String aSign){
        for (int i = 1; i <= number ; i++) {    //Rækker
            for (int j = 1; j <= number ; j++) { //Kolonner
                System.out.print(" " + aSign + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Kvadrat kvadrat = new Kvadrat();
        Scanner userInput = new Scanner(System.in);

        //Get input
        System.out.println("Type a number for the square: ");
        int numberInput = userInput.nextInt();
        System.out.println("Chose a sign: ");
        String sign = userInput.next();

        //using the method
        System.out.println("Here is your square: ");
        kvadrat.printKvadrat(numberInput,sign);



    }
}


