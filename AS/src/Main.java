public class Main {
    public static void main(String[] args) {
        Ave beto = new Ave();
        beto.setEspecie("Periquito");
        beto.setIdade(1);
        beto.setNome("beto");
        beto.setPeso(0.3);
        beto.setEnvergaduraAsa(0.18);

        beto.Movimentar();
        beto.Movimentar("voar");

        beto.RealizarTruque();
        beto.Voar();

        Veterinario maria = new Veterinario();
        maria.setNome("maria");
        maria.setCargo("Veterinaria");
        maria.setSalario(4000);
        maria.setEspecialidade("aves");

        Funcionario marcos = new Funcionario();
        marcos.setNome("marcos");
        marcos.setSalario(2500);
        marcos.setCargo("faxineiro");

        Zoo zoo = new Zoo(1,2);

        zoo.SetAnimal(beto);
        zoo.SetFuncionario(marcos);
        zoo.SetFuncionario(maria);

        zoo.getAnimais();
        zoo.getFuncionarios();
    }
}