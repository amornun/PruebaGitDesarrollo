package desarrolloGit;
import java.util.Scanner;

public class GitColaborativo {

	public static void main(String[] args) {
		var sc = new Scanner(System.in);
		
		final double descvip = 0.95;
		final double iva = 1.21;
		final double preciobase = 200;
		
		//cliente introduce los km
		System.out.println("Introduzca el numero de km que ha conducido: ");
		double km = sc.nextDouble();
		
		//cliente introduce si es vip o no
		System.out.println("Introduzca 1 si es VIP o 2 si no lo es: ");
		int vip = sc.nextInt();
		
		//variables de tipo de facturacion
		double p1 = (km - 300) * 0.30 + (preciobase);
		double p2 = (km - 1000) * 0.15 + (300 + preciobase);
		
		//Cálculo facturación y visualización del total
		if((km < 300) && (vip == 1))
		System.out.println("Total:" + preciobase * descvip );
		
			else if((km < 300) && (vip == 2))
				System.out.println("Total: " + preciobase);
		
			else if((km >=300) && (km <= 1000) && (vip == 2 ))
				System.out.println("Total no vip: " + (p1 * iva));
		
			else if((km >= 300) && (km <= 1000) && (vip == 1))
				System.out.println("Total:" + (p1 * descvip) * iva );
		
			else if((km > 1000) && (vip == 2))
				System.out.println("Total no vip" + (p2 * iva));
		
			else if((km > 1000) && (vip == 1))
				System.out.println("Total vip: " + (p2 * descvip ) * iva );
		
				
				
		sc.close();
	
	}

}
