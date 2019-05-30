package dev.parresoft9.javareflection.clases;

public class Coche {
	
	
	private String matricula;
	private String descripcion;
	private int potencia;
	private String marca;
	private boolean empresa;
	
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
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public boolean isEmpresa() {
		return empresa;
	}
	public void setEmpresa(boolean empresa) {
		this.empresa = empresa;
	}
	
	public Coche(String matricula, String descripcion, int potencia, String marca, boolean empresa) {
		super();
		this.matricula = matricula;
		this.descripcion = descripcion;
		this.potencia = potencia;
		this.marca = marca;
		this.empresa = empresa;
	}

}
