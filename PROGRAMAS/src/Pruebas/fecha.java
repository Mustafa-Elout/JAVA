package Pruebas;

public class fecha {
		
	private int dia;
	private int mes;
	private int año;
	
	public int getDia() {
		return dia;
	}
	public int getMes() {
		return mes;
	}
	public int getAño() {
		return año;
	}
	public void setDia(int dia) {
		this.dia = dia;
	}
	public void setMes(int mes) {
		this.mes = mes;
	}
	public void setAño(int año) {
		this.año = año;
	}

	public void imprimir() {
		System.out.printf("%d/%d/%d",dia,mes,año);
	}
	
	public fecha(int nuevoDia, int nuevoMes, int nuevoAño) {
		dia=nuevoDia;
		mes=nuevoMes;
		año=nuevoAño;
	}
	
	public boolean igualA(fecha otrafecha) {
		return(dia==otrafecha.dia)&&
			  (mes==otrafecha.mes)&&
			  (año==otrafecha.año);
	}

}
