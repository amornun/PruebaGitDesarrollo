package desarrolloGit;
import java.util.Scanner;

public class GitColaborativo {

	public static void main(String[] args) {
		var sc = new Scanner(System.in);
		
		final double DescuentoVip = 0.95;
		
		//cliente introduce los km
		System.out.println("Introduzca el numero de km que ha conducido: ");
		int Kilometros = sc.nextInt();
		
		//cliente introduce si es vip o no
		System.out.println("Introduzca 1 si es VIP o 2 si no lo es: ");
		int Vip = sc.nextInt();
		
		//variables de tipo de facturacion
		final double Precio1 = (Kilometros - 300) * 0.30 + (200);
		final double Precio2 = (Kilometros - 1000) * 0.15 + (300 + 200);
		
		//Cálculo facturación y visualización del total
		if((Kilometros < 300) && (Vip == 1)) {
			System.out.println("Total: " + 200 * DescuentoVip );
		
		} else if((Kilometros < 300) && (Vip == 2)) {
			System.out.println("Total: " + 200);
		
		} else if((Kilometros >=300) && (Kilometros <= 1000) && (Vip == 2 )) {
			System.out.println("Total no vip: " + (Precio1 * 1.21));
		
		} else if((Kilometros >= 300) && (Kilometros <= 1000) && (Vip == 1)) {
			System.out.println("Total:" + (Precio1 * DescuentoVip) * 1.21 );
		
		} else if((Kilometros > 1000) && (Vip == 2)) {
			System.out.println("Total no vip: " + (Precio2 * 1.21));
		
		} else {
			System.out.println("Total vip: " + (Precio2 * DescuentoVip ) * 1.21 );
		}	
		sc.close();
	
	}

}
