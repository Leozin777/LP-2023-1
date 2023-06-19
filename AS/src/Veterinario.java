public class Veterinario extends Funcionario
{
    private String Especialidade;

    private void RealizarExame(Animal p_animal)
    {
        System.out.println("Realizando exame em um " + p_animal.getEspecie() + " que se chama " + p_animal.getNome());
    }

}
