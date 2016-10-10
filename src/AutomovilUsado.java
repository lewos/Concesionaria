
public class AutomovilUsado extends Automovil{
	
	private float valorMercado;
	private float comision;
	
	public AutomovilUsado(String marca, String modelo, String patente, String color, float valormercado, 
			float comision) {
		
		super(marca, modelo, patente, color);
		this.valorMercado= valormercado;
		this.comision = comision;
	}

	@Override
	public float calcularPrecioVenta() {
		float precioFinal = valorMercado+(comision*valorMercado);
		return precioFinal;
	}

	public float getValorMercado() {
		return valorMercado;
	}

	public void setValorMercado(float valorMercado) {
		this.valorMercado = valorMercado;
	}

	public float getComision() {
		return comision;
	}

	public void setComision(float comision) {
		this.comision = comision;
	}
	
	
	

}
