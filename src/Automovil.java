
public abstract class Automovil {

	/*2222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222
	 * preguntar de este protected static*/
	protected static int cantDeAutos=0;
	protected int idAuto;
	protected String marca;
	protected String modelo;
	protected String patente;
	protected String color;
	protected String estado;
	
	public Automovil(String marca, String modelo, String patente, String color) {
		this.marca = marca;
		this.modelo = modelo;
		this.patente = patente;
		this.color = color;
		this.estado="A la venta";
		cantDeAutos++;
		this.idAuto=cantDeAutos;
		
	}

	public abstract float calcularPrecioVenta();
	
	public void setEstado(String estado){
		this.estado= estado;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getPatente() {
		return patente;
	}

	public void setPatente(String patente) {
		this.patente = patente;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getEstado() {
		return estado;
	}
	

}
