package uniandes.isis2304.bancAndes.negocio;

import java.sql.Timestamp;

public interface VOOperacionBancaria {
	
	
	public long getNumero_operacion();

	public long getValor();

	public Timestamp getHora();

	public Timestamp getFecha();

	public long getCuenta();

	public long getPuesto_atencion();
	
	public long getPrestamo();

	@Override
	public String toString();
	
	
}
