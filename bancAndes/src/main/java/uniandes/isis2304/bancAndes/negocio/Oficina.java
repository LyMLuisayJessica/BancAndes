package uniandes.isis2304.bancAndes.negocio;

public class Oficina {
	

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
	private String puntos_de_atencion;
	
	private String nombre_banco;
	
	public Oficina(String nombre, String direccion, String puntos_de_atencion, String nombre_banco) {
		this.nombre = nombre;
		this.direccion = direccion;
		this.puntos_de_atencion = puntos_de_atencion;
		this.nombre_banco = nombre_banco;
	}
	
	
	/**
	 * Constructor por defecto
	 */
	public Oficina() {
		this.nombre = "";
		this.direccion = "";
		this.puntos_de_atencion = "";
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


	public String getPuntos_de_atencion() {
		return puntos_de_atencion;
	}


	public void setPuntos_de_atencion(String puntos_de_atencion) {
		this.puntos_de_atencion = puntos_de_atencion;
	}


	public String getNombre_banco() {
		return nombre_banco;
	}


	public void setNombre_banco(String nombre_banco) {
		this.nombre_banco = nombre_banco;
	}


	@Override
	public String toString() {
		return "Oficina [nombre=" + nombre + ", direccion=" + direccion + ", puntos de atencion=" + puntos_de_atencion
				+ ", nombre banco=" + nombre_banco + "]";
	}
	
}
