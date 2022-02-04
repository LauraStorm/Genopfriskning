package opgave3Grass;

import java.util.Scanner;

public class Græsset {

    public int daysUntilCutTheLawn (double currentGrassLength, double maxGrassLength){
        double growthPerDay = 0.8;
        int days = 0;

        for (int i = 0; i <= maxGrassLength; i++) {
            if (currentGrassLength < maxGrassLength){
                currentGrassLength = currentGrassLength + growthPerDay;
                days++;
            }
        }

        return days;
    }

    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        Græsset græsset = new Græsset();

        System.out.println("Please type your current grass length: ");
        double currentGrassLength = userInput.nextDouble();

        System.out.println("Please type your max grass Length: ");
        double maxLength = userInput.nextDouble();

        int daysUntilCutTheLawn = græsset.daysUntilCutTheLawn(currentGrassLength,maxLength);
        System.out.println("Days until you have to cut the lawn: " + daysUntilCutTheLawn);



    }
}
