package avalanche.domains;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class GroundTests {
//	@Test
//	public void providesPositionAndDimension() {
//		Ground g = Ground.ofBox(BoundingBox.ofPosAndDim(20, 132, 64, 24));
//		
//		assertEquals(144, g.top());
//		assertEquals(-12, g.left());
//		assertEquals(64, g.width());
//		assertEquals(24, g.height());
//	}
//	
//	@Test
//	public void collidesRemovesRocks() {
//		Ground g = Ground.ofBox(BoundingBox.ofPosAndDim(20, 132, 64, 24));
//		
//		FallingRocks rocks = FallingRocks.ofCapacity(32);
//		
//		Rock falling1 = Rock.ofBoxAndSpeed(BoundingBox.ofPosAndDim(5, 200, 32, 32), 1);
//		Rock falling2 = Rock.ofBoxAndSpeed(BoundingBox.ofPosAndDim(5, 100, 32, 32), 2);
//		Rock falling3 = Rock.ofBoxAndSpeed(BoundingBox.ofPosAndDim(20, 132, 64, 24), 3);
//		
//		rocks.receive(falling1);
//		rocks.receive(falling2);
//		rocks.receive(falling3);
//		
//		g.handle(rocks);
//		
//		assertEquals(2, rocks.size());
//	}
//	
//	@Test
//	public void collidesUpdatesHitCount() {
//		Ground g = Ground.ofBox(BoundingBox.ofPosAndDim(20, 132, 64, 24));
//		
//		FallingRocks rocks = FallingRocks.ofCapacity(32);
//		
//		Rock falling1 = Rock.ofBoxAndSpeed(BoundingBox.ofPosAndDim(5, 200, 32, 32), 1);
//		Rock falling2 = Rock.ofBoxAndSpeed(BoundingBox.ofPosAndDim(5, 100, 32, 32), 2);
//		Rock falling3 = Rock.ofBoxAndSpeed(BoundingBox.ofPosAndDim(20, 132, 64, 24), 3);
//		
//		rocks.receive(falling1);
//		rocks.receive(falling2);
//		rocks.receive(falling3);
//		
//		g.handle(rocks);
//		
//		assertEquals(1, g.hitCount());
//	}
}
