package pr1;

import java.util.Vector;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Mapa mapa = new Mapa();
		
		Auto a1 = new Auto();
		Auto a2 = new Auto();
		Auto a3 = new Auto();
		Auto a4 = new Auto();
		
		a1.setName("BMW");
		
		mapa.addAuto(a1);
		mapa.addAuto(a2);
		mapa.addAuto(a3);
		mapa.addAuto(a4);
		
		System.out.println(mapa.getPocetAuto());
		
		System.out.println(mapa.getAuto(0).getName());
		
		mapa.removeAuto(0);
		
		System.out.println(mapa.getAuto(0).getName());
		
		
		
	}

}
