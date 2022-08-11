import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        System.out.println("Welcome to  Mastermind");

        String[] generatedColors= new String[4];
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

            int correctPosition = 0;
            int correctColor = 0;

            for (int i = 0; i < 4; i++) {
                if (userInputs[i].equals(generatedColors[i])) {
                    System.out.println("Correct!");
                    correctPosition++;
                }
                for (int k = 0; k < 4; k++) {
                    if (userInputs[i].equals(generatedColors[k]) && k != i){
                        System.out.println("Correct color, wrong place");
                    }
                    }
                for (int l = 0; l < 4; l++) {
                    if (!userInputs[l].equals(generatedColors[l])){
                        System.out.println("Wrong");
                    }
                }
            }

        }

        // colors = array / colorScan = scanner /
        // Yes No if Schleife
        // if richtige Farbe+Ort
        // int colorScan = scanner1.nextInt();

        /* for (int i = 0; i < 6; i++) {
            switch(colors[i]) {
            case "red":
                System.out.println(" red");
                break;
            case "blue":
                System.out.println(" blue");
                break;
            case "green":
                System.out.println(" green");
                break;
            case "gray":
                System.out.println(" gray");
                break;
            case "pink":
                System.out.println(" pink");
                break;
            case "yellow":
                System.out.println(" yellow");
                break;
            default:
                System.out.println(" no color");
                 else if (i == j) {
                    System.out.println("Correct");
                }
        }
        */
        }

    }
