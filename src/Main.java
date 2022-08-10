
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Random rand = new Random();
        String [] colors = {"red", "blue", "green", "gray", "pink", "yellow"};
        System.out.println(colors [rand.nextInt(colors.length)]);
        System.out.println(colors [rand.nextInt(colors.length)]);
        System.out.println(colors [rand.nextInt(colors.length)]);
        System.out.println(colors [rand.nextInt(colors.length)]);

        Scanner input = new Scanner(System.in);
        String userI = input.nextLine();

        if (boolean userI =) {
            System.out.println("Correct!");
        } else if (userI = farbe) {                             // farbe
            System.out.println("Correct color");
        } else if (userI = ort) {                               // ort
            System.out.println("Correct place");
        } else {
            System.out.println("Try again");
        }


        // colors = array / colorScan = scanner /
                    // userI = variable
        // Yes No if Schleife
        // if richtige Farbe+Ort
        // int colorScan = scanner1.nextInt();

        Scanner colorScan = new Scanner(System.in);
        String userC = colorScan.nextLine();

        for (int i = 0; i < 6; i++) {

        switch(colors[i]) {
            case "red":
                System.out.print(" red");
                break;
            case "blue":
                System.out.print(" blue");
                break;
            case "green":
                System.out.print(" green");
                break;
            case "gray":
                System.out.print(" gray");
                break;
            case "pink":
                System.out.print(" pink");
                break;
            case "yellow":
                System.out.print(" yellow");
                break;
            default:
                System.out.print(" no color");
        }
        }

    }
}