package classesobjetos.estacionamento;

public class EstacionamentoTeste {

    public static void main(String[] args) {

        Veiculo meuVeiculo = new Veiculo("ABC-1234", "Fusca", 8);
        Veiculo seuVeiculo = new Veiculo("ABC-7894", "Camaro", 7);
        Veiculo nossoVeiculo = new Veiculo("ABC-687", "Mustang", 9);

        Estacionamento estacionamento = new Estacionamento();

        estacionamento.entrar(meuVeiculo);
        estacionamento.entrar(seuVeiculo);
        estacionamento.entrar(nossoVeiculo);

        estacionamento.sair("ABC-1234");

        estacionamento.exibirVeiculos();
    }
}
