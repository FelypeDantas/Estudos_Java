import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CalculadoraGeometrica extends JFrame {

    private JTextField campoValor;
    private JLabel resultado;

    public CalculadoraGeometrica() {
        setTitle("Calculadora Geométrica");
        setSize(350, 250);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(new GridLayout(5, 1, 10, 10));

        JLabel titulo = new JLabel("Cálculo de Áreas", JLabel.CENTER);
        titulo.setFont(new Font("Arial", Font.BOLD, 18));

        campoValor = new JTextField();
        campoValor.setBorder(BorderFactory.createTitledBorder("Informe o valor"));

        JPanel painelBotoes = new JPanel(new GridLayout(1, 3, 5, 5));

        JButton btnQuadrado = new JButton("Quadrado");
        JButton btnRetangulo = new JButton("Retângulo");
        JButton btnCirculo = new JButton("Círculo");

        painelBotoes.add(btnQuadrado);
        painelBotoes.add(btnRetangulo);
        painelBotoes.add(btnCirculo);

        resultado = new JLabel("Resultado aparecerá aqui", JLabel.CENTER);

        add(titulo);
        add(campoValor);
        add(painelBotoes);
        add(resultado);

        btnQuadrado.addActionListener(e -> calcularQuadrado());
        btnRetangulo.addActionListener(e -> calcularRetangulo());
        btnCirculo.addActionListener(e -> calcularCirculo());
    }

    private int obterValor() throws NumberFormatException {
        return Integer.parseInt(campoValor.getText());
    }

    private void calcularQuadrado() {
        try {
            int lado = obterValor();
            resultado.setText("Área do Quadrado: " + (lado * lado));
        } catch (NumberFormatException e) {
            mostrarErro();
        }
    }

    private void calcularRetangulo() {
        try {
            int base = obterValor();
            String alturaStr = JOptionPane.showInputDialog("Informe a altura:");
            int altura = Integer.parseInt(alturaStr);

            resultado.setText("Área do Retângulo: " + (base * altura));
        } catch (NumberFormatException e) {
            mostrarErro();
        }
    }

    private void calcularCirculo() {
        try {
            int raio = obterValor();
            double area = Math.PI * raio * raio;

            resultado.setText("Área do Círculo: " + String.format("%.2f", area));
        } catch (NumberFormatException e) {
            mostrarErro();
        }
    }

    private void mostrarErro() {
        JOptionPane.showMessageDialog(this, "Digite um número válido!", "Erro", JOptionPane.ERROR_MESSAGE);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new CalculadoraGeometrica().setVisible(true);
        });
    }
}
