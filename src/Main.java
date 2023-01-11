public class Main {
    public static void main(String[] args) {

        String[][] gameBoardTicTacToe = {{" ", "|", " ", "|", " "},
                                        {"-", "+", "-", "+", "-"},
                                        {" ", "|", " ", "|", " "},
                                        {"-", "+", "-", "+", "-"},
                                        {" ", "|", " ", "|", " "}};

        printGameBoard(gameBoardTicTacToe);
    }

    private static void printGameBoard(String[][] gameBoard) {
        for(int i = 0; i < gameBoard.length; i++) {
            System.out.println();
            for (int j = 0; j < gameBoard[i].length; j ++) {
                System.out.print(gameBoard[i][j]);
            }
        }
    }
}
