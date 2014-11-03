package Paneles;

import javax.swing.JPanel;
import java.awt.Graphics;
import java.awt.Image;
import java.net.URL;
import javax.swing.ImageIcon;
public class PanelPrecio extends JPanel{
	
	public Image imagen;
	public URL fondo;
	public PanelPrecio(){
		fondo = this.getClass().getResource("precios.jpg");
		imagen = new ImageIcon(fondo).getImage();
	}

	
	public void paintComponent(Graphics g){
		g.drawImage(imagen, 0, 0, getWidth(), getHeight(), null);
	}

}
