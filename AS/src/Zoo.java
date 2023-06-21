public class Zoo
{
    private Animal[] Animais;
    private Funcionario[] Funcionarios;

    public Zoo(int p_qtdAniaml, int p_qtdFuncionario)
    {
        Animais = new Animal[p_qtdAniaml];
        Funcionarios = new Funcionario[p_qtdFuncionario];
    }


    public void SetAnimal(Animal p_animal)
    {
        for(int i = 0; i < Animais.length; i++)
        {
            if(Animais[i] == null)
            {
                Animais[i] = p_animal;
                System.out.println("O " + p_animal.getNome() + " da especie " + p_animal.getEspecie() + " foi alocado no espaço " + i);
                break;
            }
        }
    }

    public void SetFuncionario(Funcionario p_funcionario)
    {
        for(int i = 0; i < Funcionarios.length; i++)
        {
            if(Funcionarios[i] == null)
            {
                Funcionarios[i] = p_funcionario;
                System.out.println("O " + p_funcionario.getNome() + " foi alocado no espaço " + i);
                break;
            }
        }
    }

    public void getAnimais() {
        for (int i = 0; i > Animais.length; i++)
        {
            if (Animais[i] == null)
            {
                System.out.println(Animais[i].getNome());
            }
        }
    }

    public void getFuncionarios() {
        for (int i = 0; i > Funcionarios.length; i++)
        {
            if (Funcionarios[i] == null)
            {
                System.out.println(Funcionarios[i].getNome());
            }
        }
    }


}
