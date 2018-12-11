import java.util.Scanner;
public class Areas {

	public static void main(String[] args) {

		Menu.opcion();
		
		Scanner sc = new Scanner(System.in);
		int opcion = sc.nextInt();
		
		if (opcion == 1 && opcion <= 1) {
			System.out.println("Introduzca la base del triángulo:");
			int baseTri = sc.nextInt();
			System.out.println("Introduzca la altura del triángulo:");
			int alturaTri = sc.nextInt();
			System.out.println("El área del triángulo es: " + Calcular.areaTriangulo(baseTri, alturaTri));
		}
				
	}
}
