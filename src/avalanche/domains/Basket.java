package avalanche.domains;

public class Basket {
	
	private BoundingBox box;
	private double speed;
	
	public static Basket ofBoxAndSpeed(BoundingBox box, double speed) {
		Basket panier = new Basket();
		panier.box = box;
		panier.speed = speed;
		return panier;
	}
	
	public boolean collidesWith(Rock rock) {
		return box.collideWith(rock.boundingBox());
	}
	
	public void moveLeft() {
		box.moveBy(-speed, 0);
	}
	
	public void moveRight() {
		box.moveBy(speed, 0);
	}
	
	public int left() {
		return box.left();
	}
	
	public int top() {
		return box.top();
	}
	
	public int width() {
		return box.width();
	}
	
	public int height() {
		return box.height();
	}
	
	

}
