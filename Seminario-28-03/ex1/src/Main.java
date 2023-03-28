public class Main {
    public static void main(String[] args) {
        Relogio relogio = new Relogio();

        relogio.acertarRelogio(2,30,55);
        System.out.println(relogio.getHora());
        System.out.println(relogio.getMinuto());
        System.out.println(relogio.getSegundo());
    }
}