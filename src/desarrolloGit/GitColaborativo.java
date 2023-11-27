package desarrolloGit;

import java.util.Scanner;

public class GitColaborativo {

	public static void main(String[] args) {
		
		var sc = new Scanner(System.in);
		
		//cliente introduce los km  (Para que de conflicto)
		System.out.println("Introduzca el numero de km que ha conducido: ");
		int kmConducidos = sc.nextInt();
		
		//cliente introduce si es vip o no
		System.out.println("Introduzca 1 si es VIP o 2 si no lo es: ");
		int esVip = sc.nextInt();
		
		calculoFacturacion(kmConducidos, esVip);
		
		sc.close();
	
	}
	
	public static void calculoFacturacion(int kmConducidos, int esVip) {

		double descuentoVip = 0.95;
		
		//variables de tipo de facturacion
		double tipoFacturacion1 = (kmConducidos - 300) * 0.30 + (200);
		double tipoFacturacion2 = (kmConducidos - 1000) * 0.15 + (300 + 200);
		
		//Cálculo facturación y visualización del total
		if (kmConducidos < 300 && esVip == 1)
		System.out.println("Total:" + 200 * descuentoVip );
		
		else if (kmConducidos < 300 && esVip == 2)
		System.out.println("Total: " + 200);
		
		else if (kmConducidos >= 300 && kmConducidos <= 1000 && esVip == 2 )
		System.out.println("Total no vip: " + (tipoFacturacion1 * 1.21));
		
		else if (kmConducidos >= 300 && kmConducidos <= 1000 && esVip == 1)
		System.out.println("Total:" + (tipoFacturacion1 * 0.95) * 1.21 );
		
		else if (kmConducidos > 1000 && esVip == 2)
		System.out.println("Total no vip" + (tipoFacturacion2 * 1.21));
		
		else if (kmConducidos > 1000 && esVip == 1)
		System.out.println("Total vip: " + (tipoFacturacion2 * 0.95 ) * 1.21 );
				
	}

}
