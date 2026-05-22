package introducao.tiposprimitivos.Exercicios;

/*
Exercicio onde fazemos conversão de temperaturas, usando scanner para o usuario
digitar a opcao que deseja e assim o programa correr de acordo com a escolha
*/

import java.util.Scanner;

public class ConversorTemperatura {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("\nEscolha o tipo de conversão que deseja: ");
        System.out.println("1 - Celsius para Fahrenheit");
        System.out.println("2 - Celsius para Kelvin");
        System.out.println("3 - Fahrenheit para Celsius");
        int opcao = entrada.nextInt();

        switch (opcao) {
            case 1:
                System.out.println("\nDigite a temperatura em Celsius ");
                double celsius = entrada.nextDouble();

                if (celsius <= -273.15) {
                    System.out.println("Temperatura inválida - abaixo do zero absoluto.");
                    break;
                }

                double fahrenheit = (celsius * 9.0 / 5) + 32;
                System.out.printf("\nTemperatura em Celsius convertida para Fahrenheit %.2f°F%n", fahrenheit);
                break;

            case 2:
                System.out.println("\nDigite a temperaura em Celsius:");
                double celsiusKelvin = entrada.nextDouble();

                if (celsiusKelvin <= -273.15) {
                    System.out.println("Temperatura inválida - abaixo do zero absoluto.");
                    break;
                }

                double kelvin = celsiusKelvin + 273.15;
                System.out.printf("\nTemperatura convertida para Kelvin %.2fK%n", kelvin);
                break;

            case 3:
                System.out.println("\nDigite a temperatura em Fahrenheit: ");
                double f = entrada.nextDouble();
                double celsiusFah = (f - 32) * 5.0 / 9;
                System.out.printf("\nTemperatura convertida para Celsius %.2f°C%n", celsiusFah);
                break;

            default:
                System.out.println("Opção inválida.");
        }

    }
}
