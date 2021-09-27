
public class Visitante {
	private String nombre;
	private double dinero;
	private int edad;
	private int altura;
	
	public Visitante(String nombre, double presupuesto, int edad, int altura) {
		this.nombre = nombre;
		this.dinero = presupuesto;
		this.edad = edad;
		this.altura = altura;
	}
	
	public double getDinero() {
		return this.dinero;
	}
	
	public void reservar(Catalogable aReservar) {
		this.dinero -= aReservar.getPrecio();
		// agregar a misReservas
		aReservar.restarCupo();
	}
	
	public boolean puedeReservar(Catalogable aReservar) {
		if(aReservar == null) return false;
		
		return dinero >= aReservar.getPrecio() 
				&& altura >= aReservar.getAlturaMin()
				&& edad >= aReservar.getEdadMin();
	}
}
