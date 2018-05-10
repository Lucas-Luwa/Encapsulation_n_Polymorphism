package _03_polymorphs;

import java.awt.Color;
import java.awt.Graphics;

public class CircleMorph extends Polymorph {
double theta = 0;

	CircleMorph(int x, int y, int width, int height) {
		super(x, y, width, height);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void draw(Graphics g) {
		// TODO Auto-generated method stub
		g.setColor(Color.BLACK);
		g.fillRect(getx(), gety(), getwidth(), getheight());
	}

	public void update() {
		setx(getx() + 20*cos(theta));
		sety();
		double newtheta = theta + 10;

	}

	private double sin(double i) {
		// TODO Auto-generated method stub
		double j = Math.toRadians(i);
		return Math.sin(j);
	}

	private double cos(double x) {
		// TODO Auto-generated method stub
		double j = Math.toRadians(x);
		return Math.cos(j);
	}

}
