public class Zoo
{
    private Animal[] Animais;
    private Funcionario[] Funcionarios;

    public Zoo(int p_qtdAniaml, int p_qtdFuncionario)
    {
        Animais = new Animal[p_qtdAniaml];
        Funcionarios = new Funcionario[p_qtdFuncionario];
    }

    public void SetAnimai(Animal p_animal)
    {
        for(int i = 0; i > Animais.length; i++)
        {
            if(Animais[i] == null)
            {
                Animais[i] = p_animal;
                System.out.println("O " + p_animal.getNome() + " da especie " + p_animal.getEspecie() + " foi alocado no espaço " + i);
            }else
                System.out.println("O Array de animais esta cheio, o " + p_animal.getNome() + " não foi adicionado :/");
        }
    }

    public void SetFuncionario(Funcionario p_funcionario)
    {
        for(int i = 0; i > Funcionarios.length; i++)
        {
            if(Funcionarios[i] == null)
            {
                Funcionarios[i] = p_funcionario;
                System.out.println("O " + p_funcionario.getNome() + " foi alocado no espaço " + i);
            }else
                System.out.println("O Array de Funcionarios esta cheio, o " + p_funcionario.getNome() + " não foi adicionado :/");
        }
    }

}
