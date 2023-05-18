package modelo;

public class Figura
{
    protected double base;
    protected double altura;
    protected double radio;
    protected double resultado;


    public Figura(double base, double altura)
    {
        this.base = base;
        this.altura = altura;
    }

    public Figura(double radio)
    {
        this.radio = radio;
    }

    public double mostrarResultado()
    {
        return this.resultado;
    }

}