import java.util.Scanner;
import java.util.Random;
public class Main {
    static Scanner keyboard = new Scanner(System.in);
    static Random myRandom = new Random();
    public static void main(String[] args) {

        String[][] gameBoardTicTacToe = {
                                        {" ", "|", " ", "|", " "},
                                        {"-", "+", "-", "+", "-"},
                                        {" ", "|", " ", "|", " "},
                                        {"-", "+", "-", "+", "-"},
                                        {" ", "|", " ", "|", " "}
                                        };

        int pos;
        String symbol;
        int player = myRandom.nextInt(2);
        System.out.println(player);
        if (player == 1) {
            System.out.print("Enter the position: ");
            pos = keyboard.nextInt();
            symbol = "X";
        } else {
            pos = myRandom.nextInt(9) + 1;
            symbol = "O";
        }

        switch (pos) {
            case 1:
                gameBoardTicTacToe[0][0] = symbol;
                break;
            case 2:
                gameBoardTicTacToe[0][2] = symbol;
                break;
            case 3:
                gameBoardTicTacToe[0][4] = symbol;
                break;
            case 4:
                gameBoardTicTacToe[2][0] = symbol;
                break;
            case 5:
                gameBoardTicTacToe[2][2] = symbol;
                break;
            case 6:
                gameBoardTicTacToe[2][4] = symbol;
                break;
            case 7:
                gameBoardTicTacToe[4][0] = symbol;
                break;
            case 8:
                gameBoardTicTacToe[4][2] = symbol;
                break;
            case 9:
                gameBoardTicTacToe[4][4] = symbol;
                break;
            default:
        }

        printGameBoard(gameBoardTicTacToe);
    }

    private static void printGameBoard(String[][] gameBoard) {
        for (String[] row : gameBoard) {
            for(String column : row) {
                System.out.print(column);
            }
            System.out.println();
        }
    }
}
