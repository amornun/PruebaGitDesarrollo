package desarrolloGit;
import java.util.Scanner;

public class GitColaborativo {

	public static void main(String[] args) {
		var sc = new Scanner(System.in);
<<<<<<< HEAD
		
		final int CANTFIJA=200;
		final double DESCVIP = 0.95;
=======
		//comentario añadido al inicio de la declaración de variables
		double descvip = 0.95;
>>>>>>> c01f1561e61e422d7e03edf68cbc611e0d58423e
		
		//cliente introduce los km
		System.out.println("Introduzca el numero de km que ha conducido: ");
		int km = sc.nextInt();
		
		//cliente introduce si es vip o no
		System.out.println("Introduzca 1 si es VIP o 2 si no lo es: ");
		int vip = sc.nextInt();
		
		//variables de tipo de facturacion
		double p1 = (km - 300) * 0.30 + (CANTFIJA);
		double p2 = (km - 1000) * 0.15 + (300 + CANTFIJA);
		
		//Cálculo facturación y visualización del total
		if((km < 300) && (vip == 1)){
		System.out.println("Total:" + CANTFIJA * DESCVIP );
		}
		else if((km < 300) && (vip == 2)){
		System.out.println("Total: " + CANTFIJA);
		}
		else if((km >=300) && (km <= 1000) && (vip == 2 )){
		System.out.println("Total no vip: " + (p1 * 1.21));
		}
		else if((km >= 300) && (km <= 1000) && (vip == 1)){
		System.out.println("Total:" + (p1 * 0.95) * 1.21 );
		}
		else if((km > 1000) && (vip == 2)){
		System.out.println("Total no vip" + (p2 * 1.21));
		}
		else{
		System.out.println("Total vip: " + (p2 * 0.95 ) * 1.21 );
		}
		sc.close();
	
	}

}
