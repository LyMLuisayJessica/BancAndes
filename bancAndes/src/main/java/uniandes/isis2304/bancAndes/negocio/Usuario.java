package uniandes.isis2304.bancAndes.negocio;

public class Usuario implements VOUsuario {
	
	private String login;
	private String palabra_Clave;
	private String rol;
	private String nombre;
	private String tipo_Doc_Identificacion;
	private Integer numero_Doc_Identificacion;
	private String direccion_Fisica;
	private String direccion_Electronica;
	private String telefono;
	private String nacionalidad;
	private String ciudad;
	private String departamento;
	private Integer codigo_Postal;
	private String bancAndes;
	
	
	public Usuario(String login, String palabra_Clave, String rol, String nombre, String tipo_Doc_Identificacion,
				Integer numero_Doc_Identificacion, String direccion_Fisica, String direccion_Electronica, String telefono,
				String nacionalidad, String ciudad, String departamento, Integer codigo_Postal, String bancAndes) {
			super();
			this.login = login;
			this.palabra_Clave = palabra_Clave;
			this.rol = rol;
			this.nombre = nombre;
			this.tipo_Doc_Identificacion = tipo_Doc_Identificacion;
			this.numero_Doc_Identificacion = numero_Doc_Identificacion;
			this.direccion_Fisica = direccion_Fisica;
			this.direccion_Electronica = direccion_Electronica;
			this.telefono = telefono;
			this.nacionalidad = nacionalidad;
			this.ciudad = ciudad;
			this.departamento = departamento;
			this.codigo_Postal = codigo_Postal;
			this.bancAndes = bancAndes;
		}


	public String getLogin() {
		return login;
	}


	public void setLogin(String login) {
		this.login = login;
	}


	public String getPalabra_Clave() {
		return palabra_Clave;
	}


	public void setPalabra_Clave(String palabra_Clave) {
		this.palabra_Clave = palabra_Clave;
	}


	public String getRol() {
		return rol;
	}


	public void setRol(String rol) {
		this.rol = rol;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public String getTipo_Doc_Identificacion() {
		return tipo_Doc_Identificacion;
	}


	public void setTipo_Doc_Identificacion(String tipo_Doc_Identificacion) {
		this.tipo_Doc_Identificacion = tipo_Doc_Identificacion;
	}


	public Integer getNumero_Doc_Identificacion() {
		return numero_Doc_Identificacion;
	}


	public void setNumero_Doc_Identificacion(Integer numero_Doc_Identificacion) {
		this.numero_Doc_Identificacion = numero_Doc_Identificacion;
	}


	public String getDireccion_Fisica() {
		return direccion_Fisica;
	}


	public void setDireccion_Fisica(String direccion_Fisica) {
		this.direccion_Fisica = direccion_Fisica;
	}


	public String getDireccion_Electronica() {
		return direccion_Electronica;
	}


	public void setDireccion_Electronica(String direccion_Electronica) {
		this.direccion_Electronica = direccion_Electronica;
	}


	public String getTelefono() {
		return telefono;
	}


	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}


	public String getNacionalidad() {
		return nacionalidad;
	}


	public void setNacionalidad(String nacionalidad) {
		this.nacionalidad = nacionalidad;
	}


	public String getCiudad() {
		return ciudad;
	}


	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}


	public String getDepartamento() {
		return departamento;
	}


	public void setDepartamento(String departamento) {
		this.departamento = departamento;
	}


	public Integer getCodigo_Postal() {
		return codigo_Postal;
	}


	public void setCodigo_Postal(Integer coigo_Postal) {
		this.codigo_Postal = coigo_Postal;
	}


	public String getBancAndes() {
		return bancAndes;
	}


	public void setBancAndes(String bancAndes) {
		this.bancAndes = bancAndes;
	}

	@Override
	public String toString() {
		return "Usuario [login=" + login + ", palabra_Clave=" + palabra_Clave + ", rol=" + rol + ", nombre=" + nombre
				+ ", tipo_Doc_Identificacion=" + tipo_Doc_Identificacion + ", numero_Doc_Identificacion="
				+ numero_Doc_Identificacion + ", direccion_Fisica=" + direccion_Fisica + ", direccion_Electronica="
				+ direccion_Electronica + ", telefono=" + telefono + ", nacionalidad=" + nacionalidad + ", ciudad="
				+ ciudad + ", departamento=" + departamento + ", coigo_Postal=" + codigo_Postal + ", bancAndes="
				+ bancAndes + "]";
	}
	
	
}
