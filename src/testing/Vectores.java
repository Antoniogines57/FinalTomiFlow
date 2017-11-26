package testing;

import java.util.logging.Level;
import java.util.logging.Logger;
import org.newdawn.slick.*;
import org.newdawn.slick.geom.*;


public class Vectores extends BasicGame {
	
	private Vector2f gravity = new Vector2f(0,2);
	public class Objeto extends Circle{
		public Vector2f position;			// Vectro posicion del objeto
		public Objeto(float x, float y, float rad) {
			super(x, y, rad);
			
		}
		public Vector2f velocity = new Vector2f(1,-1);		// Vector velocidad, modificara el vector posicion
	}
	Objeto objeto = new Objeto(100,100,15);
	Line suelo = new Line(0,500,1024,500);				// El suelo, al tocarlo, el objeto se para
	int timepassed = 0;			// la variable t, para modificar la posicion !!! es necesario modificarlo para el correcto funcionamiento
	
	
	public Vectores(String gamename) {
		super(gamename);
	}

	public void init(GameContainer gc) throws SlickException{
		objeto.velocity = objeto.velocity.add(gravity);
	}
	
	public void render(GameContainer gc, Graphics g) throws SlickException{
		g.draw(objeto);
		g.draw(suelo);
	}
	
	public void update(GameContainer gc, int delta) throws SlickException{
		timepassed += delta;
		objeto.position = new Vector2f(objeto.getX(), objeto.getY());				// Vector posicion
		if (!objeto.intersects(suelo)){												// Si el objeto no toca el suelo, seguimos moviendolo
			objeto.position = objeto.position.add(objeto.velocity.scale(1));	// La posicion del objeto cambia, modificando su vector de posicion sumandole el vector velocidad
																						// velocity.scale() modifica el vector velocidad, habria que averiguar una forma para que la bola
																						// no se mueva tan rapido
		}
		objeto.setX(objeto.position.x);		// Modificamos la posicion del objeto basandose en su vector posicion
		objeto.setY(objeto.position.y);
	}
	
	public static void main(String[] args) {
		try{
            AppGameContainer appgc = new AppGameContainer(new Vectores("Vectores"));
            appgc.setDisplayMode(1024, 600, false);
            appgc.setShowFPS(false);
            appgc.start();
        }
        catch (SlickException ex) {
            Logger.getLogger(Vectores.class.getName()).log(Level.SEVERE, null, ex);
        }
	}

}
