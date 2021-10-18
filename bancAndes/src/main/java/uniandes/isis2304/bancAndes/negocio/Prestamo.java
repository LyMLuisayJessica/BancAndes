package uniandes.isis2304.bancAndes.negocio;

import java.sql.Timestamp;

public class Prestamo implements VOPrestamo{
	private long id;

	private long interes;
	
	private long num_cuotas;
	
	private Timestamp dia_a_pagar_cuota;
	
	private long valor_cuota;
	
	private long saldo_pendiente;

	public Prestamo() {

		this.id = 0;
		this.interes = 0;
		this.num_cuotas = 0;
		this.dia_a_pagar_cuota = new Timestamp(0);
		this.valor_cuota = 0;
		this.saldo_pendiente = 0;
	}
	
	public Prestamo(long id, long interes, long num_cuotas, Timestamp dia_a_pagar_cuota, long valor_cuota,
			long saldo_pendiente) {
		this.id = id;
		this.interes = interes;
		this.num_cuotas = num_cuotas;
		this.dia_a_pagar_cuota = dia_a_pagar_cuota;
		this.valor_cuota = valor_cuota;
		this.saldo_pendiente = saldo_pendiente;
	}



	public long getId() {
		return id;
	}



	public void setId(long id) {
		this.id = id;
	}



	public long getInteres() {
		return interes;
	}



	public void setInteres(long interes) {
		this.interes = interes;
	}



	public long getNum_cuotas() {
		return num_cuotas;
	}



	public void setNum_cuotas(long num_cuotas) {
		this.num_cuotas = num_cuotas;
	}



	public Timestamp getDia_a_pagar_cuota() {
		return dia_a_pagar_cuota;
	}



	public void setDia_a_pagar_cuota(Timestamp dia_a_pagar_cuota) {
		this.dia_a_pagar_cuota = dia_a_pagar_cuota;
	}



	public long getValor_cuota() {
		return valor_cuota;
	}



	public void setValor_cuota(long valor_cuota) {
		this.valor_cuota = valor_cuota;
	}



	public long getSaldo_pendiente() {
		return saldo_pendiente;
	}



	public void setSaldo_pendiente(long saldo_pendiente) {
		this.saldo_pendiente = saldo_pendiente;
	}



	@Override
	public String toString() {
		return "Prestamo [id=" + id + ", interes=" + interes + ", num_cuotas=" + num_cuotas
				+ ", dia_a_pagar_cuota=" + dia_a_pagar_cuota + ", valor_cuota=" + valor_cuota + ", saldo_pendiente="
				+ saldo_pendiente + "]";
	}

	
	
}
