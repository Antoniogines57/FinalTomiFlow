package testing;

import org.lwjgl.input.Mouse;
import org.newdawn.slick.*;
import org.newdawn.slick.state.*;



public class NewTest extends StateBasedGame{
	
	public static boolean RectObjLocked(int xpos, int ypos, int width, int height) {		// Metodo para comprobar si el MouseLeftClick fue dentro del area especificado
		int posx = Mouse.getX();															// donde xpos, ypos son coordenadas del extremo superior izquerdo del objeto rectangular
		int posy = Mouse.getY();															// width, height son lado respectivos del objeto rectangular
		if (posx <= xpos+width && posx >= xpos && posy >= ypos-height && posy <= ypos) {
			return true;							// Si el click fue en el objeto, return true, sino return false
		}
		return false;
	}
	
	public static final String gameName = "Test game";	// Titulo de la ventana
	public static final int menu = 0;		// Definimos un par de estados para el juego "menu" y "play"
	public static final int play = 1;
	
	public NewTest(String gameName) {
		super(gameName);
		this.addState(new Menu(menu));			// Agregamos los estados
		this.addState(new Play(play));
	}
	
	public void initStatesList(GameContainer gc) throws SlickException {
		this.getState(menu).init(gc, this);		// Inicializamos los estados
		this.getState(play).init(gc, this);		
		this.enterState(menu);					// Estado "menu" por defecto
	}
	
	public static void main(String[] args) {
		AppGameContainer appgc;
		try {
			appgc = new AppGameContainer(new NewTest(gameName));
			appgc.setDisplayMode(640, 360, false);
			appgc.start();
		} catch(SlickException e) {
			e.printStackTrace();
		}
	}

}
