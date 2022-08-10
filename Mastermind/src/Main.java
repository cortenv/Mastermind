import java.awt.*;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    Scanner scanner1= new Scanner(System.in);
    String Start= scanner1.nextLine();
        System.out.println("Do you want to start the game?");           // Yes No if Schleife
        String Yes = scanner1.nextLine();

        Math.random();          // Braucht 6 Farben

            System.out.println("The game has been started!");

        String Nice= scanner1.nextLine();
        System.out.println("Four random colors have been generated.");








        Scanner color = new Scanner(System.in);

        Color red = new Color(255, 0,0);            // 6 farben
        Color blue = new Color(0, 0, 255);
        Color green = new Color(0, 255,0);
        Color gray = new Color(100,100,100);

        switch(color) {             // if richtige Farbe+Ort
            case "red":
                System.out.println();
                break;
            case "blue":
                System.out.println();
                break;
            case "green":
                System.out.println();
                break;
            case "gray":
                System.out.println();
                break;

        }




    }
}
