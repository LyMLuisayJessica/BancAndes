package uniandes.isis2304.bancAndes.negocio;

import java.sql.Timestamp;

public interface VOCuenta {
	public long getId();

	public String getTipo();

	public String getEstado();

	public long getSaldo();

	public Timestamp getFecha_de_creacion();

	public String getOficina();

	public String getGerente_oficina();

	public String getCajero_funcionario();

	public String getCliente();

	public String getBancAndes();
	
	public long getPrestamo();

	@Override
	public String toString();
	
}
