package _03_polymorphs;

import java.awt.Graphics;

public abstract class Polymorph {
	private int x;
	private int y;
	private int width;
	private int height;

	Polymorph(int x, int y, int width, int height) {
		this.x = x;
		this.y = y;
		this.width = width;
		this.height = height;
	}

	public int getx() {
		return x;
	}

	public void setx(int x) {
		this.x = x;
	}

	public int gety() {
		return y;
	}

	public void sety(int y) {
		this.y = y;
	}

	public void update() {

	}

	public int getwidth() {
		return width;
	}

	public void setwidth(int width) {
		this.width = width;
	}

	public int getheight() {
		return height;
	}

	public void setheight(int height) {
		this.height = height;
	}

	public abstract void draw(Graphics g);
}
