package figuras;

import java.awt.Point;
import java.awt.Graphics;

/**
 *
 * @author HectorGaryMoquete
 */
public class Ovalo extends Figura {

  Point ubicacion;
  int anchura;
  int altura;
    
  public Ovalo(Point ubicacion) {
    this.ubicacion = ubicacion;
    anchura = 0;
    altura = 0;
  }
  
  @Override
  public void actualizar(Point puntoActual) {
    anchura = puntoActual.x - ubicacion.x;
    altura = puntoActual.y - ubicacion.y;
  }

  @Override
  public void dibujar(Graphics g) {
    int x = ubicacion.x + ( (anchura < 0) ? this.anchura : 0 );
    int y = ubicacion.y + ( (altura < 0) ? this.altura : 0 );

    g.drawOval(x, y, Math.abs(anchura), Math.abs(altura)); 
  }

}