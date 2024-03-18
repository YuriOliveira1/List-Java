import java.util.Scanner;
public class yAtv11 {
    public static void main(String[] args) {
        String assento, preferencia; // Assento: ‘Janela’, ‘Corredor’ ou ‘Meio’ - Preferencia: ‘Normal’ ou ‘Espaço Extra’.
        Scanner ler = new Scanner(System.in);
        assento = ler.nextLine().toLowerCase();
        preferencia = ler.nextLine().toLowerCase();
        System.out.println("==========");

        switch (assento) {
            case "janela":
                if (preferencia.equals("normal")) {
                    System.out.println("Assento escolhido: Janela - Normal - Custo R$ 300,00");
                } else if (preferencia.equals("espaço extra")) {
                    System.out.println("Assento escolhido: Janela - Espaço Extra - Custo R$ 350,00");
                }
                break;
            case "corredor":
                if (preferencia.equals("normal")) {
                    System.out.println("Assento escolhido: Corredor - Normal - Custo R$ 280,00");
                } else if (preferencia.equals("espaço extra")) {
                    System.out.println("Assento escolhido: Corredor - Espaço Central - Custo R$ 330,00");
                }
                break;
        case "meio":
            if (preferencia.equals("normal")) {
                System.out.println("Assento escolhido: Meio - Normal - Custo R$ 250,00");
            }else if (preferencia.equals("espaço extra")){
                System.out.println("Assento escolhido: Meio - Espaço Extra - Custo R$ 300,00");
            }
            break;
        }
        if (!assento.equals("janela") && (!assento.equals("corredor") && (!assento.equals("meio")))) {
            System.out.println("Vazio");
        }else if (!preferencia.equals("normal") && (!preferencia.equals("espaço extra"))){
            System.out.println("Vazio");
        }
    }
}





