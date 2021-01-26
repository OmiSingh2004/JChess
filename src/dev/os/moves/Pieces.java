package dev.os.moves;
public class Pieces {
	
	private Piece BLACK_ROOK, WHITE_ROOK,
	BLACK_BISHOP, WHITE_BISHOP, WHITE_KING,
	WHITE_QUEEN, BLACK_KING, BLACK_QUEEN,
	BLACK_KNIGHT, WHITE_KNIGHT,WHITE_PAWN, BLACK_PAWN;
	
	public Pieces() {
		//initialize each fucking piece
		int startX = 25, startY = 25;
		for(int i = 0; i <= 700; i+=100) {
			Piece piece = new Piece(startX + i, startY, 100, 100);
		}
	}
}