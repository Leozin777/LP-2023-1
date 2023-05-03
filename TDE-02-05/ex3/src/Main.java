public class Main {
    public static void main(String[] args) {
        FiguraGeometrica fig = new FiguraGeometrica();

        Quadrado quadrado = new Quadrado();
        quadrado.lado = 2;
        double area =  quadrado.calcularArea(quadrado.lado);
        double perimetro = quadrado.calcularPerimetro(quadrado.lado);

        System.out.println("lado do quadrado: " + quadrado.lado + ", area do quadrado = " +  area);
        System.out.println("perimetro do quadrado = " + perimetro);
    }
}