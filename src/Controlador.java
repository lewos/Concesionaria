import java.util.Iterator;
import java.util.List;

public class Controlador {
	private List<Automovil> automoviles;
	private List<Venta> ventas;
	
	public Controlador(List<Automovil> automoviles, List<Venta> ventas) {
		super();
		this.automoviles = automoviles;
		this.ventas = ventas;
	}
	/* 11111111111111111111111111111111111111111111111111111111111111111111111111111111
	 * creo que este metodo tiene que ser abstracto
	 * que sea CrearAuto
	 * dependiendo de lo que le pasan va a ser nuevo o usado
	*/
	public void crearAuto(String marca, String modelo, String patente, String color, float precio,
			float costoPatente, float flete){
		
		Automovil nuevoAuto = buscarAutomovil(patente);
		if(nuevoAuto==null){
			/*44444444444444444444444444444444444444444444444444444444444444444444444444444444444444
			 * de esta manera se crearia un nuevo auto?
			 * */
			nuevoAuto = new AutomovilNuevo(marca, modelo, patente, color, precio, costoPatente, flete);
		}
		automoviles.add(nuevoAuto);
	}
	private Automovil buscarAutomovil(String patente) {
		Automovil auto= null;
		Iterator<Automovil>iteratorAuto= automoviles.iterator();
		while(iteratorAuto.hasNext()){
			if(iteratorAuto.next().getPatente().equals(patente))
				auto = iteratorAuto.next();
		}
		return auto;
	}
	public void crearAuto(String marca, String modelo, String patente, String color,
			float precioMercado, float comision){
		Automovil nuevoAutoUsado = buscarAutomovil(patente);
		if(nuevoAutoUsado==null){
			/*44444444444444444444444444444444444444444444444444444444444444444444444444444444444444
			 * de esta manera se crearia un nuevo auto?
			 * */
			nuevoAutoUsado= new AutomovilUsado(marca, modelo, patente, color, precioMercado, comision);
		}
		automoviles.add(nuevoAutoUsado);
		
	}
	public void elimiarAuto(String patente){
		Automovil auto = buscarAutomovil(patente);
		auto.setEstado("BAJA");
	}
	
	public float calcularPrecioAuto(String patente){
		Automovil auto= null;
		Iterator<Automovil>iteratorAuto= automoviles.iterator();
		while(iteratorAuto.hasNext()){
			if(iteratorAuto.next().getPatente().equals(patente))
				auto = iteratorAuto.next();
		}
	return auto.calcularPrecioVenta();
	}
	
	public void venderAuto(String patente, String nombre, String apellido, String domicilio, 
			String formaPago){
		float precioFinal;
		Automovil auto = buscarAutomovil(patente);
		auto.setEstado("Vendido");
		precioFinal = auto.calcularPrecioVenta();	
		Venta venta = new Venta(nombre, apellido,domicilio,auto,precioFinal,formaPago);
		ventas.add(venta);
	}
	
	

}
