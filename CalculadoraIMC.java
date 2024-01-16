//Desafio: calculadora complexa de IMC
import java.util.Scanner;

public class CalculadoraIMC {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Peso: ");
		int peso = entrada.nextInt();
		
		System.out.println("Altura: ");
		double altura = entrada.nextDouble();
		
		System.out.println("Sexo: Inserir 1 para M -> Masculino e 0 para F -> Feminino");
		char sexo =  'M';
		
		if (entrada.nextShort() != 1) {
			sexo = 'F';
		}
				
		double imc = peso / (altura * altura);
		
		if ((sexo == 'F' && imc <= 19.1) || (sexo == 'M' && imc <= 20.7)) {
			System.out.println("Abaixo do peso: " + imc);
		} else if ((sexo == 'F' && imc <= 25.8) || (sexo == 'M' && imc <= 26.4)) {
			System.out.println("No peso ideal: " + imc);
		} else if ((sexo == 'F' && imc <= 27.3) || (sexo == 'M' && imc <= 27.8)) {
			System.out.println("Um pouco acima do peso: " + imc);
		} else if ((sexo == 'F' && imc <= 32.3) || (sexo == 'M' && imc <= 31.1)) {
			System.out.println("Acima do peso ideal: " + imc);
		} else {
			System.out.println("Obeso: " + imc);
		}
	}
}