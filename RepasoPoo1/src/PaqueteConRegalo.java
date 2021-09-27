
public class PaqueteConRegalo extends Paquete {
	private Atraccion regalo;
	
	public PaqueteConRegalo(String nombre, Atraccion[] atracciones, Atraccion regalo) {
		super(nombre, atracciones);
		this.regalo = regalo;
	}

	@Override
	public int getCupo() {
		int posibleCupo = super.getCupo();
		
		if(posibleCupo > regalo.getCupo()) return regalo.getCupo();
		return posibleCupo;
	}
	
	@Override
	public int getEdadMin() {
		int posibleEdad = super.getEdadMin();
		
		if(posibleEdad < regalo.getEdadMin()) return regalo.getEdadMin();
		return posibleEdad;
	}
	
	@Override
	public int getAlturaMin() {
		int posibleAltura = super.getAlturaMin();
		
		if(posibleAltura < regalo.getAlturaMin()) return regalo.getAlturaMin();
		return posibleAltura;
	}
	
	@Override
	public void restarCupo() {
		super.restarCupo();
		this.regalo.restarCupo();
	}
}
