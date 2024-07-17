//Clase HistorialPedidos
package grafica;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.border.EmptyBorder;

import logica.Cliente;

public class HistorialPedidos extends JFrame {

    private static final long serialVersionUID = 1L;
    private JPanel contentPane;
    private JTextArea textArea;

    public HistorialPedidos(List<Cliente> listaClientes) {
        setTitle("Historial de Pedidos");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 506, 500);
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
        btnVolver.setBounds(380, 397, 89, 23);
        contentPane.add(btnVolver);

        mostrarDatos(listaClientes);
    }

    private void mostrarDatos(List<Cliente> listaClientes) {
        StringBuilder sb = new StringBuilder();
        for (Cliente cliente : listaClientes) {
            sb.append("Nombre: ").append(cliente.getNombre()).append("\n");
            sb.append("Cédula: ").append(cliente.getCedula()).append("\n");
            sb.append("Dirección: ").append(cliente.getDireccion()).append("\n");
            sb.append("Teléfono: ").append(cliente.getMetodoPago()).append("\n");
          
            sb.append("Método de Pago: ").append(cliente.getTelefono()).append("\n");
            sb.append("Tipo de Pizza: ").append(cliente.getTipodepizza()).append("\n");
            sb.append("Ingredientes: ").append(cliente.getIngredientesdepizza()).append("\n");
            sb.append("------------------------------\n");
        }
        textArea.setText(sb.toString());
    }
}
