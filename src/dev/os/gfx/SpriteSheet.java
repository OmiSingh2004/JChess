package dev.os.gfx;

import java.awt.image.BufferedImage;

public class SpriteSheet {

	private BufferedImage sheet;
	
	public BufferedImage getSheet() {
		return sheet;
	}


	public SpriteSheet(BufferedImage sheet) {
		this.sheet = sheet;
	}
	
	public static BufferedImage cropImage(BufferedImage image, int x, int y, int width, int height) {
		return image.getSubimage(x, y, width, height);
	}

	public BufferedImage crop(int x, int y, int width, int height) {
		return sheet.getSubimage(x, y ,width ,height);
	}
}
