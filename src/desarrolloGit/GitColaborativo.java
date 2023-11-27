package desarrolloGit;
import java.util.Scanner;

public class GitColaborativo {

	public static void main(String[] args) {
		var sc = new Scanner(System.in);
		double IVA=1.21;
		double descuentoVip = 0.95;
		
		//cliente introduce los km
		System.out.println("Introduzca el numero de km que ha conducido: ");
		int kmConducidos = sc.nextInt();
		
		//cliente introduce si es vip o no
		System.out.println("Introduzca 1 si es VIP o 2 si no lo es: ");
		int esVip = sc.nextInt();
		
		//variables de tipo de facturacion
		double tasa300 = (kmConducidos - 300) * 0.30 + (200);
		double tasa1000 = (kmConducidos - 1000) * 0.15 + (300 + 200);
		
		//Cálculo facturación y visualización del total
		if(kmConducidos < 300){
			switch(esVip) {
			case 1:
				System.out.println("Total:" + 200 * descuentoVip );
				break;
			case 2:
				System.out.println("Total: " + 200);
				break;
			}
		}
		else if(kmConducidos >=300){
			switch(esVip) {
			case 1:
				System.out.println("Total no vip: " + (tasa300 * descuentoVip) * IVA );
				break;
			case 2:
				System.out.println("Total:" + tasa300 * IVA );
				break;
			}
			
		}else if(kmConducidos > 1000){
			switch(esVip) {
			case 1:
				System.out.println("Total vip" + (tasa1000 * descuentoVip ) * IVA );
				break;
			case 2:
				System.out.println("Total no vip: " + tasa1000 * IVA );
				break;
			}
			
		
		

		
		
			
		sc.close();
	
	}

}
