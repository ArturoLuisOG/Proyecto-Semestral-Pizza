package grafica;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.border.EmptyBorder;
import logica.Cliente;

public class Factura extends JFrame {

    private static final long serialVersionUID = 1L;
    private JPanel contentPane;
    private JTextArea textArea;

    public Factura(Cliente cliente) {
        setTitle("Factura");
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setBounds(100, 100, 500, 500);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);

        textArea = new JTextArea();
        textArea.setEditable(false);
        textArea.setFont(new Font("Bodoni MT", Font.PLAIN, 14));
        JScrollPane scrollPane = new JScrollPane(textArea);
        scrollPane.setBounds(20, 20, 340, 400);
        contentPane.add(scrollPane);

        JButton btnCerrar = new JButton("Cerrar");
        btnCerrar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                dispose();
            }
        });
        btnCerrar.setForeground(new Color(47, 23, 0));
        btnCerrar.setFont(new Font("Bodoni MT", Font.BOLD | Font.ITALIC, 17));
        btnCerrar.setBounds(380, 397, 89, 23);
        contentPane.add(btnCerrar);

        mostrarDatos(cliente);
    }

    private void mostrarDatos(Cliente cliente) {
        StringBuilder sb = new StringBuilder();
        sb.append("Nombre: ").append(cliente.getNombre()).append("\n");
        sb.append("Cédula: ").append(cliente.getCedula()).append("\n");
        sb.append("Dirección: ").append(cliente.getDireccion()).append("\n");
        sb.append("Método de Pago: ").append(cliente.getMetodoPago()).append("\n");
        sb.append("Teléfono: ").append(cliente.getTelefono()).append("\n");
        sb.append("Tipo de Pizza: ").append(cliente.getTipodepizza()).append("\n");
        sb.append("Ingredientes: ").append(cliente.getIngredientesdepizza()).append("\n");
        sb.append("Precio: $").append(calcularPrecio(cliente.getTipodepizza())).append("\n");
        sb.append("------------------------------\n");

        textArea.setText(sb.toString());
    }

    private double calcularPrecio(String tipoDePizza) {
        switch (tipoDePizza) {
            case "Pizza Pequeña":
                return 4.50;
            case "Pizza Personal":
                return 6.50;
            case "Pizza Mediana":
                return 7.50;
            case "Pizza Familiar":
                return 8.50;
            default:
                return 0.0;
        }
    }
}
