public class Gato extends Animal
{
    String pelagem;

    void emitirSom()
    {
        System.out.println("miau");
    }

    void mover()
    {
        super.emitirSom();
        System.out.println("movendo-se como um gato");
    }
}
