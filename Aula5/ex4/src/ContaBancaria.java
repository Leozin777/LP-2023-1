public class ContaBancaria {
    public int numeroDaConta;
    public double saldo;
    public String titular;

    public void depositar(double p_deposito)
    {
        this.saldo += p_deposito;
    }

    public double sacar(double p_saque)
    {
        if(p_saque >= saldo)
        {
            return this.saldo -= p_saque;
        }
        else
        {
            System.out.println("Saldo insuficiente");
            return 0;
        }
    }

    public void transferencia(ContaBancaria p_contaRecebe, double p_din)
    {
        var retorno = this.sacar(p_din);

        if(retorno == 0)
            System.exit(0);

        p_contaRecebe.depositar(p_din);
    }


}
