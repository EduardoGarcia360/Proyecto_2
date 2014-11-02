package VentanasInternas;

import javax.swing.JButton;
import javax.swing.JInternalFrame;

public class VentanaPrecios extends JInternalFrame {
	private static final long serialVersionUID = 1L;
	
	JButton vpUno;

	public VentanaPrecios(){
		setLayout(null);
		setResizable(true);
		setClosable(true);
		setMaximizable(true);
		setVisible(true);
		
		
		
		setBounds(0, 0, 500, 500);
		
		
		vpUno = new JButton("uno");
		vpUno.setBounds(0, 0, 100, 50);
		add(vpUno);
		
		
	}

}
