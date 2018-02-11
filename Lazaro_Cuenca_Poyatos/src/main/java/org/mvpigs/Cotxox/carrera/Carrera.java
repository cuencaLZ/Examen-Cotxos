package org.mvpigs.Cotxox.carrera;

import org.mvpigs.Cotxox.tarifa.Tarifa;

public class Carrera {
	private double tiempoEsperado;
	private double tiempoCarrera;
	private double costeTotal;
	private double distancia;
	private String origen;
	private String destino;
	private String tarjetaCredito;
	private int propina=0;
	//private  conductor;
	public Carrera(String tarjetaCredito){
		this.tarjetaCredito=tarjetaCredito;
	}
	
	public Carrera() {
		
	}
	
	
	public double getDistancia() {
		return distancia;
	}
	public void setDistancia(double distancia) {
		this.distancia = distancia;
	}
	public String getOrigen() {
		return origen;
	}
	public void setOrigen(String origen) {
		this.origen = origen;
	}
	public String getDestino() {
		return destino;
	}
	public void setDestino(String destino) {
		this.destino = destino;
	}
	public Double getTiempoEsperado() {
		return tiempoEsperado;
	}
	public void setTiempoEsperado(int tiempoEsperado) {
		this.tiempoEsperado = tiempoEsperado;
	}
	public Double getTiempoCarrera() {
		return tiempoCarrera;
	}
	public void setTiempoCarrera(int tiempoCarrera) {
		this.tiempoCarrera = tiempoCarrera;
	}
	public double getCosteTotal() {
		return costeTotal;
	}
	public void setCosteTotal(double costeTotal) {
		this.costeTotal = costeTotal;
	}
	public String getTarjetaCredito() {
		return tarjetaCredito;
	}
	public void setTarjetaCredito(String tarjetaCredito) {
		this.tarjetaCredito = tarjetaCredito;
	}
	public double getCosteEsperado() {
		Tarifa coste = new Tarifa();
		return coste.getCosteTotalEsperado(this);}
	public void realizarPago(double pago) {
		this.costeTotal = pago;
	}
	public void recibirPropina(int propina) {
		this.propina=propina;
	}
}
