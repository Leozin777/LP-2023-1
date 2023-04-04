public class Main {
    public static void main(String[] args) {
        Circulo circ = new Circulo();

        circ.raio = 10;

        System.out.println("a area do circulo é = " + circ.calcularArea());
        System.out.println("o perimetro do circulo é = " + circ.calcularPerimetro());

    }
}