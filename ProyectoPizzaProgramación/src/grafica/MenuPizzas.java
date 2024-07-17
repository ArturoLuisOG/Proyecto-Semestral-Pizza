package grafica;

import java.awt.Color;
import java.awt.Font;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class MenuPizzas extends JFrame {

    private static final long serialVersionUID = 1L;
    private JPanel contentPane;

    public MenuPizzas() {
        setTitle("Menú de Pizzas");
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setBounds(100, 100, 300, 200);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);

        JLabel lblMenu = new JLabel("Menú de Pizzas");
        lblMenu.setForeground(new Color(47, 23, 0));
        lblMenu.setFont(new Font("Bodoni MT", Font.BOLD | Font.ITALIC, 20));
        lblMenu.setBounds(50, 10, 200, 30);
        contentPane.add(lblMenu);

        JLabel lblPequena = new JLabel("Pizza Pequeña: $4.50");
        lblPequena.setForeground(new Color(47, 23, 0));
        lblPequena.setFont(new Font("Bodoni MT", Font.PLAIN, 16));
        lblPequena.setBounds(50, 50, 200, 20);
        contentPane.add(lblPequena);

        JLabel lblPersonal = new JLabel("Pizza Personal: $6.50");
        lblPersonal.setForeground(new Color(47, 23, 0));
        lblPersonal.setFont(new Font("Bodoni MT", Font.PLAIN, 16));
        lblPersonal.setBounds(50, 70, 200, 20);
        contentPane.add(lblPersonal);

        JLabel lblMediana = new JLabel("Pizza Mediana: $7.50");
        lblMediana.setForeground(new Color(47, 23, 0));
        lblMediana.setFont(new Font("Bodoni MT", Font.PLAIN, 16));
        lblMediana.setBounds(50, 90, 200, 20);
        contentPane.add(lblMediana);

        JLabel lblFamiliar = new JLabel("Pizza Familiar: $8.50");
        lblFamiliar.setForeground(new Color(47, 23, 0));
        lblFamiliar.setFont(new Font("Bodoni MT", Font.PLAIN, 16));
        lblFamiliar.setBounds(50, 110, 200, 20);
        contentPane.add(lblFamiliar);
    }
}
