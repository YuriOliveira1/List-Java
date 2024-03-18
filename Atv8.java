import java.util.Scanner;
public class Atv8 {
    public static void main(String[] args) {
        String classificacao;
        int salario, bonus;
        Scanner ler = new Scanner(System.in);
        salario = ler.nextInt();
        ler.nextLine(); // limpar buffer
        classificacao = ler.nextLine();
        System.out.println("=======");
        switch (classificacao) {
            case "A":
                bonus = (int) (salario * 0.20);
                System.out.println("Valor do bônus: R$ "+bonus);
                break;
            case "B":
                bonus = (int) (salario * 0.15);
                System.out.println("Valor do bônus: R$ "+bonus);
                break;
            case "C":
                bonus = (int) (salario * 0.10);
                System.out.println("Valor do bônus: R$ "+bonus);
                break;
            case "D":
                bonus = (int) (salario * 0.05);
                System.out.println("Valor do bônus: R$ "+bonus);
                break;
            case "E":
                bonus = (int) (salario * 0.02);
                System.out.println("Valor do bônus: R$ "+bonus);
                break;
            default:
                bonus = 0;
                System.out.println("Valor do bônus: R$ "+bonus);
                break;
        }
    }
}
