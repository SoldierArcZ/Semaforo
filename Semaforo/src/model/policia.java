package model;

public class policia {
	
	private String nombre="";
	private int rango=0;
	private String turno="";
	private double numeroPlaca=0;
	
	public policia(){
		nombre="";
		rango=0;
		turno="";
		numeroPlaca=0;
	}

	public policia(String nombre, int rango, String turno, double numeroPlaca) {
		this.nombre = nombre;
		this.rango = rango;
		this.turno = turno;
		this.numeroPlaca = numeroPlaca;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getRango() {
		return rango;
	}

	public void setRango(int rango) {
		this.rango = rango;
	}

	public String getTurno() {
		return turno;
	}

	public void setTurno(String turno) {
		this.turno = turno;
	}

	public double getNumeroPlaca() {
		return numeroPlaca;
	}

	public void setNumeroPlaca(double numeroPlaca) {
		this.numeroPlaca = numeroPlaca;
	}

	@Override
	public String toString() {
		return "policia [nombre=" + nombre + ", rango=" + rango + ", turno=" + turno + ", numeroPlaca=" + numeroPlaca
				+ "]";
	}
	
	

}
