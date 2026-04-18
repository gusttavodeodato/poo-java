package classesobjetos.contabancaria;

public class ContaBancaria {
    private String titular;
    private double saldo;

    public ContaBancaria(String titular, double saldo) {
       setTitular(titular);
       setSaldo(saldo);
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        if (titular.isBlank()) {
            this.titular = "Titular inválido";
        } else {
            this.titular = titular;
        }
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        if (saldo >= 0 ) {
            this.saldo = saldo;
        } else {
            this.saldo =0;
        }
    }

    public void depositar(double valor) {
        saldo += valor;
        System.out.println("Valor de R$" + valor + " depositado.");
    }

    public void sacar (double valor) {
        if (saldo >= valor) {
            saldo -= valor;
            System.out.println("Valor de R$" + valor + " sacado.");
        } else {
            System.out.println("Saldo insuficiente.");
        }
    }

    @Override
    public String toString() {
        return "Titular: " + titular + " | Saldo: R$" + saldo + "\n";
    }
}
