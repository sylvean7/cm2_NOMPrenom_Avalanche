package avalanche;

import org.newdawn.slick.AppGameContainer;
import org.newdawn.slick.SlickException;

/**
 * Cette crée le container du jeu et lance son exécution.
 * 
 * @author Nicolas Hendrikx
 * */
public class Launcher {
	public static void main(String[] args) {
		try {			
			AppGameContainer appgc;
			appgc = new AppGameContainer(new AvalancheGame());
			appgc.setDisplayMode(800, 600, false); //mettre true pour passer en mode plein écran
			appgc.setTargetFrameRate(30); 	//fixe le nombre ciblé de frames par seconde à 30fps
			appgc.start();  				//démarre le jeu
		} catch (SlickException ex) {
			System.err.println("Exception attrapée : "+ex.getMessage());
			ex.printStackTrace(System.err);
		}
	}
}
