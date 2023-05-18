package modelo;

public class Rectangulo extends Figura
{
    public Rectangulo(double base, double altura)
    {
        super(base, altura);
    }

    public void Area()
    {
        this.resultado = this.base * this.altura;
    }

    public double getArea()
    {
        return this.resultado;
    }

    public void Perimetro()
    {
        this.resultado = (this.base * 2) + (this.altura * 2);
    }

    public double getPerimetro()
    {
        return this.resultado;
    }
}
