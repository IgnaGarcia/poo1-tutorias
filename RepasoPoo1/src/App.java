
public class App {
	
	public static void main(String[] args) {
		
		Visitante v1 = new Visitante("Nacho", 100, 22, 175);
		Visitante v2 = new Visitante("Pepe", 150, 10, 110);
		Visitante v3 = new Visitante("Lucia", 150, 15, 120);

		
//		Catalogable[] catalogo = new Catalogable[30];
		Atraccion a1 = new Atraccion("Montaña Rusa", 75, 2, 15, 130, TipoAtraccion.ADRENALINA);
		Atraccion a2 = new Atraccion("Barco Pirata", 40, 20, 12, 100, TipoAtraccion.ADRENALINA);
		Atraccion a3 = new Atraccion("Calesita", 30, 15, 3, 0, TipoAtraccion.INFANTIL);
		Atraccion a4 = new Atraccion("Trencito", 15, 10, 3, 0, TipoAtraccion.INFANTIL);
		Atraccion a5 = new Atraccion("Super Tobogan", 50, 1, 12, 100, TipoAtraccion.ACUATICO);
		Atraccion a6 = new Atraccion("Pileta", 75, 10, 5, 60, TipoAtraccion.ACUATICO);


		Atraccion[] paraP1 = {a5, a6};
		Paquete algo = new Paquete("dale", paraP1);
		
		Catalogable p1 = new PaquetePorcentual("Acuatico",  paraP1, 0.5); 

		Atraccion[] paraP2 = {a3, a4};
		Catalogable p2 = new PaqueteConRegalo("Infantil",  paraP2, a6);
		
		Atraccion[] paraP3 = {a1, a2};
		Catalogable p3 = new PaquetePrecioFijo("Adrenalina",  paraP3, 100);

		
		System.out.println("true " + v1.puedeReservar(p3));
		System.out.println("false " + v2.puedeReservar(p3));
		System.out.println("false " + v2.puedeReservar(a2));
		System.out.println("false " + v3.puedeReservar(a1));
		
		v1.reservar(a5);
		System.out.println(a5.getCupo() == 0);
		System.out.println(v1.getDinero());
		

	}
}
