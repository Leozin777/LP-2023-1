public class Main {
    public static void main(String[] args) {
        Calculadora calc = new Calculadora();

        System.out.println("2 + 2 = " + calc.somar(2,2));
        System.out.println("2 - 2 = " + calc.subtrair(2,2));
        System.out.println("2 x 2 = " + calc.multiplicar(2,2));
        System.out.println("2 / 2 = " + calc.dividir(2,2));
    }
}