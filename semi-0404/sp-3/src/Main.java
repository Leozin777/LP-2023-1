public class Main {
    public static void main(String[] args) {
        Animal leao = new Animal();

        leao.especie = "Leão";
        leao.nome = "cleber";
        leao.idade  = 20;

        leao.emitirSom();
        leao.dormir();
    }
}