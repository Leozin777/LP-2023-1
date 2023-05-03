public class Main {
    public static void main(String[] args) {
        Cachorro cachorro1 = new Cachorro();

        cachorro1.nome = "rex";
        cachorro1.idade = 10;
        cachorro1.raca = "Golden";
        cachorro1.emitirSom();
        cachorro1.mover();

        Gato gato1 = new Gato();
        gato1.nome = "Mabel";
        gato1.idade = 1;
        gato1.pelagem = "Escura";
        gato1.emitirSom();
        gato1.mover();
    }
}