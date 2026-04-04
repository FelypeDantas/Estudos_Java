import javax.swing.*;
import java.awt.*;

public class CalculadoraGeometrica extends JFrame {

    private JTextField campoValor1;
    private JTextField campoValor2;
    private JLabel resultado;

    public CalculadoraGeometrica() {
        setTitle("Calculadora Geométrica PRO");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        getContentPane().setBackground(new Color(30, 30, 30));
        setLayout(new GridLayout(6, 1, 10, 10));

        JLabel titulo = new JLabel("Calculadora de Áreas", JLabel.CENTER);
        titulo.setForeground(Color.WHITE);
        titulo.setFont(new Font("Arial", Font.BOLD, 20));

        campoValor1 = new JTextField();
        campoValor1.setBorder(BorderFactory.createTitledBorder("Valor 1"));

        campoValor2 = new JTextField();
        campoValor2.setBorder(BorderFactory.createTitledBorder("Valor 2 (se necessário)"));

        JPanel painelBotoes = new JPanel(new GridLayout(2, 2, 5, 5));
        painelBotoes.setBackground(new Color(30, 30, 30));

        JButton btnQuadrado = criarBotao("Quadrado");
        JButton btnRetangulo = criarBotao("Retângulo");
        JButton btnCirculo = criarBotao("Círculo");
        JButton btnTriangulo = criarBotao("Triângulo");

        painelBotoes.add(btnQuadrado);
        painelBotoes.add(btnRetangulo);
        painelBotoes.add(btnCirculo);
        painelBotoes.add(btnTriangulo);

        resultado = new JLabel("Resultado aparecerá aqui", JLabel.CENTER);
        resultado.setForeground(Color.GREEN);

        add(titulo);
        add(campoValor1);
        add(campoValor2);
        add(painelBotoes);
        add(resultado);

        btnQuadrado.addActionListener(e -> calcularQuadrado());
        btnRetangulo.addActionListener(e -> calcularRetangulo());
        btnCirculo.addActionListener(e -> calcularCirculo());
        btnTriangulo.addActionListener(e -> calcularTriangulo());
    }

    private JButton criarBotao(String texto) {
        JButton botao = new JButton(texto);
        botao.setBackground(new Color(70, 130, 180));
        botao.setForeground(Color.WHITE);
        return botao;
    }

    private double obterValor(JTextField campo) {
        return Double.parseDouble(campo.getText());
    }

    private void calcularQuadrado() {
        try {
            double lado = obterValor(campoValor1);
            resultado.setText("Área do Quadrado: " + (lado * lado));
        } catch (Exception e) {
            mostrarErro();
        }
    }

    private void calcularRetangulo() {
        try {
            double base = obterValor(campoValor1);
            double altura = obterValor(campoValor2);
            resultado.setText("Área do Retângulo: " + (base * altura));
        } catch (Exception e) {
            mostrarErro();
        }
    }

    private void calcularCirculo() {
        try {
            double raio = obterValor(campoValor1);
            double area = Math.PI * raio * raio;
            resultado.setText("Área do Círculo: " + String.format("%.2f", area));
        } catch (Exception e) {
            mostrarErro();
        }
    }

    private void calcularTriangulo() {
        try {
            double base = obterValor(campoValor1);
            double altura = obterValor(campoValor2);
            double area = (base * altura) / 2;
            resultado.setText("Área do Triângulo: " + area);
        } catch (Exception e) {
            mostrarErro();
        }
    }

    private void mostrarErro() {
        JOptionPane.showMessageDialog(this, "Digite valores válidos!", "Erro", JOptionPane.ERROR_MESSAGE);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new CalculadoraGeometrica().setVisible(true));
    }
}
