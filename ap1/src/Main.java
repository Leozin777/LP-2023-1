public class Main {
    public static void main(String[] args) {
        Estudante leo = new Estudante();
        leo.setNome("leo");
        leo.setIdade(22);
        leo.setPontos(8);

        Estudante joao = new Estudante();
        joao.setNome("joao");
        joao.setIdade(25);
        joao.setPontos(9);

        Estudante paulo = new Estudante();
        paulo.setNome("paulo");
        paulo.setIdade(12);
        paulo.setPontos(4);

        Gincana gincana = new Gincana();

        gincana.adicionarEstudante(leo);
        gincana.adicionarEstudante(joao);
        gincana.adicionarEstudante(paulo);

        gincana.exibirVencedor();
    }
}