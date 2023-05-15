package ejercicio1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Utils {
	public static double readDouble(Scanner sc) {
		double devuelve = 0;
		try {
			devuelve = sc.nextDouble();
		}catch(InputMismatchException e){
			System.out.println("El valor introducido no es de tipo double");
		}
		return devuelve;
	}
	public static int readInt(Scanner sc) {
		int devuelve = 0;
		try {
			devuelve = sc.nextInt();
		}catch(InputMismatchException e){
			System.out.println("El valor introducido no es de tipo int");
		}
		return devuelve;
	}
}
