package testing;

import org.lwjgl.input.Mouse;
import org.newdawn.slick.*;
import org.newdawn.slick.state.*;

public class Menu extends BasicGameState{
	
	public String mousePosX = "";		// Definimos Strings que van a contener posiciones del Mouse
	public String mousePosY = "";
	public Menu(int state){
	}
	
	public void init(GameContainer gc, StateBasedGame sbg) throws SlickException{
	}
	
	public void render(GameContainer gc, StateBasedGame sbg, Graphics g) throws SlickException{
		g.drawString("Comenzar juego!", 240, 140);		// Texto simple
		Image startbutton = new Image("res/startgame.jpg");	// Imagen a la que hay que clickear para cambiar de GameState
		g.drawImage(startbutton, 247, 190);		// Dibujamos la imagen
		g.drawString(mousePosX, 30, 40);		// Dibujamos una par de Strings con las posiciones del Mouse (para orientar mejor los objetos a la hora de programar)
		g.drawString(mousePosY, 30, 60);
	}
	
	public void update(GameContainer gc, StateBasedGame sbg, int delta) throws SlickException{
		Input input = gc.getInput();		// Leemos las entradas del jugador
		int xpos = Mouse.getX();			// Leemos las posiciones del Mouse
		int ypos = Mouse.getY();
		mousePosX = "Mouse Position X: " + xpos;	// Modificamos los Strings con las posiciones del Mouse
		mousePosY = "Mouse Position Y: " + ypos;
		if (input.isMouseButtonDown(0) && NewTest.RectObjLocked(250, 170, 115, 30)) sbg.enterState(1);	// Si el boton del Mouse esta pulsado y esta encima de la imagen - cambia al estado 1(play)
	}
	
	public int getID(){
		return 0;
	}
}
