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
import javax.swing.border.EmptyBorder;

public class Inicio extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
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
	public Inicio() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 772, 485);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnNewButton = new JButton("Atender Clientes");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Atender atender = new Atender();
                atender.setVisible(true);
                dispose();
			}
		});
		btnNewButton.setForeground(new Color(47, 23, 0));
		btnNewButton.setBackground(new Color(255, 255, 255));
		btnNewButton.setBounds(361, 135, 277, 38);
		btnNewButton.setFont(new Font("Bodoni MT Black", Font.ITALIC, 26));
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Ver Historial de Pedidos");
		btnNewButton_1.setForeground(new Color(47, 23, 0));
		btnNewButton_1.setBackground(new Color(255, 255, 255));
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				HistorialPedidos historial = new HistorialPedidos();
                historial.setVisible(true);
                dispose();
			}
		});
		btnNewButton_1.setBounds(308, 203, 389, 52);
		btnNewButton_1.setFont(new Font("Bodoni MT Black", Font.ITALIC, 26));
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Salir");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnNewButton_2.setForeground(new Color(47, 23, 0));
		btnNewButton_2.setBackground(new Color(255, 255, 255));
		btnNewButton_2.setBounds(413, 290, 134, 38);
		btnNewButton_2.setFont(new Font("Bodoni MT Black", Font.ITALIC, 20));
		contentPane.add(btnNewButton_2);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon("L:\\icono pizzaaa siuuu.png"));
		lblNewLabel.setBounds(18, 110, 284, 248);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Pizza a la Calderón");
		lblNewLabel_1.setForeground(new Color(47, 23, 0));
		lblNewLabel_1.setFont(new Font("Bodoni MT", Font.BOLD | Font.ITALIC, 40));
		lblNewLabel_1.setBounds(198, 21, 378, 78);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblFondo = new JLabel("New label");
		lblFondo.setIcon(new ImageIcon("L:\\Fondo si o si.jpg"));
		lblFondo.setBounds(0, 0, 756, 446);
		contentPane.add(lblFondo);
	}
}
