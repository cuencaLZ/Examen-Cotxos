package org.mvpigs.Cotxox.conductor;

import java.util.ArrayList;

public class Conductor {
	private String nombre;
	private String modelo;
	private String matricula;
	private double valoracionMedia;
	private ArrayList<Byte> valoraciones= new ArrayList();
	private boolean ocupado=false;
	
	public Conductor(){
		valoracionMedia=0;
		
	};
	
	public void setValoracion(byte valoracion) {
		double suma;
		this.valoraciones.add(valoracion);
		for (double numero:valoraciones) {
			 suma=suma+numero;
		}
		valoracionMedia=suma/valoraciones.size();
	}

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
		
	}
	public boolean isOcupado() {
		return ocupado;
	}
	public void setOcupado(boolean ocupado) {
		this.ocupado = ocupado;
	}

	
}


