package dibujante;

import figuras.DibujoLibre;
import figuras.Figura;
import figuras.Linea;
import figuras.Rectangulo;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import javax.swing.JPanel;

/**
 *
 * @author josearielpereyra
 */
class PanelDeDibujo extends JPanel {
  ArrayList<Figura> figuras;
  Figura figuraActual;
  VentanaPrincipal ventana;
  Color colorActual;

  public PanelDeDibujo(VentanaPrincipal ventana) {
    this.ventana = ventana;
    figuras = new ArrayList<>();
    
    this.addMouseListener(new MouseAdapter() {
       @Override
       public void mousePressed(MouseEvent evento) {
         
         if( ventana.getMenuItemLinea().isSelected() ) {
          figuraActual = new Linea( evento.getPoint(), evento.getPoint(), colorActual );
         }
         else if(ventana.getMenuItemRectangulo().isSelected() ){
           figuraActual = new Rectangulo(evento.getPoint());
         }
         else{
          figuraActual = new DibujoLibre( evento.getPoint() );
         }
                           
         figuras.add(figuraActual );
         repaint();
       }
     });
     
     this.addMouseMotionListener(new MouseAdapter() {
       @Override
       public void mouseDragged(MouseEvent evento) {
         figuraActual.actualizar( evento.getPoint() );
         repaint();
       }
     });
  }
  
  @Override
  protected void paintComponent(Graphics g) {
    super.paintComponent(g);
    setBackground(Color.WHITE);
    for(Figura figura: figuras){
      g.setColor( figura.getColor() );
      figura.dibujar(g);
    }
  } 
}