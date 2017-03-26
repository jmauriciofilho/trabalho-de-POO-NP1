package br.com.Algoritimos;

import br.com.models.Data;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;

/**
 * Created by mauricio on 25/03/17.
 */
public class Uteis {

	public static String descobrirDiaDaSemana(Data data){
		try {
			String diaDaSemana = null;
			Calendar calendar = Calendar.getInstance();
			SimpleDateFormat simpleFormat = new SimpleDateFormat("dd/MM/yyyy");
			calendar.setTime(simpleFormat.parse(data.mostrarData()));
			int semana = calendar.get(Calendar.DAY_OF_WEEK);
			if (semana == 1){
				diaDaSemana = "Domingo";
			}else if (semana == 2){
				diaDaSemana = "Segunda";
			}else if (semana == 3){
				diaDaSemana = "Terça";
			}else if (semana == 4){
				diaDaSemana = "Quarta";
			}else if (semana == 5){
				diaDaSemana = "Quinta";
			}else if (semana == 6){
				diaDaSemana = "Sexta";
			}else if (semana == 7){
				diaDaSemana = "Sábado";
			}

			return diaDaSemana;
		}catch (ParseException e){
			e.printStackTrace();
			return null;
		}
	}
}
