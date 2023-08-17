package model.products.colanta;

import model.products.Fabrica;
import model.products.CarroClasico;
import model.products.CarroDeportivo;

public class Audi implements Fabrica {

	@Override
	public CarroDeportivo getDeportivo() {
		// TODO Auto-generated method stub
		return new Quattro();
	}

	@Override
	public CarroClasico getClasico() {
		// TODO Auto-generated method stub
		return new DKW();
	}


	
}
