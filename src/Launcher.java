import java.util.Random;

import model.products.Fabrica;
import model.products.CarroClasico;
import model.products.CarroDeportivo;
import model.products.alpina.MercedezBenz;
import model.products.colanta.Audi;

public class Launcher {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
			Fabrica f = null;
			
			Random r = new Random();
			int i   = r.nextInt(10);
			
			System.out.println(i);
			
			if(i<5){
				f= new MercedezBenz();
			}else {
				f = new Audi();
			}
			CarroClasico q = f.getClasico();
			CarroDeportivo y = f.getDeportivo();
			
			System.out.println(q.darMensaje());
			System.out.println(y.darMensaje());

	}

}
