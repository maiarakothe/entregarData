package entregarData;

import java.util.Locale;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Datas {

	public static void main(String[] args) {
		
		Data();

	}

	public static void Data() {
		 Locale.setDefault(new Locale("pt", "BR"));
	     Calendar calendario = Calendar.getInstance();
	     SimpleDateFormat data = new SimpleDateFormat("EEEE, dd 'de' MMMM 'de' yyyy");
	     SimpleDateFormat horas = new SimpleDateFormat("HH 'horas e' mm 'minutos'");
	        
	     String dataFormatada = data.format(calendario.getTime());
	     String horaFormatada = horas.format(calendario.getTime());
	        
	     System.out.printf("Hoje é %s e agora são %s.%n", dataFormatada, horaFormatada);
	}

}
