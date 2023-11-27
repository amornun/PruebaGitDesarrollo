package desarrolloGit;
import java.util.Scanner;

public class GitColaborativo {

	public static void main(String[] args) {
		var sc = new Scanner(System.in);
		//Añadimos las constante faltantes y las implementamos en el codigo en vez de números sueltos
		double descvip = 0.95;
		double cantidadFija=200;
		double limitKilometro=300;
		double costoAdicional=0.30;
		double limitKilometro2=1000;
		double costoAdicional2=0.15;
		double iva=1.21;
		
		//cliente introduce los km
		System.out.println("Introduzca el numero de km que ha conducido: ");
		int km = sc.nextInt();
		
		//cliente introduce si es vip o no
		System.out.println("Introduzca 1 si es VIP o 2 si no lo es: ");
		int vip = sc.nextInt();
		
		//variables de tipo de facturacion
		double p1 = (km - limitKilometro) * costoAdicional + (cantidadFija);
		double p2 = (km - limitKilometro2) * costoAdicional2 + (limitKilometro + cantidadFija);
		
		//Cálculo facturación y visualización del total
		if((km < limitKilometro) && (vip == 1))
		System.out.println("Total:" + cantidadFija * descvip );
		
		else if((km < limitKilometro) && (vip == 2))
		System.out.println("Total: " + cantidadFija);
		
		else if((km >=limitKilometro) && (km <= limitKilometro2) && (vip == 2 ))
		System.out.println("Total no vip: " + (p1 * iva));
		
		else if((km >= limitKilometro) && (km <= limitKilometro2) && (vip == 1))
		System.out.println("Total:" + (p1 * descvip) * iva );
		
		else if((km > limitKilometro2) && (vip == 2))
		System.out.println("Total no vip" + (p2 * iva));
		
		else if((km > limitKilometro2) && (vip == 1))
		System.out.println("Total vip: " + (p2 * descvip ) * iva );
			
		sc.close();
	
	}

}
