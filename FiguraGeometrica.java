public abstract class FiguraGeometrica implements CalculosGeometricos
{
    private String cor;
    private int id;
    private static int totalFiguras;

    FiguraGeometrica(String cor)
    {
        this.cor = cor;
        totalFiguras++;
        this.id = totalFiguras;
    }

    public String getCor()
    {
        return this.cor;
    }

    public void setCor(String cor)
    {
        this.cor = cor;
    }
    public int getId()
    {
        return this.id;
    }

    public static int getTotalFiguras()
    {
        return totalFiguras;
    }

    public String getInfo()
    {
        return "Cor: " + this.cor + " Id: " + Integer.toString(this.id) + " " + getDetalhes();
    }

    abstract public String getDetalhes();

}
