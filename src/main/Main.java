package main;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.newdawn.slick.*;
import org.newdawn.slick.geom.*;


public class Main extends BasicGame {
    private Rectangle rectangulo = null;
    private Circle circulo = null;
     
    public Main(String gamename){
        super(gamename);
    }
    
  
    @Override
    public void init(GameContainer gc) throws SlickException {
        this.rectangulo = new Rectangle(10, 10, 40, 40);
        this.circulo = new Circle(100, 100, 7);
       
    }
  
    @Override
    public void update(GameContainer gc, int i) throws SlickException {
    	Input input = gc.getInput();
    	
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
  
    @Override
    public void render(GameContainer gc, Graphics g) throws SlickException {
     
    	g.setColor(Color.darkGray);		// Para el rectangulo
    	g.fill(this.rectangulo);
    	g.setColor(Color.green);		// Para el circulo
    	g.fill(circulo);
    	g.draw(circulo);
    	
        
        
    }
  
    public static void main(String[] args){
        try{
            AppGameContainer appgc = new AppGameContainer(new Main("Formas y figuras"));
            appgc.setDisplayMode(640, 480, false);
            appgc.start();
        }
        catch (SlickException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public static void randomPos(Circle circulo) {			// Una funcion que asigna una posicion aleatorio al circulo dado en el argumento
    	circulo.setX((float) (Math.random()*480));
    	circulo.setY((float) (Math.random()*480));
    }
}
