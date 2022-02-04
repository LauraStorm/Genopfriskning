package opgave6Sorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Sorting {
    //Metode
    public void sort5Word (String word1, String word2, String word3, String word4, String word5){
        ArrayList<String> words = new ArrayList<String>();
        words.add(word1);
        words.add(word2);
        words.add(word3);
        words.add(word4);
        words.add(word5);

        Collections.sort(words, Collections.reverseOrder());

        for (String word : words) {
            System.out.println(word);
        }
    }


    public static void main(String[] args) {
        Sorting sorting = new Sorting();
        Scanner userInput = new Scanner(System.in);

        //Ask for 5 words
        System.out.println("Lets sort five words of your choice!");
        System.out.println("Please type your first word: ");
        String word1 = userInput.nextLine();
        System.out.println("Please type your second word: ");
        String word2 = userInput.nextLine();
        System.out.println("Please type your third word: ");
        String word3 = userInput.nextLine();
        System.out.println("Please type your fourth word: ");
        String word4 = userInput.nextLine();
        System.out.println("Please type your fifth word: ");
        String word5 = userInput.nextLine();

        //Show words sorted and reversed
        System.out.println("Here's your words sorted in reverse:");
        sorting.sort5Word(word1, word2, word3, word4, word5);

    }
}
