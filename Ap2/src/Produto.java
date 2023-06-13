public abstract class Produto
{
    private String Titulo;

    public Produto(String p_titulo)
    {
        setTitulo(p_titulo);
    }

    public String getTitulo() {
        return Titulo;
    }

    public void setTitulo(String titulo) {
        Titulo = titulo;
    }
}
