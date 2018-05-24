package _03_polymorphs;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.IOException;

import javax.imageio.ImageIO;

public class ImageMorph extends Polymorph {

	static BufferedImage buffer;

	ImageMorph(int x, int y, int width, int height) {
		super(x, y, width, height);

		try {
			buffer = ImageIO.read(this.getClass().getResourceAsStream("monsta.jpg"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public void draw(Graphics g) {
		// TODO Auto-generated method stub
		g.setColor(Color.MAGENTA);
		g.fillRect(getx(), gety(), getwidth(), getheight());
		g.drawImage(buffer, 400, 400, 50, 50, null);
	}

}
