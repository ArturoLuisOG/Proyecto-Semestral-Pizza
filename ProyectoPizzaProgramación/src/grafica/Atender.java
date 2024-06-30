package grafica;

import java.awt.Color;

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

import logica.Cliente;

public class Atender extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtTextNombreCl;
	private JTextField textDireccion;
	private JTextField textCedulaCl;
	private JTextField textTelefonoCl;
	private JComboBox<String> comboBoxTipodePizza;
	private JComboBox<String> comboBoxIngredientesdePizza;
    private JRadioButton rdbtnEfectivo;
    private JRadioButton rdbtnVisa;
	private Cliente cliente;

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
	public Atender() {
		setTitle("Calderón a la Pizza");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 782, 491);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel_Atender = new JLabel("Atender Clientes");
		lblNewLabel_Atender.setForeground(new Color(47, 23, 0));
		lblNewLabel_Atender.setFont(new Font("Bodoni MT", Font.BOLD | Font.ITALIC, 32));
		lblNewLabel_Atender.setBounds(10, 0, 284, 54);
		contentPane.add(lblNewLabel_Atender);
		
		txtTextNombreCl = new JTextField();
		txtTextNombreCl.setFont(new Font("Bodoni MT", Font.ITALIC, 16));
		txtTextNombreCl.setBounds(486, 41, 250, 20);
		contentPane.add(txtTextNombreCl);
		txtTextNombreCl.setColumns(10);
		
		JLabel lblNombreCl = new JLabel("Nombre");
		lblNombreCl.setForeground(new Color(47, 23, 0));
		lblNombreCl.setFont(new Font("Bodoni MT", Font.ITALIC, 25));
		lblNombreCl.setBounds(430, 11, 87, 26);
		contentPane.add(lblNombreCl);
		
		JLabel lblDireccionCl = new JLabel("Dirección");
		lblDireccionCl.setForeground(new Color(47, 23, 0));
		lblDireccionCl.setFont(new Font("Bodoni MT", Font.ITALIC, 25));
		lblDireccionCl.setBounds(430, 72, 111, 26);
		contentPane.add(lblDireccionCl);
		
		textDireccion = new JTextField();
		textDireccion.setFont(new Font("Bodoni MT", Font.ITALIC, 16));
		textDireccion.setBounds(486, 109, 234, 20);
		contentPane.add(textDireccion);
		textDireccion.setColumns(10);
		
		JLabel lblCedulaCl = new JLabel("Cédula");
		lblCedulaCl.setForeground(new Color(47, 23, 0));
		lblCedulaCl.setFont(new Font("Bodoni MT", Font.ITALIC, 25));
		lblCedulaCl.setBounds(430, 153, 111, 26);
		contentPane.add(lblCedulaCl);
		
		textCedulaCl = new JTextField();
		textCedulaCl.setFont(new Font("Bodoni MT", Font.ITALIC, 16));
		textCedulaCl.setColumns(10);
		textCedulaCl.setBounds(486, 190, 234, 20);
		contentPane.add(textCedulaCl);
		
		JLabel lblTelfonoCl = new JLabel("Teléfono");
		lblTelfonoCl.setForeground(new Color(47, 23, 0));
		lblTelfonoCl.setFont(new Font("Bodoni MT", Font.ITALIC, 25));
		lblTelfonoCl.setBounds(430, 241, 111, 26);
		contentPane.add(lblTelfonoCl);
		
		textTelefonoCl = new JTextField();
		textTelefonoCl.setFont(new Font("Bodoni MT", Font.ITALIC, 16));
		textTelefonoCl.setColumns(10);
		textTelefonoCl.setBounds(486, 278, 234, 20);
		contentPane.add(textTelefonoCl);
		
		JLabel lblMetodoDePago = new JLabel("Método de Pago");
		lblMetodoDePago.setForeground(new Color(47, 23, 0));
		lblMetodoDePago.setFont(new Font("Bodoni MT", Font.ITALIC, 25));
		lblMetodoDePago.setBounds(10, 87, 158, 26);
		contentPane.add(lblMetodoDePago);
		
		JRadioButton rdbtnEfectivo = new JRadioButton("Efectivo");
		rdbtnEfectivo.setForeground(new Color(47, 23, 0));
		rdbtnEfectivo.setFont(new Font("Bodoni MT", Font.ITALIC, 14));
		rdbtnEfectivo.setBounds(10, 126, 80, 23);
		contentPane.add(rdbtnEfectivo);
		
		JRadioButton rdbtnVisa = new JRadioButton("VISA");
		rdbtnVisa.setForeground(new Color(47, 23, 0));
		rdbtnVisa.setFont(new Font("Bodoni MT", Font.ITALIC, 14));
		rdbtnVisa.setBounds(10, 153, 80, 23);
		contentPane.add(rdbtnVisa);
		
		JComboBox comboBoxTipodePizza = new JComboBox();
		comboBoxTipodePizza.setForeground(new Color(47, 23, 0));
		comboBoxTipodePizza.setModel(new DefaultComboBoxModel(new String[] {"Pizza Pequeña", "Pizza Familiar", "Pizza Personal", "Pizza Mediana"}));
		comboBoxTipodePizza.setBounds(223, 127, 139, 22);
		contentPane.add(comboBoxTipodePizza);
		
		JLabel lblTipoDePizza = new JLabel("Tipo de Pizza");
		lblTipoDePizza.setForeground(new Color(47, 23, 0));
		lblTipoDePizza.setFont(new Font("Bodoni MT", Font.ITALIC, 25));
		lblTipoDePizza.setBounds(213, 87, 158, 26);
		contentPane.add(lblTipoDePizza);
		
		JButton btnGuardar = new JButton("Guardar");
		btnGuardar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {	
			}
		});
		btnGuardar.setFont(new Font("Bodoni MT", Font.BOLD | Font.ITALIC, 17));
		btnGuardar.setForeground(new Color(47, 23, 0));
		btnGuardar.setBounds(620, 402, 116, 23);
		contentPane.add(btnGuardar);
		
		JButton btnVolver = new JButton("Volver");
		btnVolver.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Inicio inicio = new Inicio();
                inicio.setVisible(true);
                dispose();
			}
		});
		btnVolver.setForeground(new Color(47, 23, 0));
		btnVolver.setFont(new Font("Bodoni MT", Font.BOLD | Font.ITALIC, 17));
		btnVolver.setBounds(500, 402, 89, 23);
		contentPane.add(btnVolver);
		
		JLabel lblIngreduientesDeLa = new JLabel("Ingredientes de la Pizza");
		lblIngreduientesDeLa.setForeground(new Color(47, 23, 0));
		lblIngreduientesDeLa.setFont(new Font("Bodoni MT", Font.ITALIC, 25));
		lblIngreduientesDeLa.setBounds(10, 226, 250, 26);
		contentPane.add(lblIngreduientesDeLa);
		
		JComboBox comboBoxIngredientesdePizza = new JComboBox();
		comboBoxIngredientesdePizza.setModel(new DefaultComboBoxModel(new String[] {"Quezo Mozarella", "Jamón", "Pepperoni", "Piña", "Aceitunas", "pollo", "Champiñones", "Jalapeños"}));
		comboBoxIngredientesdePizza.setForeground(new Color(47, 23, 0));
		comboBoxIngredientesdePizza.setBounds(10, 263, 139, 22);
		contentPane.add(comboBoxIngredientesdePizza);
		
		JLabel lblFondoAtender = new JLabel("New label");
		lblFondoAtender.setIcon(new ImageIcon("L:\\Fondo si o si.jpg"));
		lblFondoAtender.setBounds(0, 0, 777, 452);
		contentPane.add(lblFondoAtender);
	}


