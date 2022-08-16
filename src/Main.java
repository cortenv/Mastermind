import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        System.out.println("\n" +
                " _     _  _______  ___      _______  _______  __   __  _______    _______  _______    __   __  _______  _______  _______  _______  ______    __   __  ___   __    _  ______  \n" +
                "| | _ | ||       ||   |    |       ||       ||  |_|  ||       |  |       ||       |  |  |_|  ||   _   ||       ||       ||       ||    _ |  |  |_|  ||   | |  |  | ||      | \n" +
                "| || || ||    ___||   |    |       ||   _   ||       ||    ___|  |_     _||   _   |  |       ||  |_|  ||  _____||_     _||    ___||   | ||  |       ||   | |   |_| ||  _    |\n" +
                "|       ||   |___ |   |    |       ||  | |  ||       ||   |___     |   |  |  | |  |  |       ||       || |_____   |   |  |   |___ |   |_||_ |       ||   | |       || | |   |\n" +
                "|       ||    ___||   |___ |      _||  |_|  ||       ||    ___|    |   |  |  |_|  |  |       ||       ||_____  |  |   |  |    ___||    __  ||       ||   | |  _    || |_|   |\n" +
                "|   _   ||   |___ |       ||     |_ |       || ||_|| ||   |___     |   |  |       |  | ||_|| ||   _   | _____| |  |   |  |   |___ |   |  | || ||_|| ||   | | | |   ||       |\n" +
                "|__| |__||_______||_______||_______||_______||_|   |_||_______|    |___|  |_______|  |_|   |_||__| |__||_______|  |___|  |_______||___|  |_||_|   |_||___| |_|  |__||______| \n" +
                "\n");
        System.out.println("Do you want to start Mastermind?");
        System.out.println("Write \"Yes\" to start the game!");
        Scanner scanner1 = new Scanner(System.in);
        String inputSting = scanner1.nextLine().toLowerCase();

        if (inputSting.equals("yes")) {
            System.out.println("The game has started!");
            System.out.println("4 random colors have been generated, you have 12 tries to figure them, and their order, out.");
            System.out.println("You can write 4 colors!");
            System.out.println("Available are red, blue, green, yellow, gray and pink.");
        } else {
            System.err.println("\n" +
                    "   _______  ______    ______    _______  ______      _   ___  _______  _   ___ \n" +
                    "  |       ||    _ |  |    _ |  |       ||    _ |    | | |   ||  _    || | |   |\n" +
                    "  |    ___||   | ||  |   | ||  |   _   ||   | ||    | |_|   || | |   || |_|   |\n" +
                    "  |   |___ |   |_||_ |   |_||_ |  | |  ||   |_||_   |       || | |   ||       |\n" +
                    "  |    ___||    __  ||    __  ||  |_|  ||    __  |  |___    || |_|   ||___    |\n" +
                    "  |   |___ |   |  | ||   |  | ||       ||   |  | |      |   ||       |    |   |\n" +
                    "  |_______||___|  |_||___|  |_||_______||___|  |_|      |___||_______|    |___|\n" +
                    " \n");
            return;
        }


        String[] generatedColors = new String[4];
        Random rand = new Random();
        String[] colors = {"red", "blue", "green", "yellow", "gray", "pink"};
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
                    userInputs[j] = input.nextLine().toLowerCase();
                    boolean isCorrectColor = false;
                    for (int i = 0; i < colors.length; i++) {
                        if ((userInputs[j].equals(colors[i]))) {
                            isCorrectColor = true;
                        }
                    }
                    if (isCorrectColor) {

                    } else {
                        System.out.println("Didn't you read what colors you can input? Input a COLOR");
                    }

                }

                int correctPosition = 0;
                int correctColor = 0;


                String[] matchingUin = generatedColors.clone();
                for (int i = 0; i < 4; i++) {
                    if (userInputs[i].equals(matchingUin[i])) {
                        for (int j = 0; j < 4; j++) {
                            if (userInputs[j].equals(colors[j])) ;
                            {
                                matchingUin[i] = "";
                                correctPosition++;
                                break;
                            }
                        }
                    }
                }
                for (int i = 0; i < 4; i++) {
                    for (int k = 0; k < 4; k++) {
                        if (matchingUin[i].equals(userInputs[k])) {
                            correctColor++;
                            break;
                        }
                    }
                }
                System.out.println(correctPosition + " Correct");
                System.out.println(correctColor + " Correct color, wrong place");
                if (correctPosition == 4) {
                    System.out.println("\n" +
                            "   __   __  _______  __   __    _     _  _______  __    _    _______  __   __  _______    _______  _______  __   __  _______ \n" +
                            "  |  | |  ||       ||  | |  |  | | _ | ||       ||  |  | |  |       ||  | |  ||       |  |       ||   _   ||  |_|  ||       |\n" +
                            "  |  |_|  ||   _   ||  | |  |  | || || ||   _   ||   |_| |  |_     _||  |_|  ||    ___|  |    ___||  |_|  ||       ||    ___|\n" +
                            "  |       ||  | |  ||  |_|  |  |       ||  | |  ||       |    |   |  |       ||   |___   |   | __ |       ||       ||   |___ \n" +
                            "  |_     _||  |_|  ||       |  |       ||  |_|  ||  _    |    |   |  |       ||    ___|  |   ||  ||       ||       ||    ___|\n" +
                            "    |   |  |       ||       |  |   _   ||       || | |   |    |   |  |   _   ||   |___   |   |_| ||   _   || ||_|| ||   |___ \n" +
                            "    |___|  |_______||_______|  |__| |__||_______||_|  |__|    |___|  |__| |__||_______|  |_______||__| |__||_|   |_||_______|\n" +
                            " \n");
                    break;
                } else if (m >= 11) {
                    System.out.println("\n" +
                            "   __   __  _______  __   __    ___      _______  _______  _______    _______  __   __  _______    _______  _______  __   __  _______ \n" +
                            "  |  | |  ||       ||  | |  |  |   |    |       ||       ||       |  |       ||  | |  ||       |  |       ||   _   ||  |_|  ||       |\n" +
                            "  |  |_|  ||   _   ||  | |  |  |   |    |   _   ||  _____||_     _|  |_     _||  |_|  ||    ___|  |    ___||  |_|  ||       ||    ___|\n" +
                            "  |       ||  | |  ||  |_|  |  |   |    |  | |  || |_____   |   |      |   |  |       ||   |___   |   | __ |       ||       ||   |___ \n" +
                            "  |_     _||  |_|  ||       |  |   |___ |  |_|  ||_____  |  |   |      |   |  |       ||    ___|  |   ||  ||       ||       ||    ___|\n" +
                            "    |   |  |       ||       |  |       ||       | _____| |  |   |      |   |  |   _   ||   |___   |   |_| ||   _   || ||_|| ||   |___ \n" +
                            "    |___|  |_______||_______|  |_______||_______||_______|  |___|      |___|  |__| |__||_______|  |_______||__| |__||_|   |_||_______|\n" +
                            "                                                                                                                                      \n" +
                            "                                                                                                                                        \n");
                    System.out.println("\n" +
                            "   _______  _______  __   __  _______    _______  __   __  _______  ______   \n" +
                            "  |       ||   _   ||  |_|  ||       |  |       ||  | |  ||       ||    _ |  \n" +
                            "  |    ___||  |_|  ||       ||    ___|  |   _   ||  |_|  ||    ___||   | ||  \n" +
                            "  |   | __ |       ||       ||   |___   |  | |  ||       ||   |___ |   |_||_ \n" +
                            "  |   ||  ||       ||       ||    ___|  |  |_|  ||       ||    ___||    __  |\n" +
                            "  |   |_| ||   _   || ||_|| ||   |___   |       | |     | |   |___ |   |  | |\n" +
                            "  |_______||__| |__||_|   |_||_______|  |_______|  |___|  |_______||___|  |_|\n" +
                            "                                                      \n");
                    break;
                }
            }
        }


    }
}