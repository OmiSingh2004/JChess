package dev.os.gfx;

import java.awt.image.BufferedImage;

public class Assets {
	
	public static BufferedImage BOARD;
	public static BufferedImage BLACK_ROOK, WHITE_ROOK, 
								BLACK_BISHOP, WHITE_BISHOP, WHITE_KING,
								WHITE_QUEEN, BLACK_KING, BLACK_QUEEN,
								BLACK_KNIGHT, WHITE_KNIGHT,WHITE_PAWN, BLACK_PAWN;
	
	public static void init() {
	
		BOARD = ImageLoader.loadImage("/images/Board.jpg");
		BLACK_ROOK = ImageLoader.loadImage("/images/blackRook.png");
		WHITE_ROOK = ImageLoader.loadImage("/images/whiteRook.png");
		BLACK_BISHOP = ImageLoader.loadImage("/images/blackBishop.png");
		WHITE_BISHOP = ImageLoader.loadImage("/images/whiteBishop.png");
		WHITE_KING = ImageLoader.loadImage("/images/whiteKing.png");
		WHITE_QUEEN = ImageLoader.loadImage("/images/whiteQueen.png");
		BLACK_KING = ImageLoader.loadImage("/images/blackKing.png");
		BLACK_QUEEN = ImageLoader.loadImage("/images/blackQueen.png");
		BLACK_KNIGHT = ImageLoader.loadImage("/images/blackKnight.png");
		WHITE_KNIGHT = ImageLoader.loadImage("/images/whiteKnight.png");
		WHITE_PAWN = ImageLoader.loadImage("/images/whitePawn.png");
		BLACK_PAWN = ImageLoader.loadImage("/images/blackPawn.png");
		
		BOARD = SpriteSheet.cropImage(BOARD, 0, 0, 1000, 1000);
	}
	
	

}
