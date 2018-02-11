package org.mvpigs.Cotxox.poolconductores;

import java.util.ArrayList;

import org.mvpigs.Cotxox.conductor.Conductor;

public class PoolConductores {
	ArrayList<Conductor> poolconductores;

	public PoolConductores(ArrayList lista) {
		poolconductores = new ArrayList(lista);

	};

	public Conductor asignarConductor() {
		for (Conductor conductor : poolconductores) {
			if (conductor.isOcupado() == false) {
				conductor.setOcupado(true);
				return conductor;
			}

		}
		return null;

	};

}
