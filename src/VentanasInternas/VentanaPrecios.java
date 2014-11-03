package VentanasInternas;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class VentanaPrecios extends JInternalFrame {
	private static final long serialVersionUID = 1L;
	
	JButton vpUno;
	JLabel Limagen1, texto;
	ImageIcon image1, image2;

	public VentanaPrecios(){
		
		this.setTitle("Precios");
		setResizable(true);
		setClosable(true);
		setMaximizable(true);
		setVisible(true);
		setBounds(0, 0, 700, 500);
		setOpaque(false);
		
		//vpUno = new JButton("uno");
		//vpUno.setBounds(0, 0, 100, 50);
		//vpUno.addActionListener(this);
		//add(vpUno);
	//LABELES
		texto = new JLabel ("2 camas dobles 1 simple Q300.-");
		texto.setBounds(50, 30, 100, 50);
		texto.setVisible(true);
		add(texto);
		image1 = new ImageIcon("combo1.jpg");
		Limagen1 = new JLabel(image1);
		Limagen1.setBounds(100, 150, 500, 500);
		add(Limagen1);
		this.setVisible(true);
		
	}
	
	

}
