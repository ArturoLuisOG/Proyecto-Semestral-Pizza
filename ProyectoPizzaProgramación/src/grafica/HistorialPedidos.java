package grafica;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.border.EmptyBorder;

public class HistorialPedidos extends JFrame {

	private static final long serialVersionUID = 1L;
    private JPanel contentPane;	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Inicio ini = new Inicio();
					ini.setVisible(true);
					ini.setLocationRelativeTo(null);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public HistorialPedidos() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 780, 491);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Historial de Pedidos");
		lblNewLabel.setForeground(new Color(47, 23, 0));
		lblNewLabel.setFont(new Font("Bodoni MT", Font.BOLD | Font.ITALIC, 32));
		lblNewLabel.setBounds(10, 0, 313, 76);
		contentPane.add(lblNewLabel);
		
		JTextArea textArea = new JTextArea();
		textArea.setBounds(20, 88, 281, 353);
		contentPane.add(textArea);
		
		JButton btnVolver2 = new JButton("Volver");
		btnVolver2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Inicio inicio = new Inicio();
                inicio.setVisible(true);
                dispose();
			}
		});
		btnVolver2.setFont(new Font("Bodoni MT", Font.BOLD | Font.ITALIC, 17));
		btnVolver2.setBounds(648, 404, 89, 23);
		contentPane.add(btnVolver2);
		
		JLabel lblFondoHistorial = new JLabel("fondoHistorial");
		lblFondoHistorial.setIcon(new ImageIcon("L:\\Fondo si o si.jpg"));
		lblFondoHistorial.setBounds(0, 0, 771, 452);
		contentPane.add(lblFondoHistorial);
	      }
	}

