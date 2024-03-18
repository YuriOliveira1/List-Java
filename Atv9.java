import java.util.Scanner;
public class Atv9 {
    public static void main(String[] args) {
        String classificacao;
        int salario, anos, bonus, salariototal; // Salario do Funcionario, Anos Trabalhado, e Bonus
        Scanner ler = new Scanner(System.in);
        salario = ler.nextInt();
        ler.nextLine(); // Limpa Buffer
        classificacao = ler.nextLine();
        anos = ler.nextInt();
        System.out.println("=======");
        if (classificacao.equals("A")) {
            bonus = (int) (salario * 0.20);
            if (anos > 5) {
                salariototal = (int) (bonus + (salario * 0.05));
                System.out.println("Valor do bônus: R$ "+salariototal);

                if (classificacao.equals("B")) {
                    bonus = (int) (salario * 0.15);
                    if (anos > 5) {
                        salariototal = (int) (bonus + (salario * 0.05));
                        System.out.println("Valor do bônus: R$ "+salariototal);

                        if (classificacao.equals("C")) {
                            bonus = (int) (salario * 0.10);
                            if (anos > 5) {
                                salariototal = (int) (bonus + (salario * 0.05));
                                System.out.println("Valor do bônus: R$ "+salariototal);

                                if (classificacao.equals("D")) {
                                    bonus = (int) (salario * 0.05);
                                    if (anos > 5) {
                                        salariototal = (int) (bonus + (salario * 0.05));
                                        System.out.println("Valor do bônus: R$ "+salariototal);

                                        if (classificacao.equals("E")) {
                                            bonus = (int) (salario * 0.02);
                                            if (anos > 5) {
                                                salariototal = (int) (bonus + (salario * 0.05));
                                                System.out.println("Valor do bônus: R$ "+salariototal);

                                            }else{
                                                    bonus = 0;
                                                    if (anos > 5) {
                                                        salariototal = (int) (bonus + (salario * 0.05));
                                                        System.out.println("Valor do bônus: R$ "+salariototal);
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }
