package introducao.tiposprimitivos;

/*Aqui estamoa fazendo um exercicio básico, onde peço para o usuário digitar dois números para realizar a soma
* ainda utilizamos um tipo primitivo int e aritmetica atribuindo adição*/

import java.util.Scanner;

public class PrimitivoInt {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite o primeiro valor: ");
        int primeiro = entrada.nextInt();

        System.out.println("Digite o segundo valor: ");
        int segundo = entrada.nextInt();

        int soma = primeiro + segundo;

        System.out.printf("A soma dos valores é: %d%n", soma);
    }
}
