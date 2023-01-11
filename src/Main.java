import java.util.Scanner;
public class Main {
    static Scanner keyboard = new Scanner(System.in);
    public static void main(String[] args) {

        String[][] gameBoardTicTacToe = {{" ", "|", " ", "|", " "},
                                        {"-", "+", "-", "+", "-"},
                                        {" ", "|", " ", "|", " "},
                                        {"-", "+", "-", "+", "-"},
                                        {" ", "|", " ", "|", " "}};

        System.out.print("Enter the position: ");
        int pos = keyboard.nextInt();

        if(pos == 1) {
            gameBoardTicTacToe[0][0] = "X";
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
