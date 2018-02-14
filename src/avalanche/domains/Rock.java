package avalanche.domains;

public class Rock {
	
	private BoundingBox box;
	private double speed;
	
	public static Rock ofBoxAndSpeed(BoundingBox box, double speed) {
		Rock rock = new Rock();
		rock.box = box;
		rock.speed = speed;
		return rock;
	}
	
	public void fall() {
		box.moveBy(0, -speed);
	}
	
	public int width() {
		return box.width();
	}
	
	public int height() {
		return box.height();
	}
	
	public BoundingBox boundingBox() {
		return box;	
	}
	
	public double speed() {
		return speed;
	}
	
	public int left() {
		return box.left();
	}
	
	public int top() {
		return box.top();
	}
	
	public boolean equalsTo(Rock rock) {
		return this.box.equalsTo(rock.box);
	}
}
