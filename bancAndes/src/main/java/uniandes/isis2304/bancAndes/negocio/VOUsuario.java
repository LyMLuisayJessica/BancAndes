package uniandes.isis2304.bancAndes.negocio;

public interface VOUsuario {
	
	public String getLogin();


	public String getPalabra_Clave();


	public String getRol();


	public String getNombre();

	
	public String getTipo_Doc_Identificacion();
	
	
	public Integer getNumero_Doc_Identificacion();

	
	public String getDireccion_Fisica();
	

	public String getDireccion_Electronica();

	public Integer getTelefono();

	public String getNacionalidad();

	public String getCiudad();

	public String getDepartamento();

	public Integer getCodigo_Postal();

	public String getBancAndes();

	public String toString();
	
}
