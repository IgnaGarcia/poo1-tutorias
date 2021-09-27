public abstract class Paquete implements Catalogable {	
	 protected String nombre; 
	 protected Atraccion[] atracciones;
		 
	 public Paquete(String nombre, Atraccion[] atracciones) {
		this.nombre = nombre;
		this.atracciones = atracciones;
	}

	@Override
	public double getPrecio() {
		double sumaPrecios = 0;
		for(Atraccion a : this.atracciones) {
			sumaPrecios = sumaPrecios + a.getPrecio();
		}
		return sumaPrecios;
	}
	 
	@Override
	public int getCupo() {
		boolean flag = true;
		int cupoMin = 0;
		
		for(Atraccion a : this.atracciones) {
			if(flag) {
				cupoMin = a.getCupo();
				flag = false;
			}
			else if(cupoMin > a.getCupo()) {
				cupoMin = a.getCupo();
			}
		}
		
		return cupoMin;
	}
	
	@Override
	public int getEdadMin() {
		boolean flag = true;
		int edadMin = 0;
		
		for(Atraccion a : this.atracciones) {
			if(flag) {
				edadMin = a.getEdadMin();
				flag = false;
			}
			else if(edadMin < a.getEdadMin()) {
				edadMin = a.getEdadMin();
			}
		}
		
		return edadMin;
	}
	
	@Override
	public int getAlturaMin() {
		boolean flag = true;
		int alturaMin = 0;
		
		for(Atraccion a : this.atracciones) {
			if(flag) {
				alturaMin = a.getAlturaMin();
				flag = false;
			}
			else if(alturaMin < a.getAlturaMin()) {
				alturaMin = a.getAlturaMin();
			}
		}
		
		return alturaMin;
	}
	

	@Override
	public void restarCupo() {
		for(Atraccion a : this.atracciones) {
			a.restarCupo();
		}
	}
}
