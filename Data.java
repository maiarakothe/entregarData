package entregarData;

import java.time.LocalDate;
import java.time.Period;

public class Data {

    public static void main(String[] args) {
        contaTempo(4, 1, 2026);
    }

    public static void contaTempo(int dia, int mes, int ano) {
        LocalDate agora = LocalDate.now();
        LocalDate segundaData = LocalDate.of(ano, mes, dia);
        Period periodo = Period.between(agora, segundaData);

        System.out.println("Faltam " + periodo.getYears() + " anos, " + periodo.getMonths() + " meses e "
                + periodo.getDays() + " dias.");
    }
}
