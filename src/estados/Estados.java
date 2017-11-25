package estados;

import org.newdawn.slick.GameContainer;
import org.newdawn.slick.SlickException;
import org.newdawn.slick.state.StateBasedGame;
import org.newdawn.slick.*;


public class Estados extends StateBasedGame {
	
	private AppGameContainer contenedor;
	public Estados()throws SlickException {
		super("TomiFlow");
		contenedor= new AppGameContainer(this);
		contenedor.setDisplayMode(640,640,false);
		contenedor.setShowFPS(false);
		contenedor.start();
	}
/**
 * Inicializa la lista de los estados del juego
 */
	   public static final int MAINMENUSTATE         = 0;
	   public static final int GAMEPLAYSTATE         = 1;
	   public static final int LEVELSELECTSTATE      = 2;
	@Override
	public void initStatesList(GameContainer container) throws SlickException {
		// TODO Auto-generated method stub

		
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
