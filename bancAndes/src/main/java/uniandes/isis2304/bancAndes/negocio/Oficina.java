package uniandes.isis2304.bancAndes.negocio;

public class Oficina implements VOOficina{
	

	/* ****************************************************************
	 * 			Atributos
	 *****************************************************************/
	/**
	 * El identificador del bebedor que realiza la visita
	 */
	private String nombre;
	
	/**
	 * El identificador del bar visitado
	 */
	private String direccion;
	
	/**
	 * La fecha de la visita
	 */
	
	private String nombre_banco;
	
	public Oficina(String nombre, String direccion, String nombre_banco) {
		this.nombre = nombre;
		this.direccion = direccion;
		this.nombre_banco = nombre_banco;
	}
	
	
	/**
	 * Constructor por defecto
	 */
	public Oficina() {
		this.nombre = "";
		this.direccion = "";
		this.nombre_banco = "";
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public String getDireccion() {
		return direccion;
	}


	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}


	public String getNombre_banco() {
		return nombre_banco;
	}


	public void setNombre_banco(String nombre_banco) {
		this.nombre_banco = nombre_banco;
	}


	@Override
	public String toString() {
		return "Oficina [nombre=" + nombre + ", direccion=" + direccion 
				+ ", nombre banco=" + nombre_banco + "]";
	}


	@Override
	public String getNombre_Banco() {
		// TODO Auto-generated method stub
		return null;
	}
	
}
