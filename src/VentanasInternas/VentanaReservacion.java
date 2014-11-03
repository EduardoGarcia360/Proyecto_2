package VentanasInternas;

import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;



public class VentanaReservacion extends JInternalFrame {
	private static final long serialVersionUID = 1L;
	JTextField T1, T2, T3;
	JLabel L1, L2, L3;
	
	public VentanaReservacion(){
		setLayout(null);
		this.setTitle("Ventana para Reservacion");
		setResizable(true);
		setClosable(true);
		setMaximizable(true);
		setVisible(true);
		setBounds(0, 0, 700, 500);
		setOpaque(false);
	//LABELS
		L1 = new JLabel("Nombre completo");
		L1.setBounds(10, 10, 150, 30);
		add(L1);
		T1 = new JTextField();
		T1.setBounds(120, 10, 250, 25);
		add(T1);
		
		L2 = new JLabel("Apellido");
		L2.setBounds(10, 30, 150, 30);
		add(L2);
		T2 = new JTextField();
		T2.setBounds(120, 40, 180, 25);
		add(T2);
	}
}
