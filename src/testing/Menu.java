package testing;

import org.newdawn.slick.*;
import org.newdawn.slick.state.*;

public class Menu extends BasicGameState{
	public Menu(int state){
	}
	
	public void init(GameContainer gc, StateBasedGame sbg) throws SlickException{
	}
	
	public void render(GameContainer gc, StateBasedGame sbg, Graphics g) throws SlickException{
		g.drawString("Comenzar juego!", 100, 100);
		g.drawRect(100, 115, 60, 120);		// x, y, width, height
		g.drawOval(100, 115, 60, 120);	// x, y, width, height
	}
	
	public void update(GameContainer gc, StateBasedGame sbg, int delta) throws SlickException{
	}
	
	public int getID(){
		return 0;
	}
}
