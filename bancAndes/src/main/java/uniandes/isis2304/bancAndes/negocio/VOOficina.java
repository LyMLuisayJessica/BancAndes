package uniandes.isis2304.bancAndes.negocio;

public interface VOOficina {
	
	public String getNombre();

	public String getDireccion();

	public String getPuntos_de_atencion();

	public String getNombre_Banco();
	

	@Override
	public String toString();
}
