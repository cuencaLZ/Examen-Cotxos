package org.mvpigs.Cotxox.conductor;

import java.util.ArrayList;

public class Conductor {
	private String nombre;
	private String modelo;
	private String matricula;
	private double valoracion;
	private double valoracionMedia;
	private ArrayList<Byte> valoraciones= new ArrayList();
	private boolean ocupado=false;
	
	public Conductor(){
		
	};
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public String getMatricula() {
		return matricula;
	}
	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	public double getValoracionMedia() {
		return valoracionMedia;
	}
	public void setValoracionMedia(double valoracionMedia) {
		this.valoracionMedia = valoracionMedia;
	}
	public ArrayList getValoraciones() {
		return valoraciones;
	}
	public void setValoraciones(ArrayList valoraciones) {
		this.valoraciones = valoraciones;
	}
	public void setValoracion(valoracion) {
		valoraciones.add(valoracion);
	}
	public boolean isOcupado() {
		return ocupado;
	}
	public void setOcupado(boolean ocupado) {
		this.ocupado = ocupado;
	}

	
}


