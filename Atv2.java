import java.util.Scanner;
public class Atv2 {
    public static void main(String[] args) {
        int number1, number2, number3, maior;
     Scanner ler = new Scanner(System.in);
     number1 = ler.nextInt();
     number2 = ler.nextInt();
     number3 = ler.nextInt();
     ler.close();
        System.out.println("========");
        if (number1 >= number2 && number1 >= number3) {
            maior = number1;
            System.out.println("O maior numero é: "+maior);
        }else if (number2 >= number1 && number2 >= number3) {
            maior = number2;
            System.out.println("O maior numero é: "+maior);
        }else{
            maior = number3;
            System.out.println("O maior numero é: "+maior);
            }
        }
    }
