package desarrolloGit;
import java.util.Scanner;

public class GitColaborativo {

	public static void main(String[] args) {
		var sc = new Scanner(System.in);
		
		double descvip = 0.95;
		
		//cliente introduce los km
		System.out.println("Introduzca el numero de km que ha conducido: ");
		int km = sc.nextInt();
		
		//cliente introduce si es vip o no
		System.out.println("Introduzca 1 si es VIP o 2 si no lo es: ");
		int vip = sc.nextInt();
		
		//variables de tipo de facturacion
		double tarifa1 = (km - 300) * 0.30 + (200);
		double tarifa2 = (km - 1000) * 0.15 + (300 + 200);
		
		// variables km
		int variableKm1 = 1000;
		int variableKm2 = 300;

		//Cálculo facturación y visualización del total
		if((km < variableKm2) && (vip == 1))
		System.out.println("Total:" + 200 * descvip );
		
		else if((km < variableKm2) && (vip == 2))
		System.out.println("Total: " + 200);
		
		else if((km >=variableKm2) && (km <= variableKm1) && (vip == 2 ))
		System.out.println("Total no vip: " + (tarifa1 * 1.21));
		
		else if((km >= variableKm2) && (km <= variableKm1) && (vip == 1))
		System.out.println("Total:" + (tarifa1 * 0.95) * 1.21 );
		
		else if((km > variableKm1) && (vip == 2))
		System.out.println("Total no vip" + (tarifa2 * 1.21));
		
		else if((km > variableKm1) && (vip == 1))
		System.out.println("Total vip: " + (tarifa2 * 0.95 ) * 1.21 );
			
		sc.close();
	
	}

}
