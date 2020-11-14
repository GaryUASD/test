package figuras;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Point;

/**
 *
 * @author josearielpereyra
 */
public abstract class Figura {
  private Color color;
  
  public Figura( Color color ) {
    this.color = color;
  }
  
  public Figura(){
    this( Color.BLACK);
  }
  
  public abstract void actualizar( Point puntoActual );
  public abstract void dibujar( Graphics g );

  public Color getColor() {
    return color;
  }

  public void setColor(Color color) {
    this.color = color;
  }
}