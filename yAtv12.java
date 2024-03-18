import java.time.LocalDate;
import java.time.Period;
import java.time.chrono.ChronoLocalDateTime;
import  java.util.Scanner;
import  java.time.format.DateTimeFormatter;
import java.time.LocalDateTime;
public class yAtv12 {
    public static void main(String[] args) {
        String data;
        Scanner ler = new Scanner(System.in);
        data = ler.nextLine();
        System.out.println("========");

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        LocalDate dataNascimento;
        try {
            dataNascimento = LocalDate.parse(data, formatter);
        } catch (Exception e) {
            System.out.println("Data de nascimento inválida.");
            return;
        }

        LocalDateTime dataatual = LocalDateTime.now();


        Period periodo = Period.between(dataNascimento, LocalDate.from(dataatual));
        int anos = periodo.getYears();

        if (anos <= 10) {
            System.out.println("O atleta tem " +anos+" anos e está na categoria Infantil");
        } else if (anos <= 17) {
            System.out.println("O atleta tem " +anos+" anos e está na categoria Juvenil");
        } else if (anos <= 59) {
            System.out.println("O atleta tem " +anos+" anos e está na categoria Adulto");
        } else if (anos > 60) {
            System.out.println("O atleta tem " +anos+" anos e está na categoria Sênior");
        }

    }
}
