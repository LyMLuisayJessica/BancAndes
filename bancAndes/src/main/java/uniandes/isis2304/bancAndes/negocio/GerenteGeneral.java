package uniandes.isis2304.bancAndes.negocio;

public class GerenteGeneral implements VOGerenteGeneral{
	/* ****************************************************************
	 * 			Atributos
	 *****************************************************************/
	/**
	 * El identificador ÚNICO de los bares
	 */
	private String login;

	private String oficina;
	
	private String bancAndes;

	public GerenteGeneral() {
		
		this.login = "";
		this.oficina = "";
		this.bancAndes = "";
	}
	
	public GerenteGeneral(String login, String oficina, String bancAndes) {
		
		this.login = login;
		this.oficina = oficina;
		this.bancAndes = bancAndes;
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

	public String getBancAndes() {
		return bancAndes;
	}

	public void setBancAndes(String bancAndes) {
		this.bancAndes = bancAndes;
	}

	@Override
	public String toString() {
		return "GerenteGeneral [login=" + login + ", oficina=" + oficina + ", bancAndes=" + bancAndes + "]";
	}
	
}
