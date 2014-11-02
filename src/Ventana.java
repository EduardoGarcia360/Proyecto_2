
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JDesktopPane;
import javax.swing.JFrame;
import javax.swing.JInternalFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;

public class Ventana implements ActionListener {
	JFrame ventana = new JFrame("proyecto hoteles");
	JDesktopPane escritorio = new JDesktopPane();
	JMenuBar barra;
	JMenu archivo;
	JMenuItem salir, reservacion, precios;
	JButton vpUno;
	boolean precio =false;
	JPanel v2p = new JPanel();
	Paneles.PanelPrincipal principal = new Paneles.PanelPrincipal();
	
	public Ventana(){
		ventana.getContentPane().add(escritorio);
		ventana.setResizable(false); 
		ventana.setSize(1200,570); 
		ventana.setLocationRelativeTo(null);
		ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		ventana.setVisible(true);
		//FONDO
				ventana.add(principal);
				escritorio.setOpaque(false);
		//AGREGANDO MENU BAR
				barra = new JMenuBar();
				ventana.setJMenuBar(barra);
				//
				archivo = new JMenu("Archivo");
				barra.add(archivo);
				//
				reservacion = new JMenuItem("Reservacion");
				reservacion.addActionListener(this);
				archivo.add(reservacion);
				
				precios = new JMenuItem("Precios");
				precios.addActionListener(this);
				archivo.add(precios);
				
				salir = new JMenuItem("Salir");
				salir.addActionListener(this);
				archivo.add(salir);
		//VENTANA INTERNA DE PRECIOS
				//vPrecios.add(v2p);
				//vPrecios.pack();
				//vPrecios.setResizable(true);
				//vPrecios.setClosable(true);
				//vPrecios.setMaximizable(true);
				//escritorio.add(vPrecios);
				//vPrecios.setVisible(false);		
	}
	
	
		
	
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == salir){
			System.exit(0);
		}
		if (e.getSource() == precios){
			//VENTANA INTERNA DE PRECIOS
			if (precio == false){
				//JInternalFrame vPrecios = new JInternalFrame("ventana de precios");			
				VentanasInternas.VentanaPrecios vPrecios = new VentanasInternas.VentanaPrecios();
				//vPrecios.setLayout(null);
				//vPrecios.setName("ventana precios");
				//vPrecios.setBounds(0, 0, 500, 500);
				//vPrecios.add(v2p);
				//vPrecios.pack();
				//vpUno = new JButton("uno");
				//vpUno.setBounds(0, 0, 100, 50);
				//vPrecios.add(vpUno);
				escritorio.add(vPrecios);
				vPrecios.setVisible(true);
				precio = true;
			}else{
				precio = false;
			}
			
			
		}
	}

}
