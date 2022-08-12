import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        System.out.println("Welcome to  Mastermind");
        System.out.println("The colors you can use are red, blue, green, gray, pink and yellow.");

        String[] generatedColors = new String[4];
        Random rand = new Random();
        String[] colors = {"red", "blue", "green", "gray", "pink", "yellow"};
        for (int i = 0; i < 4; i++) {
            generatedColors[i] = colors[rand.nextInt(colors.length)];
            System.out.println(generatedColors[i]);
        }


        for (int m = 0; m < 12; m++) {
            {

                Scanner input = new Scanner(System.in);


                String[] userInputs = new String[4];
                System.out.println("Insert 4 colors");
                for (int j = 0; j < 4; j++) {
                    userInputs[j] = input.nextLine();
                    boolean isCorrectColor = false;
                    for (int i = 0; i < colors.length; i++) {
                        if ((userInputs[j].equals(colors[i]))) {
                            isCorrectColor = true;
                        }
                    }
                    if (isCorrectColor) {
                        System.out.println("in if");
                    } else {

                        System.out.println("Didn't you read what colors you can input? Input a color");
                    }

                }

                int correctPosition = 0;                    // !variablen für wv sind correct/place
                int correctColor = 0;
                int match = 0;


                String[] matchingUin = userInputs.clone();
                for (int i = 0; i < 4; i++) {
                    if (userInputs[i].equals(generatedColors[i])) {     // alles richtig
                        correctPosition++;
                        for (int j = 0; j < 4; j++) {
                            if (userInputs[j] == colors[j]);
                            break;
                        }
                        matchingUin[match] = ("");
                        match++;

                    }
                    for (int k = 0; k < 4; k++) {
                        if (userInputs[i].equals(generatedColors[k]) && k != i) { // richtige farbe, falscher ort
                            correctColor++;
                            break;
                        }
                    }
                }
                System.out.println(correctPosition + " Correct");
                System.out.println(correctColor + " Correct color, wrong place");
                if (correctPosition == 4) {
                    System.out.println("You got all 4 colors correct! Congratulations!!");
                    break;
                }
            }
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