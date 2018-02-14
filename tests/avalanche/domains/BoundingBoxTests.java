package avalanche.domains;

import static org.junit.Assert.*;

import org.junit.Test;

public class BoundingBoxTests {
	@Test
	public void collidesWithItSelf() {
		BoundingBox box = BoundingBox.ofPosAndDim(5,5,5,5);
		
		assertTrue(box.collideWith(box));
	}
	
	@Test
	public void tellsAboutItPosition() {
		BoundingBox box = BoundingBox.ofPosAndDim(4,3,10,20);
		
		assertEquals(4, box.x());
		assertEquals(3, box.y());
	}
	
	@Test
	public void tellsAboutTopBottomLeftAndRight() {
		BoundingBox box = BoundingBox.ofPosAndDim(0,0,10,20);
		
		assertEquals(-5, box.left());
		assertEquals(5, box.right());
		assertEquals(-10, box.bottom());
		assertEquals(10, box.top());
	}

	@Test
	public void tellsAboutWidth() {
		BoundingBox box = BoundingBox.ofPosAndDim(5,5,4,2);
		BoundingBox samePos = BoundingBox.ofPosAndDim(5,5,20,30);
		BoundingBox sameDim = BoundingBox.ofPosAndDim(0,0,4,2);

		assertEquals(4, box.width());
		assertEquals(20, samePos.width());
		assertEquals(4, sameDim.width());
	}

	@Test
	public void tellsAboutHeight() {
		BoundingBox box = BoundingBox.ofPosAndDim(5,5,4,2);
		BoundingBox samePos = BoundingBox.ofPosAndDim(5,5,20,30);
		BoundingBox sameDim = BoundingBox.ofPosAndDim(0,0,4,2);

		assertEquals(2, box.height());
		assertEquals(30, samePos.height());
		assertEquals(2, sameDim.height());
	}
	
	@Test
	public void movesFollowingADirection() {
		BoundingBox box = BoundingBox.ofPosAndDim(0,0,10,20);
		
		box.moveBy(1, 0);
		
		assertEquals(1, box.x());
		assertEquals(0, box.y());
		
		assertEquals(-4, box.left());
		assertEquals(6, box.right());
		assertEquals(-10, box.bottom());
		assertEquals(10, box.top());
	}
	
	@Test
	public void doesNotCollideWithABoxTooFarFromIt() {
		BoundingBox box = BoundingBox.ofPosAndDim(4,4,2,2);
		BoundingBox boxBelow = BoundingBox.ofPosAndDim(4,0,2,2);
		BoundingBox boxAbove = BoundingBox.ofPosAndDim(5,10,5,5);
		
		assertFalse(box.collideWith(boxBelow));
		assertFalse(box.collideWith(boxAbove));
	}
	
	@Test
	public void collidesWithABoxByTheLeft() {
		BoundingBox box = BoundingBox.ofPosAndDim(2,0,4,4);
		BoundingBox boxOnTheLeft = BoundingBox.ofPosAndDim(-2,0,4,4);
		
		assertTrue(box.collideWith(boxOnTheLeft));
	}
	
	@Test
	public void collidesWithABoxByTheRight() {
		BoundingBox box = BoundingBox.ofPosAndDim(5,5,5,5);
		BoundingBox boxOnTheRight = BoundingBox.ofPosAndDim(7,5,4,4);
		
		assertTrue(box.collideWith(boxOnTheRight));
	}
	
	@Test
	public void collidesWithABoxByTheTop() {
		BoundingBox box = BoundingBox.ofPosAndDim(5,5,5,5);
		BoundingBox boxOnTheTop = BoundingBox.ofPosAndDim(5,7,3,3);
		
		assertTrue(box.collideWith(boxOnTheTop));
	}
	
	@Test
	public void collidesWithABoxByTheBottom() {
		BoundingBox box = BoundingBox.ofPosAndDim(5,5,5,5);
		BoundingBox boxOnTheTop = BoundingBox.ofPosAndDim(5,4,1,1);
		
		assertTrue(box.collideWith(boxOnTheTop));
	}

	@Test
	public void areEqualsBasedOnPositionsAndDimensions() {
		BoundingBox box = BoundingBox.ofPosAndDim(5,5,4,2);
		BoundingBox clone = BoundingBox.ofPosAndDim(5,5,4,2);
		BoundingBox samePos = BoundingBox.ofPosAndDim(5,5,20,30);
		BoundingBox sameDim = BoundingBox.ofPosAndDim(0,0,4,2);

		assertTrue(box.equalsTo(clone));
		assertTrue(clone.equalsTo(box));
		assertFalse(box.equalsTo(samePos));
		assertFalse(samePos.equalsTo(box));

		assertFalse(clone.equalsTo(samePos));
		assertFalse(clone.equalsTo(sameDim));

		assertFalse(sameDim.equalsTo(samePos));
	}

}
