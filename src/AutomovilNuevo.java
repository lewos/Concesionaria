
public class AutomovilNuevo extends Automovil{
	
	private float precioBase;
	private float costoPatentamiento;
	private float costoFlete;	



	public AutomovilNuevo(String marca, String modelo, String patente, String color, float precioBase,
			float costoPatentamiento, float costoFlete) {
		
		super(marca, modelo, patente, color);
		this.precioBase = precioBase;
		this.costoPatentamiento= costoPatentamiento;
		this.costoFlete=costoFlete;
	}

	@Override
	public float calcularPrecioVenta() {
		float precioFinal = precioBase+costoFlete+costoPatentamiento;
		return precioFinal;
	}



	public float getPrecioBase() {
		return precioBase;
	}



	public void setPrecioBase(float precioBase) {
		this.precioBase = precioBase;
	}



	public float getCostoPatentamiento() {
		return costoPatentamiento;
	}



	public void setCostoPatentamiento(float costoPatentamiento) {
		this.costoPatentamiento = costoPatentamiento;
	}



	public float getCostoFlete() {
		return costoFlete;
	}



	public void setCostoFlete(float costoFlete) {
		this.costoFlete = costoFlete;
	}
	
	

}
