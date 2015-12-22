public class ChessTwo {

	public static int evaluatePieceValues(String[][] board) {
		//piece point values
		int pawn = 1;
		int knight = 3;
		int bishop = 3;
		int rook = 5;
		int queen = 9;
		int whitePawnCounter = 0;
		int whiteKnightCounter = 0;
		int whiteBishopCounter = 0;
		int whiteRookCounter = 0;
		int whiteQueenCounter = 0;
				//black piece evals
		int blackPawnCounter = 0;
		int blackKnightCounter = 0;
		int blackBishopCounter = 0;
		int blackRookCounter = 0;
		int blackQueenCounter = 0;

		for (int row = 0; row <board.length; row++) {
			for (int col = 0; col<board[row].length; col++ ) {
				System.out.println(board[row][col]);
				if (board[row][col].equals("WP")) {
					whitePawnCounter++;
					
				}
				else if (board[row][col].equals("BP")) {
					blackPawnCounter++;
					
				}

				else if (board[row][col].equals("WK")) {
					whiteKnightCounter++;
					
				}
				else if (board[row][col].equals("BK")) {
					blackKnightCounter++;
					
				}
				else if (board[row][col].equals("WB")) {
					whiteBishopCounter++;
					
				}
				else if (board[row][col].equals("BB")) {
					blackBishopCounter++;
				
				}
				else if (board[row][col].equals("BR")) {
					blackRookCounter++;
					
				}
				else if (board[row][col].equals("WR")) {
					whiteRookCounter++;
					
				}
				else if (board[row][col].equals("BQ")) {
					blackQueenCounter++;
					
				}
				else if (board[row][col].equals("WQ")) {
					whiteQueenCounter++;
					
				}			
			}
		}

		int whitePawnScore = whitePawnCounter * pawn;
		int whiteKnightScore = whiteKnightCounter * knight;
		int whiteBishopScore = whiteBishopCounter * bishop;
		int whiteRookScore = whiteRookCounter * rook;
		int whiteQueenScore = whiteQueenCounter * queen;
	
		int blackPawnScore = blackPawnCounter * pawn;
		int blackKnightScore = blackKnightCounter * knight;
		int blackBishopScore = blackBishopCounter * bishop;
		int blackRookScore = blackRookCounter * rook;
		int blackQueenScore = blackQueenCounter * queen;   
		int whiteTotal = whitePawnScore + whiteRookScore + whiteBishopScore + whiteKnightScore + whiteQueenScore;
		int blackTotal = blackPawnScore + blackRookScore + blackBishopScore + blackKnightScore + blackQueenScore;
		System.out.println(whiteTotal);
		System.out.println(blackTotal);
		int pointEval = whiteTotal - blackTotal;
		return pointEval;
	}  

	//public static int evaluateCenterInfluences(String[][] board) {
		//for (int row = 0; row<board.length; row++ ) {
			//for (int col = 0; col<board[row].length; col++) {
				//if (board[3][4]. .equals() {
					
				//}
			//}
		//}

//}

	//public static int evaluateBoard(String[][] board) {


	//}


	public static void main(String[] args) {
		String[][] boardState = {
		{"WK", "WP", "WP"},
		{"BB", "BP", "BQ"}
	};
		int result = evaluatePieceValues(boardState);
		System.out.println("point eval " + result);
	}
}

