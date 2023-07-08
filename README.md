# ChessSetup
Simple chess board setup from chess fen code

Constants are defined for the board size, row labels, column labels, and empty square character.
An instance variable board is declared, which represents the chess board as a 2-dimensional array of characters.

The constructor of the ChessGame class initializes the board array by setting all squares to the empty square character.
The setupBoard method takes a setupCode parameter, which represents the initial configuration of the chess board. It parses the setup code and updates the board array accordingly.
The printBoard method prints the current state of the chess board to the console, including row labels, column labels, and the pieces on the board.

The main method serves as the entry point of the program. It creates an instance of the ChessGame class, prompts the user to enter a setup code, calls the setupBoard method to set up the board based on the input, and then calls the printBoard method to display the initial board state.
