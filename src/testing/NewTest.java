package testing;

import org.newdawn.slick.*;
import org.newdawn.slick.state.*;



public class NewTest extends StateBasedGame{
	
	public static final String gameName = "Test game";
	public static final int menu = 0;
	public static final int play = 1;
	
	public NewTest(String gameName) {
		super(gameName);
		this.addState(new Menu(menu));
		this.addState(new Play(play));
	}
	
	public void initStatesList(GameContainer gc) throws SlickException {
		this.getState(menu).init(gc, this);
		this.getState(play).init(gc, this);
		this.enterState(menu);
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
