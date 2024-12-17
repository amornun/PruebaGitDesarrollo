package desarrolloGit;
import java.util.Scanner;

public class GitColaborativo {

	public static void main(String[] args) {
		//comentario añadido al inicio de la declaración de variables
		var sc = new Scanner(System.in);
		
		final double iva = 1.21;
		final double descvip = 0.95;
		final double costeAdicional1 = 0.30;
		final double costeAdicional2 = 0.15;
		final int sobreKilometros1 = 300;
		final int sobreKilometros2 = 1000;
		
		//cliente introduce los km
		System.out.println("Introduzca el numero de km que ha conducido: ");
		int km = sc.nextInt();
		
		//cliente introduce si es vip o no
		System.out.println("Introduzca 1 si es VIP o 2 si no lo es: ");
		int vip = sc.nextInt();
		
		//variables de tipo de facturacion
		double p1 = (km - sobreKilometros1) * costeAdicional1 + (200);
		double p2 = (km - sobreKilometros2) * costeAdicional2 + (300 + 200);
		
		//(if y else)Cálculo facturación y visualización del total
		if((km < sobreKilometros1) && (vip == 1))
		System.out.println("Total:" + 200 * descvip );
		
		//Si el cliente no es Vip y es menos de 300 km
		else if((km < sobreKilometros1) && (vip == 2))
		System.out.println("Total: " + 200);
		
		//Si el cliente no es vip y sobrepasa los 300 km pero no los 1000 km
		else if((km >= sobreKilometros1) && (km <= sobreKilometros2) && (vip == 2 ))
		System.out.println("Total no vip: " + (p1 * iva));
		
		//Si el cliente es vip y sobrepasa los 300 km pero no los 1000 km
		else if((km >= sobreKilometros1 ) && (km <= sobreKilometros2) && (vip == 1))
		System.out.println("Total:" + (p1 * descvip) * iva );
		
		//Si el cliente no es vip y sobre pasa los 1000 km
		else if((km > sobreKilometros2) && (vip == 2))
		System.out.println("Total no vip" + (p2 * iva));
		
		//Si el cliente es vip y sobre pasa los 1000 km
		else if((km > sobreKilometros2) && (vip == 1))
		System.out.println("Total vip: " + (p2 * descvip) * iva );
			
		sc.close();
	
	}

}
