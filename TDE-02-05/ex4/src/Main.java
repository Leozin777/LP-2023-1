public class Main {
    public static void main(String[] args) {
        Conta conta = new Conta();
        conta.numero = 1002;
        conta.saldo = 200000;

        ContaCorrente contaCorrente = new ContaCorrente();
        contaCorrente.numero = 10009;
        contaCorrente.limite = 1000.00;
        contaCorrente.saldo = 20405402;

        System.out.println(conta.numero + " " + conta.saldo);
        System.out.println(contaCorrente.numero + " " + contaCorrente.saldo + " " + contaCorrente.limite);
    }
}