import java.util.Scanner;

public class Gincana
{
    private String nomeGincana;
    private int totalEstudantes;
    private Estudante estudanteVencedor;
    private int pontuacaoMaxima;

    public int getTotalEstudantes()
    {
        return this.totalEstudantes;
    }

    public void setTotalEstudantes(int p_totalEstudantes)
    {
        this.totalEstudantes = p_totalEstudantes;
    }

    public Estudante getEstudanteVencedor()
    {
        return this.estudanteVencedor;
    }

    public void setEstudanteVencedor(Estudante p_estudanteVencedor)
    {
        this.estudanteVencedor = p_estudanteVencedor;
    }

    public int getPontuacaoMaxima()
    {
        return this.pontuacaoMaxima;
    }

    public void setPontuacaoMaxima(int p_pontuacaoMaxima)
    {
        this.pontuacaoMaxima = p_pontuacaoMaxima;
    }

    public String getNomeGincana()
    {
        return this.nomeGincana;
    }

    public void setNomeGincana(String p_nomeGincana)
    {
        this.nomeGincana = p_nomeGincana;
    }

    public void adicionarEstudante(Estudante p_estudante)
    {
        boolean EstudanteVencedorNaoEstaNulo = this.estudanteVencedor != null;

        if(EstudanteVencedorNaoEstaNulo) {

            this.totalEstudantes += 1;

            System.out.println("Estudante " + p_estudante.getNome() + " adicionado com sucesso");
            System.out.println("====================================================================================");

            if (p_estudante.getPontos() > this.estudanteVencedor.getPontos()) {
                this.estudanteVencedor = p_estudante;
                this.pontuacaoMaxima = p_estudante.getPontos();

                System.out.println("o estudante " + p_estudante.getNome() + " se tornou o estudande com a maior pontuação," +
                        "a nova maior pontuação é " + p_estudante.getPontos());
                System.out.println("====================================================================================");
            }
        }else
        {
            this.totalEstudantes = 1;
            this.estudanteVencedor = p_estudante;
        }

    }

    public void exibirVencedor()
    {
        boolean EstudanteVencedorNaoEstaNulo = this.estudanteVencedor != null;

        if(EstudanteVencedorNaoEstaNulo) {
            System.out.println("O estudante vencedor se chama : " + this.estudanteVencedor.getNome() + " e a sua pontuação é " + this.estudanteVencedor.getPontos());
        }else
        {
            System.out.println("o estudante vencedor esta nulo");
        }
    }
}
