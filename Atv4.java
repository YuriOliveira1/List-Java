import java.util.Scanner;
public class Atv4 {
    public static void main(String[] args) {
        int nota1, nota2, nota3, media;
        Scanner ler = new Scanner(System.in);
        nota1 = ler.nextInt();
        nota2 = ler.nextInt();
        nota3 = ler.nextInt();
        ler.close();
        System.out.println("=======");
        media = (nota1 + nota2 + nota3) / 3;
        if (media >= 7) {
            System.out.println("Aluno Aprovado.");
        }else {
            System.out.println("Aluno Reprovado.");
            }
        }

    }