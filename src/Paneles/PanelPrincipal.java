package Paneles;

import java.awt.Graphics;
import java.awt.Image;
import java.net.URL;
import javax.swing.JPanel;
import javax.swing.ImageIcon;

public class PanelPrincipal extends JPanel {
	private static final long serialVersionUID = 1L;
	public Image imagen;
	public URL fondo;
	public PanelPrincipal(){
		fondo = this.getClass().getResource("principal.jpg");
		imagen = new ImageIcon(fondo).getImage();
	}

	
	public void paintComponent(Graphics g){
		g.drawImage(imagen, 0, 0, getWidth(), getHeight(), null);
	}

}
