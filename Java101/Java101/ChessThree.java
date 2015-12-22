public class ChessThree {

	public static int evaluatePieceValues(String[][] board) {
		//piece point values
		int pawn = 1;
		int knight = 3;
		int bishop = 3;
		int rook = 5;
		int queen = 9;
		int whiteCounter = 0;
		//String pieceExist = ("WP" || "BP" || "WK" || "BK" || "WB" || "BB" || "BR" || "WR" || "WQ" || "BQ");
		for (int row = 0; row <board.length; row++) {
			for (int col = 0; col<board[row].length; col++ ) {
				if (board[row][col].equals("WP")) {
					whiteCounter+=1;
					
				}
				else if (board[row][col].equals("BP")) {
					whiteCounter-=1;
					
				}

				else if (board[row][col].equals("WK")) {
					whiteCounter+=3;
					
				}
				else if (board[row][col].equals("BK")) {
				whiteCounter-=3;
					
				}
				else if (board[row][col].equals("WB")) {
					whiteCounter+=3;
					
				}
				else if (board[row][col].equals("BB")) {
					whiteCounter-=3;
				
				}
				else if (board[row][col].equals("BR")) {
					whiteCounter-=5;
					
				}
				else if (board[row][col].equals("WR")) {
					whiteCounter+=5;
					
				}
				else if (board[row][col].equals("BQ")) {
					whiteCounter-=9;
					
				}
				else if (board[row][col].equals("WQ")) {
					whiteCounter+=9;
					
				}			
			}
		}
		int pointEval = whiteCounter;
		return pointEval;
	}  

	//public static int evaluateCenterInfluences(String[][] board) {
		//for (int row = 0; row<board.length; row++ ) {
			//for (int col = 0; col<board[row].length; col++) {
				//if (board[row][col].equals() {
					
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

