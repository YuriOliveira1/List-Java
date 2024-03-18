import java.util.Scanner;
public class Atv1 {
    public static void main(String[] args) {
        int number1,number2,maior;
        Scanner leia = new Scanner(System.in);
        number1 = leia.nextInt();
        number2 = leia.nextInt();
        leia.close();
        System.out.println("========");
        if (number1 > number2) {
            maior = number1;
            System.out.println("O maior numero é: "+maior);
        }else{
            maior = number2;
                System.out.println("O maior numero é: "+maior);
            }
        }
    }
