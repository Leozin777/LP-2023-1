public class Main {
    public static void main(String[] args) {
        Fracao fracao1 = new Fracao(2,2);

        Fracao fracao2 = new Fracao(2,2);

        System.out.println(fracao1.MultiplicaFracao(fracao1, fracao2).numerador);
        System.out.println("-");
        System.out.println(fracao1.MultiplicaFracao(fracao1, fracao2).denominador);
    }
}