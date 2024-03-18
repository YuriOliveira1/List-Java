import java.util.Scanner;

public class yAtv10 {
    public static void main(String[] args) {
        String destino, preferencia; // Destino da Viagem, Preferencia = Rapida, Barata, Menos Escala
        Scanner ler = new Scanner(System.in);
        destino = ler.nextLine().toLowerCase();
        preferencia = ler.nextLine().toLowerCase();
        System.out.println("========");

        switch (destino) {
            case "paris":
                if (preferencia.equals("rapida")) {
                    System.out.println("Rota escolhida: Duração 7h - Custo R$ 900,00 - 1 escala");
                }
                if (preferencia.equals("barata")) {
                    System.out.println("Rota escolhida: Duração 12h - Custo R$ 750,00 - 2 escala");
                }
                if (preferencia.equals("menos escala")) {
                    System.out.println("Rota escolhida: Duração 10h - Custo R$ 850,00 - 1 escala");
                }
                break;
            case "nova york":
                if (preferencia.equals("rapida")) {
                    System.out.println("Rota escolhida: Duração 15h - Custo R$ 650,00 - 3 escala");
                }
                if (preferencia.equals("barata")) {
                    System.out.println("Rota escolhida: Duração 20h - Custo R$ 500,00 - 4 escala");
                }
                if (preferencia.equals("menos escala")) {
                    System.out.println("Rota escolhida: Duração 18h - Custo R$ 550,00 - 3 escala");
                }
                break;
            case "tóquio":
                if (preferencia.equals("rapida")) {
                    System.out.println("Rota escolhida: Duração 20h - Custo R$ 1200,00 - Direto");
                }
                if (preferencia.equals("barata")) {
                    System.out.println("Rota escolhida: Duração 25h - Custo R$ 1000,00 - 1 escala");
                }
                if (preferencia.equals("menos escala")) {
                    System.out.println("Rota escolhida: Duração 22h - Custo R$ 1100,00 - 1 escala");
                }
                break;
        }

        if (!destino.equals("paris") && !destino.equals("nova york") && !destino.equals("tóquio")) {
            System.out.println("Destino Indisponivel");

        } else if (!preferencia.equals("rapida") && !preferencia.equals("barata") && !preferencia.equals("menos escala")) {
            System.out.println("Preferencia não Disponivel");
        }
    }
}