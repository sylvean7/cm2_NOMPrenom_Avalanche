package avalanche.domains;

import static org.junit.Assert.*;

import org.junit.Test;

public class FallingRockTests {
//	
//	@Test
//	public void isEmptyAtFirst() {
//		FallingRocks rocks = FallingRocks.ofCapacity(32);
//		
//		assertEquals(0, rocks.size());
//	}
//	
//	@Test
//	public void receivesRocks() {
//		FallingRocks rocks = FallingRocks.ofCapacity(32);
//		
//		Rock falling1 = Rock.ofBoxAndSpeed(BoundingBox.ofPosAndDim(5, 200, 32, 32), 5);
//		Rock falling2 = Rock.ofBoxAndSpeed(BoundingBox.ofPosAndDim(5, 100, 32, 32), 5);
//		
//		rocks.receive(falling1);
//		rocks.receive(falling2);
//		
//		assertEquals(2, rocks.size());
//	}
//	
//	@Test
//	public void ignoresNullRocks() {
//		FallingRocks rocks = FallingRocks.ofCapacity(32);
//		
//		Rock falling1 = Rock.ofBoxAndSpeed(BoundingBox.ofPosAndDim(5, 200, 32, 32), 5);
//		Rock falling2 = Rock.ofBoxAndSpeed(BoundingBox.ofPosAndDim(5, 100, 32, 32), 5);
//		
//		rocks.receive(falling1);
//		rocks.receive(falling2);
//		rocks.receive(null);
//		rocks.receive(null);	
//	
//		assertEquals(2, rocks.size());
//	}
//	
//	@Test
//	public void removesRock() {
//		FallingRocks rocks = FallingRocks.ofCapacity(32);
//		
//		Rock falling1 = Rock.ofBoxAndSpeed(BoundingBox.ofPosAndDim(5, 200, 32, 32), 5);
//		Rock falling2 = Rock.ofBoxAndSpeed(BoundingBox.ofPosAndDim(5, 100, 32, 32), 5);
//		
//		rocks.receive(falling1);
//		rocks.receive(falling2);
//		
//		assertEquals(2, rocks.size());
//		
//		rocks.remove(falling2);
//		
//		assertEquals(1, rocks.size());
//	}
//	
//	@Test
//	public void providesWithRocksToIterate() {
//		FallingRocks rocks = FallingRocks.ofCapacity(32);
//		
//		Rock falling1 = Rock.ofBoxAndSpeed(BoundingBox.ofPosAndDim(5, 200, 32, 32), 5);
//		Rock falling2 = Rock.ofBoxAndSpeed(BoundingBox.ofPosAndDim(5, 100, 32, 32), 5);
//		Rock falling3 = Rock.ofBoxAndSpeed(BoundingBox.ofPosAndDim(405, 100, 32, 32), 5);
//		
//		rocks.receive(falling1);
//		rocks.receive(falling2);
//		rocks.receive(falling3);
//		
//		rocks.remove(falling2);
//		
//		Rock[] toIterate = rocks.all();
//		
//		assertEquals(2, toIterate.length);
//		assertTrue(toIterate[0].equalsTo(falling1));
//		assertTrue(toIterate[1].equalsTo(falling3));
//	}
//	
//	@Test
//	public void fallsAllRocks() {
//		FallingRocks rocks = FallingRocks.ofCapacity(32);
//		
//		Rock falling1 = Rock.ofBoxAndSpeed(BoundingBox.ofPosAndDim(5, 200, 32, 32), 1);
//		Rock falling2 = Rock.ofBoxAndSpeed(BoundingBox.ofPosAndDim(5, 100, 32, 32), 2);
//		Rock falling3 = Rock.ofBoxAndSpeed(BoundingBox.ofPosAndDim(405, 100, 32, 32), 3);
//		
//		rocks.receive(falling1);
//		rocks.receive(falling2);
//		rocks.receive(falling3);
//		
//		rocks.fallAll();
//		
//		assertEquals(215, falling1.top(),0.001);
//		assertEquals(114, falling2.top(),0.001);
//		assertEquals(113, falling3.top(),0.001);	
//	}
//	
//	@Test
//	public void doesNotFallRemovedRocks() {
//		FallingRocks rocks = FallingRocks.ofCapacity(32);
//		
//		Rock falling1 = Rock.ofBoxAndSpeed(BoundingBox.ofPosAndDim(5, 200, 32, 32), 1);
//		Rock falling2 = Rock.ofBoxAndSpeed(BoundingBox.ofPosAndDim(5, 100, 32, 32), 2);
//		Rock falling3 = Rock.ofBoxAndSpeed(BoundingBox.ofPosAndDim(405, 100, 32, 32), 3);
//		
//		rocks.receive(falling1);
//		rocks.receive(falling2);
//		rocks.receive(falling3);
//		
//		rocks.remove(falling1);
//		rocks.remove(falling3);
//		
//		rocks.fallAll();
//		
//		assertEquals(216, falling1.top(),0.001);
//		assertEquals(114, falling2.top(),0.001);
//		assertEquals(116, falling3.top(),0.001);
//	}
	
}
