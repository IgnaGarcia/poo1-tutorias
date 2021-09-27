
public class Atraccion implements Catalogable{
	private String nombre;
	private double precio;
	private int cupo;
	private int edadMin;
	private int alturaMin;
	private TipoAtraccion tipo;

	public Atraccion(String nombre, double precio, int cupo, int edadMin, int alturaMin, TipoAtraccion tipo) {
		this.nombre = nombre;
		this.precio = precio;
		this.cupo = cupo;
		this.edadMin = edadMin;
		this.alturaMin = alturaMin;
		this.tipo = tipo;
	}

	@Override
	public double getPrecio() {
		return precio;
	}
	
	@Override
	public int getCupo() {
		return cupo;
	}
	
	@Override
	public int getEdadMin() {
		return edadMin;
	}
	
	@Override
	public int getAlturaMin() {
		return alturaMin;
	}

	@Override
	public void restarCupo() {
		this.cupo -= 1;
	}
}
