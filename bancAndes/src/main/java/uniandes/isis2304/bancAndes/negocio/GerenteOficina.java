package uniandes.isis2304.bancAndes.negocio;

public class GerenteOficina implements VOGerenteOficina {
	/* ****************************************************************
	 * 			Atributos
	 *****************************************************************/
	/**
	 * El identificador ÚNICO de los bares
	 */
	private String login;

	private String oficina;
	
	private String bancAndes;

	public GerenteOficina() {
		
		this.login = "";
		this.oficina = "";
		this.bancAndes = "";
	}
	
	public GerenteOficina(String login, String oficina, String bancAndes) {
		
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
		return "GerenteOficina [login=" + login + ", oficina=" + oficina + ", bancAndes=" + bancAndes + "]";
	}
	
}
