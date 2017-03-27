package br.com.models;

public class PadraoData {
    private Calendar dtCompleta = Calendar.getInstance();
	private DateFormat 	dtHoraForm = new SimpleDateFormat("dd/MM/yyyy HH:mm", new Locale("pt","br"));
	private DateFormat 	dtForm = new SimpleDateFormat("dd/MM/yyyy", new Locale("pt","br"));
	
	
	public void setDataDiaInteiro(String data){
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
