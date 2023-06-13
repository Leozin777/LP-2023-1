public class Quadrado extends FiguraGeometrica
{
    public double lado;
    public double area;
    public double perimetro;
    public void calcularArea()
    {
        area = lado * lado;
    }
    public void calcularPerimetro()
    {
        perimetro = 4 * lado;
    }
}
