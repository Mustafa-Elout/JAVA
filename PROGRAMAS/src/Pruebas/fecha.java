package Pruebas;

public class fecha {
		
	private int dia;
	private int mes;
	private int a�o;
	
	public int getDia() {
		return dia;
	}
	public int getMes() {
		return mes;
	}
	public int getA�o() {
		return a�o;
	}
	public void setDia(int dia) {
		this.dia = dia;
	}
	public void setMes(int mes) {
		this.mes = mes;
	}
	public void setA�o(int a�o) {
		this.a�o = a�o;
	}

	public void imprimir() {
		System.out.printf("%d/%d/%d",dia,mes,a�o);
	}
	
	public fecha(int nuevoDia, int nuevoMes, int nuevoA�o) {
		dia=nuevoDia;
		mes=nuevoMes;
		a�o=nuevoA�o;
	}
	
	public boolean igualA(fecha otrafecha) {
		return(dia==otrafecha.dia)&&
			  (mes==otrafecha.mes)&&
			  (a�o==otrafecha.a�o);
	}

}
