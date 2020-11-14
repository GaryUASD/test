package figuras;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Point;

/**
 *
 * @author josearielpereyra
 */
public class Linea extends Figura{

  Point puntoInicial = new Point();
  Point puntoFinal = new Point();

  public Linea(Point puntoInicial, Point puntoFinal, Color color) {
    super(color);
    this.puntoInicial = puntoInicial;
    this.puntoFinal = puntoFinal;
  }

  Linea(Point punto, Color color) {
    this(punto, punto, color);
  }

  public void actualizar(Point puntoFinal) {
    this.puntoFinal = puntoFinal;
  }

  public void dibujar(Graphics g) {
    g.drawLine(puntoInicial.x, puntoInicial.y, puntoFinal.x, puntoFinal.y);
  }
}