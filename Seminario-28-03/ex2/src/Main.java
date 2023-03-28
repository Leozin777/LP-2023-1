public class Main {
    public static void main(String[] args) {
        Fracao fracao1 = new Fracao();
        fracao1.denominador = 2;
        fracao1.numerador = 2;

        Fracao fracao2 = new Fracao();
        fracao2.denominador = 2;
        fracao2.numerador = 2;

        System.out.println(fracao1.MultiplicaFracao(fracao1, fracao2).numerador);
        System.out.println(fracao1.MultiplicaFracao(fracao1, fracao2).denominador);
    }
}