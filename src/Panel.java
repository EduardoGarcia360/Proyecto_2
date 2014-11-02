import java.awt.Graphics;
import java.awt.Image;
import java.net.URL;
import javax.swing.JPanel;
import javax.swing.ImageIcon;


public class Panel extends JPanel {
	private static final long serialVersionUID = 1L;
public Image imagen;
public URL fondo;
	public Panel(){
		fondo = this.getClass().getResource("principal.jpg");
		imagen = new ImageIcon(fondo).getImage();
	}

	
	public void paintComponent(Graphics g){
		g.drawImage(imagen, 0, 0, getWidth(), getHeight(), null);
	}


}
