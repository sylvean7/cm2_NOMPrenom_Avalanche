package avalanche.domains;

import static org.junit.Assert.*;

import org.junit.Test;

public class MountainTests {
	@Test
	public void buildsMountain() {
		Mountain mountain = Mountain.ofDimAndSpeed(
			800,
			new int[] {32,16,8},
			new int[] {5,10,15}
		);
		
		assertNotNull(mountain);
		assertEquals(3, mountain.remainingLinesCount());
	}
	
	@Test
	public void mountainUpRocksFromBottomToTop() {
		Mountain mountain = Mountain.ofDimAndSpeed(
				800,
				new int[] {32,16,8},
				new int[] {5,10,15}
		);
			
		for(int i=0; i < mountain.rocksCountFor(0); ++i) {
			assertTrue(mountain.rock(0,i).top() < mountain.rock(1,i).top());
			assertTrue(mountain.rock(1,i).top() < mountain.rock(2,i).top());
		}
	}
	
	@Test
	public void centersRocksOfTheSameColumns() {
		Mountain mountain = Mountain.ofDimAndSpeed(
				800,
				new int[] {32,16,8},
				new int[] {5,10,15}
		);
			
		for(int i=0; i < mountain.rocksCountFor(0); ++i) {
			assertEquals(mountain.rock(0,i).left()+mountain.rock(1,i).width()/2, mountain.rock(1,i).left(),0.001);
			assertEquals(mountain.rock(1,i).left()+mountain.rock(2,i).width()/2, mountain.rock(2,i).left(),0.001);
		}
	}
	
//	@Test
//	public void makesFallingRocksOfTopRow() {
//		Mountain mountain = Mountain.ofDimAndSpeed(
//				800,
//				new int[] {32,16,8},
//				new int[] {5,10,15}
//		);
//		
//		mountain.fallNext();
//		
//		assertEquals(31, mountain.rocksCountFor(0));
//	}
//	
//	@Test
//	public void makesTheNextRowFall() {
//		Mountain mountain = Mountain.ofDimAndSpeed(
//				800,
//				new int[] {32,16,8},
//				new int[] {5,10,15}
//		);
//		
//		for(int i=0; i < 32; ++i) {
//			mountain.fallNext();
//		}
//		
//		assertEquals(2, mountain.remainingLinesCount());
//	}
//	
//	@Test
//	public void returnsNullWhenNoRocksLeft() {
//		Mountain mountain = Mountain.ofDimAndSpeed(
//				800,
//				new int[] {32,16,8},
//				new int[] {5,10,15}
//		);
//		
//		for(int i=0; i < 96; ++i) {
//			mountain.fallNext();
//		}
//		
//		assertNull(mountain.fallNext());
//		assertNull(mountain.fallNext());
//	}
}
