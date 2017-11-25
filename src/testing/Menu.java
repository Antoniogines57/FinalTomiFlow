package testing;

import org.newdawn.slick.*;
import org.newdawn.slick.state.*;

public class Menu extends BasicGameState{
	public Menu(int state){
	}
	
	public void init(GameContainer gc, StateBasedGame sbg) throws SlickException{
	}
	
	public void render(GameContainer gc, StateBasedGame sbg, Graphics g) throws SlickException{
		g.drawString("Comenzar juego!", 240, 100);
		Image startbutton = new Image("res/startgame.jpg");
		g.drawImage(startbutton, 247, 150);
	}
	
	public void update(GameContainer gc, StateBasedGame sbg, int delta) throws SlickException{
	}
	
	public int getID(){
		return 0;
	}
}
