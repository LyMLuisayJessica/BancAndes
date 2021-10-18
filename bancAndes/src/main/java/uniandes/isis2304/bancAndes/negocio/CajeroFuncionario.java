package uniandes.isis2304.bancAndes.negocio;

public class CajeroFuncionario implements VOCajeroFuncionario{

	/* ****************************************************************
	 * 			Atributos
	 *****************************************************************/
	/**
	 * El identificador ÚNICO de los bares
	 */
	private String login;

	private String oficina;
	
	private long cajero;
	
	public CajeroFuncionario() {
		this.login = "";
		this.oficina = "";
		this.cajero = 0;
	}

	public CajeroFuncionario(String login, String oficina, long cajero) {
		this.login = login;
		this.oficina = oficina;
		this.cajero = cajero;
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getOficina() {
		return oficina;
	}

	public void setOficina(String oficina) {
		this.oficina = oficina;
	}

	public long getCajero() {
		return cajero;
	}

	public void setCajero(long cajero) {
		this.cajero = cajero;
	}

	@Override
	public String toString() {
		return "CajeroFuncionario [login=" + login + ", oficina=" + oficina + ", cajero=" + cajero + "]";
	}
	
	/* ****************************************************************
	 * 			Métodos 
	 *****************************************************************/
    /**
     * Constructor por defecto
     */
	
}
