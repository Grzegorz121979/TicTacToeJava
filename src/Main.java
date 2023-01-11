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
        for (String[] row : gameBoard) {
            for(String column : row) {
                System.out.print(column);
            }
            System.out.println();
        }
    }
}
