package estados;

import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.Image;
import org.newdawn.slick.SlickException;
import org.newdawn.slick.state.BasicGameState;
import org.newdawn.slick.state.StateBasedGame;
import org.newdawn.slick.Input;


public class Imagen extends BasicGameState {

	public Imagen(int state) {
		// TODO Auto-generated constructor stub
	}
	private Image juego;
	private Image exit;
	@Override
	public void init(GameContainer container, StateBasedGame game) throws SlickException {
		juego=new Image ("/res/jugar.png");
		exit=new Image ("/res/exit.jpg");

	}

	@Override
	public void render(GameContainer container, StateBasedGame game, Graphics g) throws SlickException {
		// TODO Auto-generated method stub
		juego.draw(80,90);
		exit.draw(180, 300);
	}

	@Override
	public void update(GameContainer container, StateBasedGame game, int delta) throws SlickException {
		// TODO Auto-generated method stub
		Input mouse=container.getInput();
		int posX=mouse.getMouseX();
		int posY=mouse.getMouseY();
		if ((posX<551)&&(posX>80)&&((posY<208)&&(posY>90))) { //Comprobamos que el mouse está en el área del botón
			
			if(mouse.isMouseButtonDown(0)) //Comprobamos que está presionado el botón
			{
				game.enterState(1);  //Entramos al modo de juego 1
		}
			 if ((posX<405)&&(posX>180)&&((posY<524)&&(posY>300))) { //Comprobamos que el mouse está en el área del botón
				
				if(mouse.isMouseButtonDown(0)) //Comprobamos que está presionado el botón
				{
					System.exit(0);
			}
			}
			
		}
		
System.out.println(posY);

	}

	@Override
	public int getID() {
		// TODO Auto-generated method stub
		return 0;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
