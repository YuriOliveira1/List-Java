import java.text.DecimalFormat;
import java.util.Scanner;
public class Atv6 {
    public static void main(String[] args) {
        int kWh;
        Scanner ler = new Scanner(System.in);
        kWh = ler.nextInt();
        ler.close();
        double tarifa = (double) (kWh * 0.85);
        if (kWh <= 100) {
            double tarifafinal = (double) (tarifa - (tarifa * 0.15));
            System.out.println("O Valor da tarifa: R$ "+ new DecimalFormat(".##").format(tarifafinal));
        } else if (kWh <= 200) {
            double tarifafinal = (double) (tarifa - (tarifa * 0.10));
            System.out.println("O Valor da tarifa: R$ "+ new DecimalFormat(".##").format(tarifafinal));
        }else {
            System.out.println("O Valor da tarifa: R$ "+ new DecimalFormat(".##").format(tarifa));
        }

    }
}
