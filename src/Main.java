import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        boolean place = false;
        boolean colorInput = false;

        Random rand = new Random();
        String [] colors = {"red", "blue", "green", "gray", "pink", "yellow"};
        for (int i = 0; i < 4; i++) {
            System.out.println(colors [rand.nextInt(colors.length)]);
        }

        for (int i = 0; i < 1; i++) {
            Scanner input = new Scanner(System.in);


            String [] userInputs = new String [4] ;
            for (int j = 0; j < 4; j++) {
                System.out.println("Insert color");
                userInputs [j] = input.nextLine();
            }

            if (userI.equals) {              // userI??
                System.out.println("Correct!");
            } else if (colorInput == true) {
                System.out.println("Correct color");
            } else if (place == true) {
                System.out.println("Correct place");
            } else {
                System.out.println("Wrong");
            }

        }

        // colors = array / colorScan = scanner /
        // Yes No if Schleife
        // if richtige Farbe+Ort
        // int colorScan = scanner1.nextInt();

        for (int i = 0; i < 6; i++) {

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
        }
        }

    }
}