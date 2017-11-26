package estados;

import org.newdawn.slick.GameContainer;
import org.newdawn.slick.SlickException;
import org.newdawn.slick.state.StateBasedGame;
import org.newdawn.slick.*;
import estados.Imagen;
import estados.Juego;


public class Estados extends StateBasedGame {
	public static final int imagen = 0;		// Definimos un par de estados para el juego "menu" y "play"
	public static final int juego = 1;
	private AppGameContainer contenedor;
	public Estados()throws SlickException {
		super("TomiFlow");
		contenedor= new AppGameContainer(this);
		contenedor.setDisplayMode(640,640,false);
		contenedor.setShowFPS(false);
		contenedor.start();
		this.addState(new Imagen(imagen));			// Agregamos los estados
		this.addState(new Juego(juego));
	}
/**
 * Inicializa la lista de los estados del juego
 */

	@Override
	public void initStatesList(GameContainer container) throws SlickException {
		this.addState(new Imagen(imagen));			// Agregamos los estados
		this.addState(new Juego(juego));
		this.enterState(imagen);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
		 new Estados();
		 
		} catch(SlickException slick) {
			slick.printStackTrace();
			System.exit(1);
		}
	}

}
