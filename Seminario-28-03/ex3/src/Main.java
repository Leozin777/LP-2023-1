public class Main {
    public static void main(String[] args) {

        CalculaCircunferencia calcCircunferencia = new CalculaCircunferencia(2);
        CalculaQuadrado calcQuadrado = new CalculaQuadrado(2);
        CalculaTrapezio calcTrapezio = new CalculaTrapezio(2, 1, 5);
        CalculaTriangulo calcTriangulo = new CalculaTriangulo(2, 10);

        System.out.println(calcCircunferencia.calculaArea());
        System.out.println(calcQuadrado.calculaLado());
        System.out.println(calcTrapezio.calculaArea());
        System.out.println(calcTriangulo.calcularArea());

    }
}