/*This is a tutorial class, its forbidden to write the game in here cuz it will be destroyed at some time*/

package main;
import org.newdawn.slick.*;
import org.lwjgl.*;
public class Tutorial extends BasicGame{

	
	private AppGameContainer contenedor; 
	
	public Tutorial(String title)  throws SlickException  {
		//Necesitamos llamar al constructorpadre.
		//Title es la cadena de cararcteres que aparecera en la barra dee titulo.
		super(title);

		contenedor =new AppGameContainer(this) ;
		contenedor.setDisplayMode(852, 480, false);
	}

	@Override
	public void render(GameContainer gc, Graphics g) throws SlickException {
		/* Renderiza el juego en pantalla
		 * 
		 * @param container el contenedor de juegos
		 * @param g controlador grafico de nuestro juego.
		 */
		g.drawString("Hola slick",100,200);
	}

	@Override
	public void init(GameContainer container) throws SlickException {
		/*Inicializa nuestro juego.
		 * 
		 * @param container el contenedor del juego.
		 */
		
	}

	@Override
	public void update(GameContainer container, int delta) throws SlickException {
		/*Actualizar nuestro juego.
		 * 
		 * @param container contenedor del juego
		 * @param delta numero de segundos desde la utlima vez que fue llamado update.
		 * 
		 */
		
	}

	public void iniciar() throws SlickException {
		contenedor.start();
	}
	
	public static void main(String[] args) {
		try {
			Tutorial hola=new Tutorial("Hola Slick");
			Tutorial.iniciar();
		}catch (SlickException slick) {
			slick.printStackTrace();
			
		}
		
	}
	
	
	
	
	
}