public void guardarDatos() {
	 try {
	     // Obtener los datos ingresados por el empleado
		 String nombre = txtTextNombreCl.getText();
		 String cedula = textCedulaCl.getText();
		 String direccion = textDireccion.getText();
		 String metodoPago = ""; 
		 if (rdbtnEfectivo.isSelected()) {
		     metodoPago = "Efectivo";
		 } else if (rdbtnVisa.isSelected()) {
		     metodoPago = "VISA";
		 }
		 String telefono = textTelefonoCl.getText();
		 String tipoDePizza = (String)comboBoxTipodePizza.getSelectedItem();
		 String ingredientesDePizza = (String)comboBoxIngredientesdePizza.getSelectedItem();

	        // Crear el objeto Cliente con los datos obtenidos
	        Cliente cliente = new Cliente (nombre, cedula, direccion, metodoPago, telefono, ingredientesDePizza, tipoDePizza);
	        
	        // Impresión en consola
	        System.out.println("Información del cliente guardada: " + cliente.toString());
	        
	        // Mostrar un mensaje de confirmación al empleado final 
	        JOptionPane.showMessageDialog(this, "Información guardada correctamente", "Éxito", JOptionPane.INFORMATION_MESSAGE);
	       
	        // Restablecer los valores de los campos de texto
	        txtTextNombreCl.setText("");
	        textDireccion.setText("");
	        textCedulaCl.setText("");
	        textTelefonoCl.setText("");
	        txtTextNombreCl.setText("");
	        
	        // Restablecer los valores de los JComboBox
	        comboBoxIngredientesdePizza.setSelectedIndex(-1); 
	        comboBoxTipodePizza.setSelectedIndex(-1); 
	        
	        // Restablecer los valores de los JRadioButton
	        rdbtnEfectivo.setSelected(false);
	        rdbtnVisa.setSelected(false);
	    } catch (NumberFormatException e) {
	     
	        JOptionPane.showMessageDialog(this, "Por favor, ingrese datos válidos", "Error", JOptionPane.ERROR_MESSAGE);
	    }
	}

}

