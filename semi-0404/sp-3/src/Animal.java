public class Animal {
    public String nome;
    public int idade;
    public String especie;

    public void emitirSom()
    {
        System.out.println("o animal chamado " + nome + " da especie " + especie + " esta emitindo um som");
    }

    public void dormir()
    {
        System.out.println("o animal chamado " + nome + " da especie " + especie + "esta dormindo");
    }
}
