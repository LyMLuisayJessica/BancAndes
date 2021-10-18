package uniandes.isis2304.bancAndes.negocio;

public class Intercuentas implements VOIntercuentas
{
	
	/* ****************************************************************
	 * 			Atributos
	 *****************************************************************/
	/**
	 * El identificador ÚNICO de los bares
	 */
	private long id;
	
	private String tipo;

	private String cuenta_relacionada;
	
	/* ****************************************************************
	 * 			Métodos 
	 *****************************************************************/
    /**
     * Constructor por defecto
     */
	public Intercuentas(long id, String tipo, String cuenta_relacionada) {
		this.id = id;
		this.tipo = tipo;
		this.cuenta_relacionada = cuenta_relacionada;
	}
	
	public Intercuentas() {
		this.id = 0;
		this.tipo = "";
		this.cuenta_relacionada = "";
	}

	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public String getCuenta_relacionada() {
		return cuenta_relacionada;
	}
	public void setCuenta_relacionada(String cuenta_relacionada) {
		this.cuenta_relacionada = cuenta_relacionada;
	}
	
	@Override
	public String toString() {
		return "Intercuentas [id=" + id + ", tipo=" + tipo + ", cuenta_relacionada=" + cuenta_relacionada + "]";
	}
}
