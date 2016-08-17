package pe.edu.upc.view;

import pe.edu.upc.Entity.Fruta;

public class appFruteria {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Fruta objFruta= new Fruta("Mango","Amarillo","Dulce");
		System.out.println(objFruta.toString());
		
		Fruta.LugarOrigen = "Otro lugar";
		System.out.println(Fruta.LugarOrigen);
	}

}
