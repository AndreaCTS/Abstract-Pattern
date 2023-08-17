package model.products.alpina;

import model.products.Fabrica;
import model.products.CarroClasico;
import model.products.CarroDeportivo;

public class MercedezBenz implements Fabrica {


	@Override
	public CarroDeportivo getDeportivo() {
		// TODO Auto-generated method stub
		return new CLA();
	}

	@Override
	public CarroClasico getClasico() {
		// TODO Auto-generated method stub
		return new Gullwing();
	}
	

}
