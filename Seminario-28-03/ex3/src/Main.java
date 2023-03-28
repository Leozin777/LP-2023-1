public class Main {
    public static void main(String[] args) {

        CalculaCircunferencia calcCircunferencia = new CalculaCircunferencia();
        CalculaQuadrado calcQuadrado = new CalculaQuadrado();
        CalculaTrapezio calcTrapezio = new CalculaTrapezio();
        CalculaTriangulo calcTriangulo = new CalculaTriangulo();

        calcCircunferencia.raio = 2;
        System.out.println(calcCircunferencia.calculaArea());

        calcQuadrado.lado = 2;
        System.out.println(calcQuadrado.calculaLado());

        calcTrapezio.baseMenor = 1;
        calcTrapezio.baseMaior = 2;
        calcTrapezio.altura = 5;
        System.out.println(calcTrapezio.calculaArea());

        calcTriangulo.altura = 10;
        calcTriangulo.base = 2;

        System.out.println(calcTriangulo.calcularArea());

    }
}