package controlador;

import javax.swing.JOptionPane;
import modelo.Circulo;
import modelo.Rectangulo;

public class Controlador 
{
    public static void main(String[] args) {
        double radio = Double.parseDouble(JOptionPane.showInputDialog("Por favor digita el radio del Círculo: "));
        double base = Double.parseDouble(JOptionPane.showInputDialog("Por favor digita la base del Rectángulo: "));
        double altura = Double.parseDouble(JOptionPane.showInputDialog("Por favor digita la altura del Rectángulo: "));

        //Creación de Objeto Radio
        Circulo circulo = new Circulo(radio);
        circulo.Area();
        JOptionPane.showMessageDialog(null, "El área del círculo es: " + circulo.getArea());

        //Creación de Objeto Rectángulo
        Rectangulo rectangulo = new Rectangulo(base, altura);
        rectangulo.Area();
        JOptionPane.showMessageDialog(null, "El área del rectángulo es: " + rectangulo.getArea());
        rectangulo.Perimetro();
        JOptionPane.showMessageDialog(null, "El perímetro del rectángulo es: " + rectangulo.getPerimetro());
        

        
    }
}
