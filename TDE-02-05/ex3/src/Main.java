public class Main {
    public static void main(String[] args) {
        FiguraGeometrica fig = new FiguraGeometrica();

        Quadrado quadrado = new Quadrado();
        quadrado.lado = 2;
        quadrado.calcularArea();
        quadrado.calcularPerimetro();

        System.out.println("lado do quadrado: " + quadrado.lado + ", area do quadrado = " +  quadrado.area);
        System.out.println("perimetro do quadrado = " + quadrado.perimetro);
    }
}