import java.util.*;

public class Main {

    static Scanner keyboard = new Scanner(System.in);
    static Random myRandom = new Random();

    static ArrayList<Integer> playerPosition = new ArrayList<>();
    static ArrayList<Integer> computerPosition = new ArrayList<>();

    public static void main(String[] args) {

        String[][] gameBoard = {
                                        {" ", "|", " ", "|", " "},
                                        {"-", "+", "-", "+", "-"},
                                        {" ", "|", " ", "|", " "},
                                        {"-", "+", "-", "+", "-"},
                                        {" ", "|", " ", "|", " "}
                                        };

        while (true) {
            System.out.print("Enter your placement (1-9): ");
            int playerPos  = keyboard.nextInt();
            while (playerPosition.contains(playerPos) || computerPosition.contains(playerPos)) {
                System.out.println("Position taken! Enter a correct Position");
                playerPos = keyboard.nextInt();
            }
            takePosition(gameBoard, playerPos, "player");

            String result = winning();
            result = winning();
            if (result.length() > 0) {
                System.out.println(result);
                break;
            }

            int compPosition = myRandom.nextInt(9) + 1;
            while (playerPosition.contains(compPosition) || computerPosition.contains(compPosition)) {
                compPosition = keyboard.nextInt();
            }
            takePosition(gameBoard, compPosition, "computer");

            printGameBoard(gameBoard);

            result = winning();
            if (result.length() > 0) {
                System.out.println(result);
                break;
            }
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
            playerPosition.add(position);
        } else if (user.equals("computer")) {
            symbol = "O";
            computerPosition.add(position);
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

        List<List> win = new ArrayList<>();
        win.add(rowTop);
        win.add(rowMiddle);
        win.add(rowBottom);

        win.add(columnLeft);
        win.add(columnMiddle);
        win.add(columnRight);

        win.add(crossLeft);
        win.add(crossRight);

        for (List list : win) {
            if (playerPosition.containsAll(list)) {
                return "You win!!!";
            } else if (computerPosition.containsAll(list)) {
                return "You loose!";
            } else if (playerPosition.size() + computerPosition.size() == 9) {
                return "Draw.";
            }
        }

        return "";
    }
}
