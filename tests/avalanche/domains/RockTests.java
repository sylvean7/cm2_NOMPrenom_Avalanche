package avalanche.domains;

import static org.junit.Assert.*;

import org.junit.Test;

public class RockTests {
	@Test
	public void buildsRocks() {
		BoundingBox bb = BoundingBox.ofPosAndDim(0,20,4,6);
		double speed = 5;
		
		// quand on créé une roche
		Rock r = Rock.ofBoxAndSpeed(bb, 5);
		
		//alors la roche est défini
		assertNotNull(r);
		
		//et quand j'appelle plusieurs fois
		Rock another = Rock.ofBoxAndSpeed(bb, speed);
		
		//alors chaque appel retourne un nouvel objet
		assertNotNull(another);
		assertNotSame(r, another); // assertNotSame vérifie que les objets 
								   // occupent deux adresses distinctes en mémoire
	}
	
	@Test
	public void falls() {
		Rock r = Rock.ofBoxAndSpeed(BoundingBox.ofPosAndDim(0,20,4,6), 5);
		
		//quand la roche tombe
		r.fall();
		
		//alors la position y a diminué de 5
		assertEquals(18, r.top());//20+3-5
		
		//et les autres propriétés ne changent pas
		assertEquals(-2, r.left());
		assertEquals(4, r.width());
		assertEquals(6, r.height());
	}
	
	@Test
	public void knowsHisSpeed() {
		Rock r = Rock.ofBoxAndSpeed(BoundingBox.ofPosAndDim(0,20,4,6), 5);
		
		assertEquals(5.0, r.speed(), 0.001);
	}
	
	@Test
	public void clonesHisBoundingBox() {
		BoundingBox toBeCloned = BoundingBox.ofPosAndDim(0,20,4,6);
		Rock r = Rock.ofBoxAndSpeed(toBeCloned, 5);
		
		//quand je demande la boundingBox du rocher
		BoundingBox clone = r.boundingBox();
		
		//mais le résultat possède les mêmes caractéristiques que l'original
		assertTrue(toBeCloned.equalsTo(clone));
	}
	
	@Test
	public void areEqualsBasedOnBox() {
		Rock box = Rock.ofBoxAndSpeed(BoundingBox.ofPosAndDim(5, 200, 32, 32), 1);
		Rock clone = Rock.ofBoxAndSpeed(BoundingBox.ofPosAndDim(5, 200, 32, 32), 2);
		Rock another = Rock.ofBoxAndSpeed(BoundingBox.ofPosAndDim(405, 100, 32, 32), 3);

		assertTrue(box.equalsTo(clone));
		assertTrue(clone.equalsTo(box));
		assertFalse(box.equalsTo(another));
		assertFalse(another.equalsTo(box));
		assertFalse(clone.equalsTo(another));
		assertTrue(box.equalsTo(box));
	}
}
