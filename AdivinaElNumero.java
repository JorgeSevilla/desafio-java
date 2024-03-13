import java.util.Scanner;

public class AdivinaElNumero {
	public static void main(String[] args) {

		int numeroAleatorio = (int) (Math.random() * 100);

		Scanner entrada = new Scanner(System.in);

		int numeroUsuario;
		int intentos= 0;
		
		System.out.println("Introduce un número entre 1 y 100: ");

		while (true) {
			intentos++;
			numeroUsuario = entrada.nextInt();
			if (numeroUsuario > numeroAleatorio) {
				System.out.println("El numero es menor");
			} else if (numeroUsuario < numeroAleatorio) {
				System.out.println("El número es mayor");
			} else {
				System.out.println("¡Felicidades! Has adivinado el número en :" + intentos + " intentos.");
				break;
			}
		}
		
	}
}
