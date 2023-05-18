package modelo;

public class Circulo extends Figura
{
    public Circulo(double radio)
    {
        super(radio);
    }

    public void Area()
    {
        this.resultado = Math.PI * Math.pow(this.radio, 2);
    }

    public double getArea()
    {
        return this.resultado;
    }
}
