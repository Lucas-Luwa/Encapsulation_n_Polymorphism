package _03_polymorphs;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.Timer;

public class PolymorphWindow extends JPanel implements ActionListener {
	public static final int WIDTH = 900;
	public static final int HEIGHT = 600;
	ArrayList<Polymorph> arraypoly = new ArrayList<Polymorph>();

	private JFrame window;
	private Timer timer;

	public static void main(String[] args) {
		new PolymorphWindow().buildWindow();

	}

	public void buildWindow() {
		window = new JFrame("IT'S MORPHIN' TIME!");
		window.add(this);
		window.getContentPane().setPreferredSize(new Dimension(500, 500));
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.pack();
		window.setVisible(true);
		timer = new Timer(1000 / 30, this);
		arraypoly.add(new MovingMorph(10, 10, 20, 20));

		arraypoly.add(new BluePolymorph(5, 80, 10, 10));
		arraypoly.add(new RedMorph(80, 90, 10, 10));
		arraypoly.add(new CircleMorph(200, 200, 10, 10));
		MouseMorph mos = new MouseMorph(400, 200, 10, 10);
		window.addMouseMotionListener(mos);
		arraypoly.add(mos);
		arraypoly.add(new ImageMorph(400, 400, 50, 50));
		DialogMorph dm = new DialogMorph(300,300,20,20);
		window.addMouseListener(dm);
		arraypoly.add(dm);

		timer.start();
	}

	public void paintComponent(Graphics g) {
		// draw background
		g.setColor(Color.LIGHT_GRAY);
		g.fillRect(0, 0, 500, 500);
		for (Polymorph object : arraypoly) {
			object.draw(g);
		}

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		repaint();
		for (Polymorph object : arraypoly) {
			object.update();

		}
	}
}
