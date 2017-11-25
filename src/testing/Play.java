package testing;

import org.newdawn.slick.*;
import org.newdawn.slick.state.*;

public class Play extends BasicGameState{
	public Play(int state){
	}
	
	public void init(GameContainer gc, StateBasedGame sbg) throws SlickException{
	}
	
	public void render(GameContainer gc, StateBasedGame sbg, Graphics g) throws SlickException{
		g.drawString("You're in the Play State!", 300, 210);
	}
	
	public void update(GameContainer gc, StateBasedGame sbg, int delta) throws SlickException{
	}
	
	public int getID(){
		return 1;
	}
}
