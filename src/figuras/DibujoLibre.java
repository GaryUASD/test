package figuras;

import java.awt.Graphics;
import java.awt.Point;
import java.util.ArrayList;

/**
 *
 * @author josearielpereyra
 */
public class DibujoLibre extends Figura{

  ArrayList<Point> puntos;

  public DibujoLibre(Point puntoInicial) {
    puntos = new ArrayList<>();
    puntos.add(puntoInicial);
  }

  public void actualizar(Point puntoFinal) {
    puntos.add( puntoFinal );
  }

  public void dibujar(Graphics g) {
    if(puntos.size() == 1) {
      new Linea(puntos.get(0), getColor() ).dibujar(g);
    }
    else {
    
      for(int i = 1; i < puntos.size(); i++) {
        Linea lineaActual = new Linea(puntos.get(i - 1), puntos.get(i), getColor() );
        lineaActual.dibujar(g);
      }  
    }
  }
}
