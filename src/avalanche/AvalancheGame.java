package avalanche;

import org.lwjgl.input.Keyboard;
import org.newdawn.slick.*;

import avalanche.domains.*; //Importe toutes les classes du paquetage avalanche.domains.

/**
 * Cette classe contrôle tous les objets modélisant le jeu ainsi
 * que ceux permettant de récupérer les entrées et de dessiner à l'écran.
 * 
 * @author Nicolas Hendrikx
 * */
public class AvalancheGame extends BasicGame {	
//	BoundingBox box;
//	Rock rock;
	Mountain mountain;
	Basket panier;

	
	//Ne pas supprimer ce constructeur sous peine d'erreur de compilation
	public AvalancheGame() {
		super("Helmo - Avalanche"); //Initialise la partie propre à BasicGame
	}

	/**
	 * Méthode appelée avant d'entrer dans le cycle update-render afin d'intialiser
	 * les éléments du jeu.
	 * 
	 * @param gc la fenêtre contenant le jeu
	 * */
	@Override
	public void init(GameContainer gc) throws SlickException {
//		rock = Rock.ofBoxAndSpeed(box = BoundingBox.ofPosAndDim(gc.getWidth()/2, gc.getHeight() - 15, 30, 30), 5);
		mountain = Mountain.ofDimAndSpeed(gc.getHeight()-56, new int[] {32,16,8}, new int[] {5,10,15});
		panier = Basket.ofBoxAndSpeed(BoundingBox.ofPosAndDim(gc.getWidth() / 2, gc.getHeight() - 80, 150, 30), 20);
		
	}

	/**
	 * Méthode appelée avant pour mettre à jour l'état du jeu.
	 * 
	 * @param gc la fenêtre contenant le jeu
	 * @param timeElaspedFromPreviousFrameInMillis
	 * */
	@Override
	public void update(GameContainer gc, int timeElaspedFromPreviousFrameInMillis) throws SlickException {
		Input input = gc.getInput(); 
		if (input.isKeyDown(Input.KEY_LEFT)) {
			panier.moveLeft();
		} else if (input.isKeyDown(Input.KEY_RIGHT)) {
			panier.moveRight();
		} else if (input.isKeyDown(Input.KEY_ESCAPE)) {
			gc.exit();
		}
	}
	
	

	/**
	 * Méthode appelée pour dessiner le jeu à l'écran.
	 * 
	 * @param gc la fenêtre contenant le jeu
	 * @param painter un objet proposant des méthodes élémentaires de dessin
	 * */
	@Override
	public void render(GameContainer gc, Graphics painter) throws SlickException {
		//Voici comment dessiner un texte
		painter.drawString("AVALANCHE!", 10, 30);
		
		painter.setColor(Color.green);
		for (int i = 0 ; i < mountain.remainingLinesCount() ; i++) {
			for (int j = 0; j < mountain.rocksCountFor(i); j++) {
				Rock rock = mountain.rock(i,j);
				painter.fillRect(rock.left(), gc.getHeight() - rock.top(), rock.width(), rock.height());
			}
		}
		
		painter.setColor(Color.pink);
		painter.fillRect(panier.left(), panier.top(), 150, 16);
		
	}
	
}