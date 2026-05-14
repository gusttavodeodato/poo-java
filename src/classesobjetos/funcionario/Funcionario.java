package classesobjetos.funcionario;

public class Funcionario {
    private String nome;
    private String cargo;
    private double salario;


    public Funcionario(String nome, String cargo, double salario) {
        this.nome = nome;
        this.cargo = cargo;
        this.salario = salario;
    }

    public void aumentarSalario(double porcentual) {
        salario = salario + (salario * porcentual / 100);
    }

    public String getNome() {
        return nome;
    }

    public String getCargo() {
        return cargo;
    }

    public double getSalario() {
        return salario;
    }

    public void exibirInfo() {
        System.out.println("Nome do funcionario: " + nome);
        System.out.println("Cargo: " + cargo);
        System.out.printf("Salário: R$ %.2f\n", salario);
    }
}
