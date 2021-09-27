
public class PaquetePorcentual extends Paquete {
	private double descuento;
	
	public PaquetePorcentual(String nombre, Atraccion[] atracciones, double descuento) {
		super(nombre, atracciones);
		this.descuento = descuento;
	}
	
	@Override
	public double getPrecio() {
		return super.getPrecio() * (1 - this.descuento);
	}
}
