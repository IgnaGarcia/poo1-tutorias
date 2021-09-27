
public class PaquetePrecioFijo extends Paquete {
	private double precio;
	
	public PaquetePrecioFijo(String nombre, Atraccion[] atracciones, double precio) {
		super(nombre, atracciones);
		this.precio = precio;
	}
	
	@Override
	public double getPrecio() {
		return precio;
	}
}
