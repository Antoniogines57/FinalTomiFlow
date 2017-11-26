package testing;

import java.util.logging.Level;
import java.util.logging.Logger;
import org.newdawn.slick.*;
import org.newdawn.slick.geom.*;


public class Vectores extends BasicGame {
	
	Vector2f vector;
	Circle circulo;
	Circle circulo1;
	
	public Vectores(String gamename) {
		super(gamename);
	}

	public void init(GameContainer gc) throws SlickException{
		vector = new Vector2f(2,4);
		circulo = new Circle(50, 100, 10);
		circulo1 = new Circle(170, 230, 8);
	}
	
	public void render(GameContainer gc, Graphics g) throws SlickException{
		g.draw(circulo);
		g.draw(circulo1);
	}
	
	public void update(GameContainer gc, int delta) throws SlickException{
		Input input = gc.getInput();
		if (input.isKeyDown(Input.KEY_SPACE)) {
			vector.projectOntoUnit(vector, vector);
		}
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
