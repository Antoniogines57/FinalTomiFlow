package estados;

import java.util.logging.Level;
import java.util.logging.Logger;

import org.newdawn.slick.AppGameContainer;
import org.newdawn.slick.Color;
import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.Input;
import org.newdawn.slick.SlickException;
import org.newdawn.slick.geom.Circle;
import org.newdawn.slick.geom.Rectangle;
import org.newdawn.slick.state.BasicGameState;
import org.newdawn.slick.state.StateBasedGame;

import main.Main;

public class Juego extends BasicGameState {

	public Juego() {
		// TODO Auto-generated constructor stub
	}
    private Rectangle rectangulo = null;
    private Circle circulo = null;
	@Override
	public void init(GameContainer container, StateBasedGame game) throws SlickException {
		//Inicializa
        this.rectangulo = new Rectangle(10, 10, 40, 40);
        this.circulo = new Circle(100, 100, 7);

	}
	
	@Override
	public void render(GameContainer container, StateBasedGame game, Graphics g) throws SlickException {
		//Dibuja
    	g.setColor(Color.darkGray);		// Para el rectangulo
    	g.fill(this.rectangulo);
    	g.setColor(Color.green);		// Para el circulo
    	g.fill(circulo);
    	g.draw(circulo);
		
		
		
	}

	@Override
	public void update(GameContainer container, StateBasedGame game, int delta) throws SlickException {
		// Actualiza
    	
		int i=1;
		Input input = container.getInput();
    	
    	if (input.isKeyDown(Input.KEY_DOWN)) {			// no ponemos "else" porque sino, solo se cumplira una condicion a la vez, 
    		rectangulo.setY(rectangulo.getY()+i);				// y nos interesa que podamos mover la bola en varias direcciones a la vez
    	}
    	if  (input.isKeyDown(Input.KEY_UP)){
         rectangulo.setY(rectangulo.getY()-i); 					//Para arriba negativo y para abajo positivo
    	}
    	if (input.isKeyDown(Input.KEY_RIGHT)) {
    		rectangulo.setX(rectangulo.getX()+i);
    	}
    	if (input.isKeyDown(Input.KEY_LEFT)) {
    		rectangulo.setX(rectangulo.getX()-i);
    	}
    	if (input.isKeyPressed(Input.KEY_R)) { 			//Si se pierde el rectangulo con la r vuelve a su hogar
    		rectangulo.setX(0);
    		rectangulo.setY(0);}
    	
    	// Comprobamos colisiones
    	
    	if (rectangulo.intersects(circulo)) {			// Si el rectangulo toca al circulo
    		randomPos(circulo);					// Llamamos al metodo que movera al circulo a una posicion aleatoria
    	}
  
   
	}

	public static void main(String[] args) {
		try{
            AppGameContainer appgc = new AppGameContainer(new Main("Formas y figuras"));
            appgc.setDisplayMode(640, 480, false);
            appgc.start();
        }
        catch (SlickException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }

	}
	
	@Override
	public int getID() {
		/*
		 * Slick relaciona cada estado con un entero, no puede estar repetido 
		 * 
		 * Cada estado debe de tener asociado un entero, da igual cómo se haga
		 * 
		 */
		return 0;
	}
    public static void randomPos(Circle circulo) {			// Una funcion que asigna una posicion aleatorio al circulo dado en el argumento
    	circulo.setX((float) (Math.random()*480));
    	circulo.setY((float) (Math.random()*480));
    }
	
	
	
	
	

}
