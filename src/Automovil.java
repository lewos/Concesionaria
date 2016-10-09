
public abstract class Automovil {
	/*333333333333333333333333333333333333333333333333333333333333333333333333333333333333
	 * estos atributos no deberian ser protected? de esa manera lo prodrian ver los hijos?
	 * */
	private String marca;
	private String modelo;
	private String patente;
	private String color;
	private String estado;
	
	/*222222222222222222222222222222222222222222222222222222222222222222222222
	 * El constructor de una clase abstracta debe estar implementado de maneras diferente en c/hijo
	 * */	
	public Automovil(String marca, String modelo, String patente, String color) {
		super();
		this.marca = marca;
		this.modelo = modelo;
		this.patente = patente;
		this.color = color;
		this.estado="A la venta";
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
