package uniandes.isis2304.bancAndes.negocio;

import java.sql.Timestamp;

public class OperacionBancaria implements VOOperacionBancaria{
	/* ****************************************************************
	 * 			Atributos
	 *****************************************************************/
	/**
	 * El identificador del bebedor que realiza la visita
	 */
	private long numero_operacion;
	
	/**
	 * El identificador del bar visitado
	 */
	private long valor;
	
	/**
	 * La fecha de la visita
	 */
	private Timestamp hora;
	
	private Timestamp fecha;
	
	private long cuenta;
	
	private long puesto_atencion;
	
	private long prestamo;

	public OperacionBancaria(long numero_operacion, long valor, Timestamp hora, Timestamp fecha, long cuenta,
			long puesto_atencion,long prestamo) {
		this.numero_operacion = numero_operacion;
		this.valor = valor;
		this.hora = hora;
		this.fecha = fecha;
		this.cuenta = cuenta;
		this.puesto_atencion = puesto_atencion;
		this.prestamo= prestamo;
	}
	
	/**
	 * Constructor por defecto
	 */
	
	public OperacionBancaria() {
		this.numero_operacion = 0;
		this.valor = 0;
		this.hora = new Timestamp(0);
		this.fecha = new Timestamp(0);
		this.cuenta = 0;
		this.puesto_atencion = 0;
	}

	public long getNumero_operacion() {
		return numero_operacion;
	}

	public void setNumero_operacion(long numero_operacion) {
		this.numero_operacion = numero_operacion;
	}

	public long getValor() {
		return valor;
	}

	public void setValor(long valor) {
		this.valor = valor;
	}

	public Timestamp getHora() {
		return hora;
	}

	public void setHora(Timestamp hora) {
		this.hora = hora;
	}

	public Timestamp getFecha() {
		return fecha;
	}

	public void setFecha(Timestamp fecha) {
		this.fecha = fecha;
	}

	public long getCuenta() {
		return cuenta;
	}

	public void setCuenta(long cuenta) {
		this.cuenta = cuenta;
	}

	public long getPuesto_atencion() {
		return puesto_atencion;
	}

	public void setPuesto_atencion(long puesto_atencion) {
		this.puesto_atencion = puesto_atencion;
	}
	public long getPrestamo() {
		return puesto_atencion;
	}

	public void setPrestamo(long prestamo) {
		this.prestamo = prestamo;
	}
	@Override
	public String toString() {
		return "OperacionBancaria [numero operacion=" + numero_operacion + ", valor=" + valor + ", hora=" + hora + ", fecha="
				+ fecha + ", cuenta=" + cuenta + ", puestoatencion=" + puesto_atencion +", prestamo=" + prestamo + "]"; }

	
	
	
}
