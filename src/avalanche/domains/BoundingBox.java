package avalanche.domains;

import javax.swing.Box;

public class BoundingBox {
	
	private int x,y;
	private int width, height;

	public static BoundingBox ofPosAndDim(int x, int y, int width, int height) {
		BoundingBox box = new BoundingBox();
		box.x = x;
		box.y = y;
		box.width = width;
		box.height = height;
		return box;
	}

	public boolean collideWith(BoundingBox box) {
		return this.left() <= box.right() && this.right() >= box.left() && this.bottom() <= box.top() && this.top() >= box.bottom(); 

	}

	public int x() {
		return x;
	}

	public int y() {
		return y;
	}

	public int right() {
		return x + width / 2;
	}

	public int left() {
		return x - width / 2;
	}

	public int bottom() {
		return y - height / 2;
		
	}

	public int top() {
		return y + height / 2;
	}

	public int width() {
		return width;
	}

	public int height() {
		return height;
	}

	public void moveBy(double dx, double dy) {
		x += dx;
		y += dy;
	}

	public boolean equalsTo(BoundingBox clone) {
		return this.x == clone.x && this.y == clone.y && this.width == clone.width && this.height == clone.height;
	}

}
