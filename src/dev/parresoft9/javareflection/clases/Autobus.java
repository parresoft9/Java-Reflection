package dev.parresoft9.javareflection.clases;

public class Autobus {
	
	private String matricula;
	private String descripcion;
	private int potencia;
	private int plazas;
	public String getMatricula() {
		return matricula;
	}
	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public int getPotencia() {
		return potencia;
	}
	public void setPotencia(int potencia) {
		this.potencia = potencia;
	}
	public int getPlazas() {
		return plazas;
	}
	public void setPlazas(int plazas) {
		this.plazas = plazas;
	}
	public Autobus(String matricula, String descripcion, int potencia, int plazas) {
		super();
		this.matricula = matricula;
		this.descripcion = descripcion;
		this.potencia = potencia;
		this.plazas = plazas;
	}
	
	

}
