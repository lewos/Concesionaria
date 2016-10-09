import java.sql.Date;
import java.util.Calendar;

public class Venta {
	
	private Date fecha;
	private String nombre;
	private String apellido;
	private String domicilio;
	private Automovil automovil;
	private float importe;
	private String formaPago;
	
	public Venta(String nombre, String apellido, String domicilio, Automovil automovil, float importe,
			String formaPago) {
		super();
		Calendar cal = Calendar.getInstance();
		this.fecha= (Date) cal.getTime();
		this.nombre = nombre;
		this.apellido = apellido;
		this.domicilio = domicilio;
		this.automovil = automovil;
		this.importe = importe;
		this.formaPago = formaPago;
	}

	public Date getFecha() {
		return fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getDomicilio() {
		return domicilio;
	}

	public void setDomicilio(String domicilio) {
		this.domicilio = domicilio;
	}

	public Automovil getAutomovil() {
		return automovil;
	}

	public void setAutomovil(Automovil automovil) {
		this.automovil = automovil;
	}

	public float getImporte() {
		return importe;
	}

	public void setImporte(float importe) {
		this.importe = importe;
	}

	public String getFormaPago() {
		return formaPago;
	}

	public void setFormaPago(String formaPago) {
		this.formaPago = formaPago;
	}
	
	
	

}
