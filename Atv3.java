import java.util.Scanner;
public class Atv3 {
    public static void main(String[] args) {
    String produto;
    float preco1, preco2, menorpreco;
    Scanner ler = new Scanner(System.in);
    produto = ler.nextLine();
    preco1 = ler.nextFloat();
    preco2 = ler.nextFloat();
    ler.close();
        System.out.println("=======");
    if(preco1 < preco2) {
        menorpreco = preco1;
        System.out.println("O produto "+produto+ " é mais barato no primeiro estabelicimento");
    }else{
        menorpreco = preco2;
        System.out.println("O produto "+produto+ " é mais barato no segundo estabelicimento");
          }
    }
}
