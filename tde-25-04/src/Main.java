public class Main {
    public static void main(String[] args) {
        Cachorro scooby = new Cachorro("Scooby", "Pastor alemão", 10);
        Cachorro toby = new Cachorro("Toby", "Buldogg");

        System.out.println(scooby.getNome() + " " + scooby.getRaca() + " " + scooby.getIdade());
        System.out.println(toby.getNome() + " " + toby.getRaca() + " " + toby.getIdade());
    }
}