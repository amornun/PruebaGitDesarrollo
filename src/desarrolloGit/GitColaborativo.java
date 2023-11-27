package desarrolloGit;

import java.util.Scanner;

public class GitColaborativo {

	public static void main(String[] args) {
		var sc = new Scanner(System.in);

		// constantes
		final double DESCVIP = 0.95;
		final double IVA = 1.21;
		final int PRIMEROSTRESCIENTOSK = 200;
		final double MONTO_ADICIONAL = 0.15;
		final double COSTE_ADICIONAL = 0.30;
		final int MIL = 1000;
		final int TRESCIENTOS = 300;

		// cliente introduce los km
		System.out.println("Introduzca el numero de km que ha conducido: ");
		int km = sc.nextInt();

		// variables de tipo de facturacion

		double p1 = (km - TRESCIENTOS) * COSTE_ADICIONAL + (PRIMEROSTRESCIENTOSK);
		double p2 = (km - MIL) * MONTO_ADICIONAL + (TRESCIENTOS + PRIMEROSTRESCIENTOSK);

		// cliente introduce si es vip o no
		System.out.println("Introduzca 1 si es VIP o 2 si no lo es: ");
		int vip = sc.nextInt();

		// Cálculo facturación y visualización del total
		if ((km < TRESCIENTOS) && (vip == 1))
			System.out.println("Total:" + PRIMEROSTRESCIENTOSK * DESCVIP);

		else if ((km < TRESCIENTOS) && (vip == 2))
			System.out.println("Total: " + PRIMEROSTRESCIENTOSK);

		else if ((km >= TRESCIENTOS) && (km <= MIL) && (vip == 2))
			System.out.println("Total no vip: " + (p1 * IVA));

		else if ((km >= TRESCIENTOS) && (km <= MIL) && (vip == 1))
			System.out.println("Total:" + (p1 * DESCVIP) * IVA);

		else if ((km > MIL) && (vip == 2))
			System.out.println("Total no vip" + (p2 * IVA));

		else if ((km > MIL) && (vip == 1))
			System.out.println("Total vip: " + (p2 * DESCVIP) * IVA);

		sc.close();

	}

}
