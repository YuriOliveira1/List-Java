import java.util.Scanner;
public class Atv5 {
    public static void main(String[] args) {
    int comprimento1, comprimento2, comprimento3;
    Scanner ler = new Scanner(System.in);
    comprimento1 = ler.nextInt();
    comprimento2 = ler.nextInt();
    comprimento3 = ler.nextInt();
    ler.close();
        System.out.println("========");
        if ((comprimento1 == comprimento2) && (comprimento1 == comprimento3)) {
            System.out.println("Triângulo Equilátero.");
        } else if (((comprimento1 == comprimento2) || (comprimento1 == comprimento3)) || (comprimento2 == comprimento3)) {
            System.out.println("Triângulo Isoceles.");
        }else {
            System.out.println("Triângulo Escaleno.");
        }
    }
}
