package classesobjetos.funcionario;

public class FuncionarioTeste {
    public static void main(String[] args) {
        System.out.println("\n ----- Funcionários -----\n");

        Funcionario funcionario1 = new Funcionario("Gustavo", "Dev Júnior", 2000);
        Funcionario funcionario2 = new Funcionario("Andre", "Dev Júnior", 3000);
        Funcionario funcionario3 = new Funcionario("Ryan", "Dev Júnior", 4000);


        // exibição dos funcionarios
        funcionario1.exibirInfo();
        double salarioAntigo = funcionario1.getSalario();
        funcionario1.aumentarSalario(10);
        System.out.printf("Salário de %s foi de R$ %.2f -> para R$ %.2f", funcionario1.getNome(), salarioAntigo, funcionario1.getSalario());

        System.out.println("\n");

        funcionario2.exibirInfo();
        double salarioAntigo2 = funcionario2.getSalario();
        funcionario2.aumentarSalario(10);
        System.out.printf("Salário de %s foi de R$ %.2f -> para R$ %.2f", funcionario2.getNome(), salarioAntigo2, funcionario2.getSalario());

        System.out.println("\n");

        funcionario3.exibirInfo();
        double salarioAntigo3 = funcionario3.getSalario();
        funcionario3.aumentarSalario(10);
        System.out.printf("Salário de %s foi de R$ %.2f -> para R$ %.2f\n", funcionario3.getNome(), salarioAntigo3, funcionario3.getSalario());

    }
}
