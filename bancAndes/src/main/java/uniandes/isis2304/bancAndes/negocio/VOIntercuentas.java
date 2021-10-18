package uniandes.isis2304.bancAndes.negocio;

public interface VOIntercuentas {
	public long getId();

	public String getTipo();
	
	public void setTipo(String tipo);
	
	public String getCuenta_relacionada();
	
	@Override
	public String toString();

}
