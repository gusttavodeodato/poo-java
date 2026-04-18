package classesobjetos.estacionamento;

import java.util.ArrayList;

public class Estacionamento {

    private ArrayList<Veiculo> veiculos = new ArrayList<Veiculo>();

    public void entrar(Veiculo v){
        if(veiculos.size() >= 10) {
            System.out.println("Estacionamento cheio");
        } else {
            veiculos.add(v);
        }
    }

    public void sair(String placa) {
        Veiculo encontrado = null;
        for (Veiculo v : veiculos ) {
            if (v.getPlaca().equals(placa)) {
                encontrado = v;
            }
        }
        veiculos.remove(encontrado);
    }

    public void exibirVeiculos() {
        for(Veiculo v : veiculos) {
            System.out.println("Veículo = " + v.getModelo() + " da placa: " + v.getPlaca() + " Entrada: " + v.getHoraEntrada() + "h\n");
        }
    }
}
