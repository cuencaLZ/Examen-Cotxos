package org.mvpigs.Cotxox.tarifa;

import org.mvpigs.Cotxox.carrera.Carrera;

public class Tarifa{
	double costeMilla=1.35;
	double costeMinuto=0.35;
	double costeMinimo=5;
	double porcentajeComision=0.2;

	public double getCosteDistancia(double distancia){
		return  (distancia*costeMilla);
	}
	public double getCosteTiempo(double minutos){
		return (minutos*costeMinuto);
	}
	public double getCosteTotalEsperado(Carrera carrera){
		double Total=(getCosteDistancia(carrera.getDistancia())+getCosteTiempo(carrera.getTiempoEsperado()));
		if (Total<5) {
			return 5;
		}else {
			return Total;
		}
	}
}
