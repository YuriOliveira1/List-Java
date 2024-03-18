import java.util.Scanner;
public class Atv7 {
    public static void main(String[] args) {
        String classificacao;
        int salario, bonus;
        Scanner ler = new Scanner(System.in);
        salario = ler.nextInt();
        ler.nextLine(); // Limpar o buffer
        classificacao = ler.nextLine();
        ler.close();
        if (classificacao.equals("A")) {
            bonus = (int) (salario * 0.20);
            System.out.println("Valor do bônus: R$ "+bonus);
        } else if (classificacao.equals("B")) {
            bonus = (int) (salario * 0.15);
            System.out.println("Valor do bônus: R$ "+bonus);
        } else if (classificacao.equals("C")) {
            bonus = (int) (salario * 0.10);
            System.out.println("Valor do bônus: R$ "+bonus);
        } else {
            System.out.println("Valor do bônus: R$ 0.00");
        }
        }
    }