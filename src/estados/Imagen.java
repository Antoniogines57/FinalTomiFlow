package estados;

import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.Image;
import org.newdawn.slick.SlickException;
import org.newdawn.slick.state.BasicGameState;
import org.newdawn.slick.state.StateBasedGame;
import org.newdawn.slick.Input;

public class Imagen extends BasicGameState {

	public Imagen() {
		// TODO Auto-generated constructor stub
	}
	private Image sprite;
	@Override
	public void init(GameContainer container, StateBasedGame game) throws SlickException {
		sprite=new Image ("/res/cursor.gif");

	}

	@Override
	public void render(GameContainer container, StateBasedGame game, Graphics g) throws SlickException {
		// TODO Auto-generated method stub
		sprite.draw(50,50);
	}

	@Override
	public void update(GameContainer container, StateBasedGame game, int delta) throws SlickException {
		// TODO Auto-generated method stub
		
		

	}

	@Override
	public int getID() {
		// TODO Auto-generated method stub
		return 1;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
