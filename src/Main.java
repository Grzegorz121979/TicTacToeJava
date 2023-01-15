import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.Random;

public class Main {

    static Scanner keyboard = new Scanner(System.in);
    static Random myRandom = new Random();

    public static void main(String[] args) {

        String[][] gameBoard = {
                                        {" ", "|", " ", "|", " "},
                                        {"-", "+", "-", "+", "-"},
                                        {" ", "|", " ", "|", " "},
                                        {"-", "+", "-", "+", "-"},
                                        {" ", "|", " ", "|", " "}
                                        };

        System.out.print("Enter your placement (1-9): ");

        while (true) {
            int playerPosition  = keyboard.nextInt();
            takePosition(gameBoard, playerPosition, "player");

            int compPosition = myRandom.nextInt(9) + 1;
            takePosition(gameBoard, compPosition, "computer");

            printGameBoard(gameBoard);
        }
    }

    private static void printGameBoard(String[][] gameBoard) {
        for (String[] row : gameBoard) {
            for(String column : row) {
                System.out.print(column);
            }
            System.out.println();
        }
    }

    private static void takePosition(String[][] gameBoard, int position, String user) {

        String symbol = "X";

        if (user.equals("player")) {
            symbol = "X";
        } else if (user.equals("computer")) {
            symbol = "O";
        }

        switch (position) {
            case 1:
                gameBoard[0][0] = symbol;
                break;
            case 2:
                gameBoard[0][2] = symbol;
                break;
            case 3:
                gameBoard[0][4] = symbol;
                break;
            case 4:
                gameBoard[2][0] = symbol;
                break;
            case 5:
                gameBoard[2][2] = symbol;
                break;
            case 6:
                gameBoard[2][4] = symbol;
                break;
            case 7:
                gameBoard[4][0] = symbol;
                break;
            case 8:
                gameBoard[4][2] = symbol;
                break;
            case 9:
                gameBoard[4][4] = symbol;
                break;
            default:
        }
    }

    private static String winning() {
        List rowTop = Arrays.asList(1, 2, 3);
        List rowMiddle = Arrays.asList(4, 5, 6);
        List rowBottom = Arrays.asList(7, 8, 9);

        List columnLeft = Arrays.asList(1, 4, 7);
        List columnMiddle = Arrays.asList(2, 5, 8);
        List columnRight = Arrays.asList(3, 6, 9);

        List crossLeft = Arrays.asList(1, 5, 9);
        List crossRight= Arrays.asList(3, 5, 7);

        return "";
    }
}
