package avalanche.domains;

import static org.junit.Assert.*;

import org.junit.Test;

public class BasketTests {
	@Test
	public void collidesWithRock() {
		Rock collidingBox = Rock.ofBoxAndSpeed(BoundingBox.ofPosAndDim(5, 200, 32, 32), 5);
		Rock notCollidingBox = Rock.ofBoxAndSpeed(BoundingBox.ofPosAndDim(5, 100, 32, 32), 5);
		
		Basket basket = Basket.ofBoxAndSpeed(BoundingBox.ofPosAndDim(5, 200, 64, 24), 10);
		
		assertTrue(basket.collidesWith(collidingBox));
		assertFalse(basket.collidesWith(notCollidingBox));
	}
	
	@Test
	public void movesLeft() {
		Basket basket = Basket.ofBoxAndSpeed(BoundingBox.ofPosAndDim(5, 200, 64, 24), 10);
		
		basket.moveLeft();
		
		assertEquals(-37, basket.left());
		assertEquals(212, basket.top());
		assertEquals(64, basket.width());
		assertEquals(24, basket.height());
	}	
	
	@Test
	public void movesRight() {
		Basket basket = Basket.ofBoxAndSpeed(BoundingBox.ofPosAndDim(5, 200, 64, 24), 10);
		
		basket.moveRight();
		
		assertEquals(-17, basket.left());
		assertEquals(212, basket.top());
		assertEquals(64, basket.width());
		assertEquals(24, basket.height());
	}
}
