public class Relogio {
    public Ponteiro ponteiroHora;
    public Ponteiro ponteiroMinuto;
    public Ponteiro ponteiroSegundo;

    void acertarRelogio(int hora, int minuto, int segundo)
    {
        ponteiroHora.posicao = hora;
        ponteiroMinuto.posicao = minuto;
        ponteiroSegundo.posicao = segundo;
    }

    int lerHora()
    {
        return this.ponteiroHora.posicao;
    }
    int lerminuto()
    {
        return this.ponteiroMinuto.posicao;
    }
    int lerSegundo()
    {
        return this.ponteiroSegundo.posicao;
    }
}
