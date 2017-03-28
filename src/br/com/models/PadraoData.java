package br.com.models;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Locale;

/**
 * Created by zeky and mauricio on 11/03/17.
 */
public class PadraoData {
    private Calendar dtCompleta = Calendar.getInstance();
	private DateFormat 	dtHoraForm = new SimpleDateFormat("dd/MM/yyyy HH:mm", new Locale("pt","br"));
	private DateFormat 	dtForm = new SimpleDateFormat("dd/MM/yyyy", new Locale("pt","br"));
	private DateFormat horaForm = new SimpleDateFormat("HH:mm");
	
	public void setApenasData(String data){
		try {
            dtCompleta.setTime(dtForm.parse(data));
        } catch (ParseException e) {
            System.out.println("Formato errada de data/hora");
            e.getStackTrace();
        }
	}
	
	public void setDataHora(String diaMesAnoHoraMin){
		try {
            dtCompleta.setTime(dtHoraForm.parse(diaMesAnoHoraMin));
        } catch (ParseException e) {
            System.out.println("Formato errada de data/hora");
            e.getStackTrace();
        }
	}

	public String getApenasData(){
		return dtForm.format(dtCompleta.getTime());
	}

	public void setApenasHora(String horasMin){
		int h = Integer.parseInt(horasMin.substring(0,1));
		int m = Integer.parseInt(horasMin.substring(3,4));
		this.dtCompleta.set(Calendar.HOUR, h);
		this.dtCompleta.set(Calendar.MINUTE, m);
	}
	
	public String getApenasHora(){
		return dtCompleta.get(Calendar.HOUR)+":"+ dtCompleta.get(Calendar.MINUTE);
	}

	public String getDiaSemana(){
		String nomeDia=null;
		int dia = dtCompleta.get(Calendar.DAY_OF_WEEK);
		switch(dia){
		  case Calendar.SUNDAY: nomeDia = "Domingo";break;
		  case Calendar.MONDAY: nomeDia = "Segunda";break;
		  case Calendar.TUESDAY: nomeDia = "Terça";break;
		  case Calendar.WEDNESDAY: nomeDia = "Quarta";break;
		  case Calendar.THURSDAY: nomeDia = "Quinta";break;
		  case Calendar.FRIDAY: nomeDia = "Sexta";break;
		  case Calendar.SATURDAY: nomeDia = "sábado";break;
		}
		return nomeDia;
	}
	
	public String getMes(){
		String nomeMes=null;
		int mes = dtCompleta.get(Calendar.MONTH);
		switch(mes){
		  case Calendar.JANUARY: nomeMes = "Janeiro";break;
		  case Calendar.FEBRUARY: nomeMes = "Fevereiro";break;
		  case Calendar.MARCH: nomeMes = "Abril";break;
		  case Calendar.APRIL: nomeMes = "Março";break;
		  case Calendar.MAY: nomeMes = "Maio";break;
		  case Calendar.JULY: nomeMes = "Junho";break;
		  case Calendar.JUNE: nomeMes = "Julho";break;
		  case Calendar.AUGUST: nomeMes = "Agosto";break;
		  case Calendar.SEPTEMBER: nomeMes = "Setembro";break;
		  case Calendar.OCTOBER: nomeMes = "Outubro";break;
		  case Calendar.NOVEMBER: nomeMes = "Novembro";break;
		  case Calendar.DECEMBER: nomeMes = "Dezembro";break;
		  
		}
		return nomeMes;
	}


	
}
