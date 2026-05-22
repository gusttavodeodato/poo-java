package introducao.tiposprimitivos;

/*Exercício basico onde utilizo double e condição de comparacão, entrada de dados e saída*/

import java.util.Scanner;

public class PrimitivoDouble {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("\nComparando qual salário é maior: ");
        double salarioUm = entrada.nextDouble();

        System.out.println("Segundo salário:");
        double salarioDois = entrada.nextDouble();


        //A biblioteca math.abs serve para retornar o valor absoluto e verifica se é menor que 1 centavo
        if(Math.abs(salarioUm - salarioDois) < 0.01) {
            System.out.println("Os dois salários são iguais");
        } else if (salarioUm > salarioDois) {
            System.out.printf("O salário um é maior -  R$ %.2f%n", salarioUm);
        } else {
            System.out.printf("O salário dois é maior - RS %.2f%n", salarioDois);
        }
    }
}
