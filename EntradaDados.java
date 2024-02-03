/*Este programa deve receber as seguintes entradas de dados do usuário:

Nome (texto)
Valor por hora (decimal)
Horas trabalhadas (inteiro)
Valor dos descontos (decimal)
A saída do programa deve ser um resumo da folha de pagamento, mostrando os cálculos e os resultados finais, como no exemplo abaixo:

Folha de pagamento: Thiago Faria
172 horas x R$150.20 = R$25834.40
Descontos: R$482.88
Total devido: R$25351.52*/

import java.util.Scanner;
public class EntradaDados {
    public static void main(String[] args){
    	Scanner entrada = new Scanner(System.in);
    	
    	System.out.print("Nome: ");
    	String nome = entrada.nextLine();
    	
    	System.out.print("Valor por hora: ");
    	double valorPorHora = entrada.nextDouble();
    	
    	System.out.print("Horas trabalhadas: ");
    	int horasTrabalhadas = entrada.nextInt();
    	
    	System.out.print("Valor dos descontos: ");
    	double valorDosDescontos = entrada.nextDouble();
    	    	
    	double valorTotalTrabalhado = valorPorHora * horasTrabalhadas;
    	double valorTotalDevido = valorTotalTrabalhado - valorDosDescontos;
    	
    	System.out.printf("Folha pagamento: %s%n", nome);
    	System.out.printf("%d horas x R$%.2f = R$%.2f%n", horasTrabalhadas, valorPorHora, valorTotalTrabalhado);
    	System.out.printf("Descontos: R$%.2f%n", valorDosDescontos);
    	System.out.printf("Total devido: R$%.2f%n", valorTotalDevido);
        }
}
