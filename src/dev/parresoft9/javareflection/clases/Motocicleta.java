package dev.parresoft9.javareflection.clases;

public class Motocicleta {
	

	private String matricula;
	private String descripcion;
	private int potencia;
	private String piloto;
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
	public String getPiloto() {
		return piloto;
	}
	public void setPiloto(String piloto) {
		this.piloto = piloto;
	}
	public Motocicleta(String matricula, String descripcion, int potencia, String piloto) {
		super();
		this.matricula = matricula;
		this.descripcion = descripcion;
		this.potencia = potencia;
		this.piloto = piloto;
	}
	
	
	


}
