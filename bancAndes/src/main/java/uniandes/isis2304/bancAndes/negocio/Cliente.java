package uniandes.isis2304.bancAndes.negocio;

public class Cliente implements VOCliente{
	
	private String login;
	
	/**
	 * El identificador de la bebida que es servida en el bar
	 */
	private String tipo_persona;

	public Cliente() {
		this.login = "";
		this.tipo_persona = "";
	}
	
	public Cliente(String login, String tipo_persona) {
		this.login = login;
		this.tipo_persona = tipo_persona;
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getTipo_persona() {
		return tipo_persona;
	}

	public void setTipo_persona(String tipo_persona) {
		this.tipo_persona = tipo_persona;
	}

	@Override
	public String toString() {
		return "Cliente [login=" + login + ", tipo_persona=" + tipo_persona + "]";
	}

	/* ****************************************************************
	 * 			Métodos
	 *****************************************************************/
	/**
	 * Constructor por defecto
	 */
	
}
