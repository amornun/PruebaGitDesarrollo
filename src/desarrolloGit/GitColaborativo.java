package desarrolloGit;
import java.util.Scanner;

public class GitColaborativo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

        // Aquí hay que declarar como una constante ya que ese valor no se modifica durante la aplicación
        final double DESC_VIP = 0.95;

        // Cliente introduce los km
        System.out.println("Introduzca el numero de km que ha conducido: ");
        int km = sc.nextInt();

        // Cliente introduce si es vip o no
        System.out.println("Introduzca 1 si es VIP o 2 si no lo es: ");
        int vip = sc.nextInt();

        // Cálculo facturación y visualización del total
        double total = calcularFacturacion(km, vip, DESC_VIP);
        System.out.println("Total: " + total);

        sc.close();
    }

    // Método para calcular la facturación
    private static double calcularFacturacion(int km, int vip, double descVip) {
        double p1 = (km - 300) * 0.30 + 200;
        double p2 = (km - 1000) * 0.15 + (300 + 200);

        if (km < 300) {
            return (vip == 1) ? 200 * descVip : 200;
        } else if (km >= 300 && km <= 1000) {
            return (vip == 1) ? (p1 * descVip) * 1.21 : p1 * 1.21;
        } else {
            return (vip == 1) ? (p2 * descVip) * 1.21 : p2 * 1.21;
        }

}
