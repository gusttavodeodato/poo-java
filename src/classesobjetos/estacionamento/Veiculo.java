package classesobjetos.estacionamento;

public class Veiculo {

    private final String modelo;
    private final String placa;
    private final Integer horaEntrada;

    public Veiculo(String placa, String modelo, Integer horaEntrada) {
        this.placa = placa;
        this.modelo = modelo;
        this.horaEntrada = horaEntrada;
    }

    public String getPlaca() {
        return placa;
    }

    public String getModelo() {
        return modelo;
    }

    public Integer getHoraEntrada() {
        return horaEntrada;
    }
}
