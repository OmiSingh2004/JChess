package dev.os.moves;

public class Piece {
	
	private int currentX, currentY;//in the order of 100, which the is the number of pixels of each square
	private int xMoveAble, yMoveAble;

	public Piece(int defaultX, int defaultY, int xMoveAble, int yMoveAble) {
		this.currentX = defaultX;
		this.currentY = defaultY;
		this.xMoveAble = xMoveAble;
		this.yMoveAble = yMoveAble;
	}
	
	public void moveDirection(int x, int y) {
		//these will only be -1 or +1.
		yMoveAble = Math.abs(yMoveAble);
		xMoveAble = Math.abs(xMoveAble);
		yMoveAble *= y;
		xMoveAble *= x;
	}
	
	public void move() {
		currentX += xMoveAble;
		currentY += yMoveAble;
	}

	public int getCurrentX() {
		return currentX;
	}

	public void setCurrentX(int currentX) {
		this.currentX = currentX;
	}

	public int getCurrentY() {
		return currentY;
	}

	public void setCurrentY(int currentY) {
		this.currentY = currentY;
	}
	
	
}