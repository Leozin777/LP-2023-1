abstract class Animal
{
    private String name;

    public void setName(String p_name)
    {
        this.name = p_name;
    }

    public String getName()
    {
        return this.name;
    }

    public Animal(String p_name)
    {
        this.name = p_name;
    }
    public abstract void fazerSom();
}
