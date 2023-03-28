public class Relogio {
    public Ponteiro ponteiroHora = new Ponteiro();
    public Ponteiro ponteiroMinuto = new Ponteiro();
    public Ponteiro ponteiroSegundo = new Ponteiro();

    void acertarRelogio(int hora, int minuto, int segundo)
    {
        ponteiroHora.posicao = hora;
        ponteiroMinuto.posicao = minuto / 5;
        ponteiroSegundo.posicao = segundo / 5;
    }

    int getHora()
    {
        return ponteiroHora.posicao;
    }

    int getMinuto()
    {
        return ponteiroMinuto.posicao * 5;
    }

    int getSegundo()
    {
        return ponteiroSegundo.posicao * 5;
    }
}
