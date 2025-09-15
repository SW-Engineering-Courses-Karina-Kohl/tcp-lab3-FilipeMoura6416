public class TrianguloEquilatero extends FiguraGeometrica 
{
    private double lado;

    TrianguloEquilatero(String cor, double lado)
    {
        super(cor);
        this.lado = lado;
    }
    public  double getLado()
    {
        return this.lado;
    }
    public void setLado(double lado)
    {
        this.lado = lado;
    }

    @Override
    public double calcularArea()
    {
        return (Math.sqrt(3)/4) * (this.lado * this.lado); 
    }

    @Override
    public double calcularPerimetro()
    {
        return 3*this.lado;
    }

    @Override
    public String getTipoFigura()
    {
        return "Triângulo Equilátero";
    }

    @Override
    public String getDetalhes()
    {       
        return "Tipo: " + getTipoFigura() + " Lado:" + Double.toString(this.lado)  + " Area: " + Double.toString(this.calcularArea()) + 
        " Perímetro: " + Double.toString(this.calcularPerimetro());

    }
    
}
