import java.util.Scanner;

public class ChessGame {
    private static final int BOARD_SIZE = 8;
    private static final char[] ROW_LABELS = {'8', '7', '6', '5', '4', '3', '2', '1'};
    private static final char[] COL_LABELS = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h'};
    private static final char EMPTY_SQUARE = '.';

    private char[][] board;

    public ChessGame() {
        this.board = new char[BOARD_SIZE][BOARD_SIZE];
        for (int row = 0; row < BOARD_SIZE; row++) {
            for (int col = 0; col < BOARD_SIZE; col++) {
                this.board[row][col] = EMPTY_SQUARE;
            }
        }
    }

    public void setupBoard(String setupCode) {
        String[] rows = setupCode.split("/");
        for (int row = 0; row < BOARD_SIZE; row++) {
            String rowString = rows[BOARD_SIZE - row - 1];
            int col = 0;
            for (int i = 0; i < rowString.length(); i++) {
                char c = rowString.charAt(i);
                if (c >= '1' && c <= '8') {
                    int numEmptySquares = c - '0';
                    for (int j = 0; j < numEmptySquares; j++) {
                        this.board[row][col] = EMPTY_SQUARE;
                        col++;
                    }
                } else {
                    this.board[row][col] = c;
                    col++;
                }
            }
        }
    }

    public void printBoard() {
        System.out.print("  ");
        for (char colLabel : COL_LABELS) {
            System.out.print(colLabel + " ");
        }
        System.out.println();
        for (int row = 0; row < BOARD_SIZE; row++) {
            System.out.print(ROW_LABELS[BOARD_SIZE - row - 1] + " ");
            for (int col = 0; col < BOARD_SIZE; col++) {
                System.out.print(this.board[row][col] + " ");
            }
            System.out.println(ROW_LABELS[BOARD_SIZE - row - 1]);
        }
        System.out.print("  ");
        for (char colLabel : COL_LABELS) {
            System.out.print(colLabel + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ChessGame game = new ChessGame();
        System.out.print("Enter setup code: ");
        String setupCode = scanner.nextLine();
        game.setupBoard(setupCode);
        game.printBoard();
    }
}
