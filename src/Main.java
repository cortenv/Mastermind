import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        System.out.println("Welcome to  Mastermind");

        String[] generatedColors = new String[4];
        Random rand = new Random();
        String[] colors = {"red", "blue", "green", "gray", "pink", "yellow"};
        for (int i = 0; i < 4; i++) {
            generatedColors[i] = colors[rand.nextInt(colors.length)];
            System.out.println(generatedColors[i]);
        }

        {
            Scanner input = new Scanner(System.in);


            String[] userInputs = new String[4];
            int j;
            System.out.println("Insert color");
            for (j = 0; j < 4; j++) {
                userInputs[j] = input.nextLine();
            }

            int correctPosition = 0;                    // !variablen für wv sind wrong/4correct/place
            int correctColor = 0;

            for (int i = 0; i < 4; i++) {
                if (userInputs[i].equals(generatedColors[i])) {     // alles richtig
                    correctPosition++;
                }
            } for (int k = 0; k < 4; k++) {
            if (userInputs[i].equals(generatedColors[k]) && k != i) { // richtige farbe, falscher ort
                correctColor++;
            }
        }
            System.out.println(correctPosition + " Correct!");
            System.out.println(correctColor + " Correct color, wrong place");
        }


    }
}
//option + command + L für formatting
//correct, wenn alles korrekt ist funktioniert (keine gleiche)
// correct + wrong place fehler wenn man richtige farben am falschen ort schreibt (keine gleichen)
// bei 2 gleichen farben kommt koplett correct + wrong place
/* for (int l = 0; l < 4; l++) {
                    if (!userInputs[l].equals(generatedColors[l])){                 // komplett falsch
                       System.out.println("Wrong");
                       */