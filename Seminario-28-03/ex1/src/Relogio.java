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
}
