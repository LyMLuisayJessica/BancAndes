package uniandes.isis2304.bancAndes.negocio;

import java.sql.Timestamp;

public interface VOPrestamo {



	public long getId();

	public long getInteres();

	public long getNum_cuotas();

	public Timestamp getDia_a_pagar_cuota();

	public long getValor_cuota();

	public long getSaldo_pendiente();

	@Override
	public String toString();

	
	
}
