package classesobjetos.contabancaria;

public class ContaBancariaTeste {
    public static void main(String[] args) {

        ContaBancaria minhaConta = new ContaBancaria("Gustavo Deodato", 500000);

        System.out.println(minhaConta);
        minhaConta.sacar(200000);
        minhaConta.depositar(100000);

        minhaConta.toString();

        ContaBancaria suaConta = new ContaBancaria("Rakim D", 400000);
        System.out.println(suaConta);
        suaConta.sacar(200000);
        suaConta.depositar(100000);

        suaConta.toString();

        ContaBancaria nossaConta = new ContaBancaria("", 50);
        System.out.println(nossaConta);

        nossaConta.sacar(50);
        nossaConta.depositar(50);

        nossaConta.toString();
    }
}
