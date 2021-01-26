package dev.os.gfx;

import java.awt.Canvas;
import java.awt.Dimension;

import javax.swing.JFrame;

public class Display {
	
	private String title;
	private JFrame frame;
	private Canvas canvas;
	private Dimension size;
	
	public Display(String title, int width, int height) {
		this.title = title;
		this.size = new Dimension(width,height);
		setupDisplay();
		
	}
	
	private void setupDisplay() {
		frame= new JFrame(title);
		frame.setSize(size);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setResizable(false);
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);
		canvas = new Canvas();
		canvas.setPreferredSize(new Dimension(size));
		canvas.setMaximumSize(new Dimension(size));
		canvas.setMinimumSize(new Dimension(size));
		canvas.setFocusable(true);
		frame.add(canvas);
		frame.pack();
		
	}
	
	public JFrame getFrame() {
		return frame;
	}
	public void setFrame(JFrame frame) {
		this.frame = frame;
	}
	public Canvas getCanvas() {
		return canvas;
	}
	public void setCanvas(Canvas canvas) {
		this.canvas = canvas;
	}

	public Dimension getSize(){
		return this.size;
	}
	
}
