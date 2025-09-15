public class Retangulo extends FiguraGeometrica
{
    private double largura;
    private double altura;

    Retangulo(String Cor, double largura, double altura)
    {
        super(Cor);
        this.altura = altura;
        this.largura = largura;        
    }

    public double getAltura()
    {
        return this.altura;
    }

    public double getLargura()
    {
        return this.largura;
    }

    public void setAltura(double altura)
    {
        this.altura = altura;
    }

    public void setLargura(double largura)
    {
        this.largura = largura;
    }

    @Override
    public double calcularArea()
    {
        return this.altura * this.largura;
    }

    @Override
    public double calcularPerimetro()
    {
        return 2*(this.altura + this.largura); 
    }

    @Override
    public String getTipoFigura()
    {
        return "Retângulo";
    }

    public String getDetalhes()
    {
        return "Tipo: " + getTipoFigura() + " Altura:" + Double.toString(this.altura) + " Largura: "+ Double.toString(this.largura)  +
         " Area: " + Double.toString(this.calcularArea()) + 
        " Perímetro: " + Double.toString(this.calcularPerimetro());}
}
