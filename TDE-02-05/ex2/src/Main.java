public class Main {
    public static void main(String[] args) {
        Veiculo veiculo1 = new Veiculo();
        veiculo1.marca = "Ford";
        veiculo1.modelo = "Ford KA";

        Carro carro1 = new Carro();
        carro1.marca = "Volkswagen";
        carro1.modelo = "Fusca";
        carro1.numPassageiros = 4;

        System.out.println(veiculo1.marca + " " + veiculo1.modelo);
        System.out.println(carro1.marca + " " + carro1.modelo + " " + carro1.numPassageiros);
    }
}