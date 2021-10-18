package uniandes.isis2304.bancAndes.negocio;

public class Unicuenta implements VOUnicuenta{
	/* ****************************************************************
	 * 			Atributos
	 *****************************************************************/
	/**
	 * El identificador ÚNICO de los bares
	 */
	private long id;
	
	private String tipo;

	/* ****************************************************************
	 * 			Métodos 
	 *****************************************************************/
    /**
     * Constructor por defecto
     */
	public Unicuenta() 
    {
    	this.id = 0;
		this.tipo = "";
		
	}

	public Unicuenta(long id, String tipo) {
		this.id = id;
		this.tipo = tipo;
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

	@Override
	public String toString() {
		return "Unicuenta [id=" + id + ", tipo=" + tipo + "]";
	}

  
}
