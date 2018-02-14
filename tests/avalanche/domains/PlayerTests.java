package avalanche.domains;

import static org.junit.Assert.*;

import org.junit.Test;

public class PlayerTests {
//	@Test
//	public void movesLeft() {
//		Basket b = Basket.ofBoxAndSpeed(BoundingBox.ofPosAndDim(20, 132, 64, 24), 5);
//		Player player = Player.withBasket(b);
//		player.moveLeft();
//		
//		assertEquals(-17, b.left());
//		assertEquals(144, b.top());
//	}
//	
//	@Test
//	public void movesRight() {
//		Basket b = Basket.ofBoxAndSpeed(BoundingBox.ofPosAndDim(20, 132, 64, 24), 5);
//		Player player = Player.withBasket(b);
//		player.moveRight();
//		
//		assertEquals(-7, b.left());
//		assertEquals(144, b.top());
//	}
//	
//	@Test
//	public void collidesUpdatesScore() {
//		Basket b = Basket.ofBoxAndSpeed(BoundingBox.ofPosAndDim(20, 132, 64, 24), 5);
//		Player player = Player.withBasket(b);
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
//		player.handle(rocks);
//		
//		assertEquals(3, player.score());
//	}
//	
//	@Test
//	public void collidesRemovesRocks() {
//		Basket b = Basket.ofBoxAndSpeed(BoundingBox.ofPosAndDim(20, 132, 64, 24), 5);
//		Player player = Player.withBasket(b);
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
//		player.handle(rocks);
//		
//		assertEquals(2, rocks.size());
//	}
//	
//	@Test
//	public void collidesUpdateHitCount() {
//		Basket b = Basket.ofBoxAndSpeed(BoundingBox.ofPosAndDim(20, 132, 64, 24), 5);
//		Player player = Player.withBasket(b);
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
//		player.handle(rocks);
//		
//		assertEquals(1, player.hitCount());
//	}
}
