package testing;

import org.lwjgl.input.Mouse;
import org.newdawn.slick.*;
import org.newdawn.slick.state.*;

public class Menu extends BasicGameState{
	
	public String mousePosX = "";
	public String mousePosY = "";
	public Menu(int state){
	}
	
	public void init(GameContainer gc, StateBasedGame sbg) throws SlickException{
	}
	
	public void render(GameContainer gc, StateBasedGame sbg, Graphics g) throws SlickException{
		g.drawString("Comenzar juego!", 240, 140);
		Image startbutton = new Image("res/startgame.jpg");
		g.drawImage(startbutton, 247, 190);
		g.drawString(mousePosX, 30, 40);
		g.drawString(mousePosY, 30, 60);
	}
	
	public void update(GameContainer gc, StateBasedGame sbg, int delta) throws SlickException{
		int xpos = Mouse.getX();
		int ypos = Mouse.getY();
		mousePosX = "Mouse Position X: " + xpos;
		mousePosY = "Mouse Position Y: " + ypos;
	}
	
	public int getID(){
		return 0;
	}
}
