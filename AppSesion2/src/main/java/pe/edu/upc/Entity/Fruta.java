package pe.edu.upc.Entity;

public class Fruta {

	
	//atributos de instancia , sus valores van a cambiar por cada fruta que tenga
	private String nombre;
	private String color;
	private String sabor;
	private boolean PuedoHacerJugo;
	
	//no se necesita crear un mtodo de acceso , atributos de clase: el valor no depende del objeto
	public static String LugarOrigen ="UPC";
	

	//constructor
	public Fruta() {
	
		this.nombre = "Indefinido";
		this.color = "S/C";
		this.sabor = "S/C";
		this.PuedoHacerJugo = false;
	}
	
	//getters and setters

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getSabor() {
		return sabor;
	}

	public void setSabor(String sabor) {
		this.sabor = sabor;
	}

	public boolean isPuedoHacerJugo() {
		return PuedoHacerJugo;
	}

	public void setPuedoHacerJugo(boolean puedoHacerJugo) {
		PuedoHacerJugo = puedoHacerJugo;
	}

	public Fruta(String nombre, String color, String sabor) {
		super(); //Heredar constructor clase padre
		this.nombre = nombre; //this sirve para hacer referencia y para hacer referncia a atributos de instancia
		this.color = color;
		this.sabor = sabor;
		this.PuedoHacerJugo = false ;
	}

	
	//sobreescritura de metodos heredados
	@Override
	public String toString() {
		return "Fruta [nombre=" + nombre + ", color=" + color + ", sabor=" + sabor + ", PuedoHacerJugo="
				+ PuedoHacerJugo + "]";
	}
	

	
}
