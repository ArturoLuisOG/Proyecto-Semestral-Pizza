//Clase Atender
package grafica;

import javax.swing.ButtonGroup;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;
import javax.swing.DefaultComboBoxModel;
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
    private List<Cliente> listaClientes = new ArrayList<>();

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
        contentPane.setForeground(new Color(255, 255, 255));
        contentPane.setBackground(new Color(255, 255, 255));
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
        
        JButton btnMenu = new JButton("Menú");
        btnMenu.setForeground(new Color(47, 23, 0));
        btnMenu.setFont(new Font("Bodoni MT", Font.BOLD | Font.ITALIC, 17));
        btnMenu.setBounds(138, 402, 116, 23);
        btnMenu.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            	MenuPizzas menu = new MenuPizzas();
                menu.setVisible(true);
            }
        });
        contentPane.add(btnMenu);
        rdbtnEfectivo = new JRadioButton("Efectivo");
        rdbtnEfectivo.setForeground(new Color(47, 23, 0));
        rdbtnEfectivo.setFont(new Font("Bodoni MT", Font.ITALIC, 14));
        rdbtnEfectivo.setBounds(10, 126, 80, 23);
        contentPane.add(rdbtnEfectivo);

        rdbtnVisa = new JRadioButton("VISA");
        rdbtnVisa.setForeground(new Color(47, 23, 0));
        rdbtnVisa.setFont(new Font("Bodoni MT", Font.ITALIC, 14));
        rdbtnVisa.setBounds(10, 153, 80, 23);
        contentPane.add(rdbtnVisa);
        
        //Para que solo se pueda seleccionar uno de los 2 botones
        ButtonGroup group = new ButtonGroup();
        group.add(rdbtnEfectivo);
        group.add(rdbtnVisa);

        comboBoxTipodePizza = new JComboBox();
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
                guardarDatos();
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
        btnVolver.setBounds(521, 402, 89, 23);
        contentPane.add(btnVolver);

        JLabel lblIngreduientesDeLa = new JLabel("Ingredientes de la Pizza");
        lblIngreduientesDeLa.setForeground(new Color(47, 23, 0));
        lblIngreduientesDeLa.setFont(new Font("Bodoni MT", Font.ITALIC, 25));
        lblIngreduientesDeLa.setBounds(10, 226, 250, 31);
        contentPane.add(lblIngreduientesDeLa);

        comboBoxIngredientesdePizza = new JComboBox();
        comboBoxIngredientesdePizza.setModel(new DefaultComboBoxModel(new String[] {"Quezo Mozarella", "Jamón", "Pepperoni", "Piña", "Aceitunas", "Pollo", "Champiñones", "Jalapeños"}));
        comboBoxIngredientesdePizza.setForeground(new Color(47, 23, 0));
        comboBoxIngredientesdePizza.setBounds(10, 267, 139, 22);
        contentPane.add(comboBoxIngredientesdePizza);

        JButton btnFactura = new JButton("Factura");
        btnFactura.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                Factura factura = new Factura(listaClientes);
                factura.setVisible(true);
            }
        });
        btnFactura.setForeground(new Color(47, 23, 0));
        btnFactura.setFont(new Font("Bodoni MT", Font.BOLD | Font.ITALIC, 17));
        btnFactura.setBounds(390, 402, 116, 23);
        contentPane.add(btnFactura);
        
        JButton btnHistorial = new JButton("Historial");
        btnHistorial.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                HistorialPedidos historial = new HistorialPedidos(getListaClientes());
                historial.setVisible(true);
                dispose();
            }
            
            
        });
        btnHistorial.setForeground(new Color(47, 23, 0));
        btnHistorial.setFont(new Font("Bodoni MT", Font.BOLD | Font.ITALIC, 17));
        btnHistorial.setBounds(264, 402, 116, 23);
        contentPane.add(btnHistorial);
        
      

    }

    public void guardarDatos() {
        String nombre = txtTextNombreCl.getText();
        String cedula = textCedulaCl.getText();
        String direccion = textDireccion.getText();
        String telefono = textTelefonoCl.getText();
        String metodoPago = "";
        if (rdbtnEfectivo.isSelected()) {
            metodoPago = "Efectivo";
        } else if (rdbtnVisa.isSelected()) {
            metodoPago = "VISA";
        }
        String tipodepizza = comboBoxTipodePizza.getSelectedItem().toString();
        String ingredientesdepizza = comboBoxIngredientesdePizza.getSelectedItem().toString();

        Cliente cliente = new Cliente(nombre, cedula, direccion, telefono, metodoPago, tipodepizza, ingredientesdepizza);
        listaClientes.add(cliente);

        JOptionPane.showMessageDialog(null, "Los datos se han guardado correctamente.");
    }

    public List<Cliente> getListaClientes() {
        return listaClientes;
    }
}
