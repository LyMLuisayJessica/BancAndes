package uniandes.isis2304.bancAndes.negocio;

import java.sql.Timestamp;

public class Cuenta implements VOCuenta{
	
	private long id;
	
	private String tipo;
	
	private String estado;
	
	private long saldo;
	
	private Timestamp fecha_de_creacion;
	
	private String oficina;
	
	private String gerente_oficina;
	
	private String cajero_funcionario;
	
	private String cliente;
	
	private String bancAndes;
	
	private long prestamo;

	public Cuenta() {
		
		this.id = 0;
		this.tipo = "";
		this.estado = "";
		this.saldo = 0;
		this.fecha_de_creacion = new Timestamp(0);
		this.oficina = "";
		this.gerente_oficina = "";
		this.cajero_funcionario = "";
		this.cliente = "";
		this.bancAndes = "";
		this.prestamo = 0;
	}
	
	public Cuenta(long id, String tipo, String estado, long saldo, Timestamp fecha_de_creacion, String oficina,
			String gerente_oficina, String cajero_funcionario, String cliente, String bancAndes, long prestamo) {
		
		this.id = id;
		this.tipo = tipo;
		this.estado = estado;
		this.saldo = saldo;
		this.fecha_de_creacion = fecha_de_creacion;
		this.oficina = oficina;
		this.gerente_oficina = gerente_oficina;
		this.cajero_funcionario = cajero_funcionario;
		this.cliente = cliente;
		this.bancAndes = bancAndes;
		this.prestamo = prestamo;
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

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public long getSaldo() {
		return saldo;
	}

	public void setSaldo(long saldo) {
		this.saldo = saldo;
	}

	public Timestamp getFecha_de_creacion() {
		return fecha_de_creacion;
	}

	public void setFecha_de_creacion(Timestamp fecha_de_creacion) {
		this.fecha_de_creacion = fecha_de_creacion;
	}

	public String getOficina() {
		return oficina;
	}

	public void setOficina(String oficina) {
		this.oficina = oficina;
	}

	public String getGerente_oficina() {
		return gerente_oficina;
	}

	public void setGerente_oficina(String gerente_oficina) {
		this.gerente_oficina = gerente_oficina;
	}

	public String getCajero_funcionario() {
		return cajero_funcionario;
	}

	public void setCajero_funcionario(String cajero_funcionario) {
		this.cajero_funcionario = cajero_funcionario;
	}

	public String getCliente() {
		return cliente;
	}

	public void setCliente(String cliente) {
		this.cliente = cliente;
	}

	public String getBancAndes() {
		return bancAndes;
	}

	public void setBancAndes(String bancAndes) {
		this.bancAndes = bancAndes;
	}
	
	public long getPrestamo() {
		return prestamo;
	}

	public void setPrestamo(long prestamo) {
		this.prestamo = prestamo;
	}

	@Override
	public String toString() {
		return "Cuenta [id=" + id + ", tipo=" + tipo + ", estado=" + estado + ", saldo=" + saldo
				+ ", fecha_de_creacion=" + fecha_de_creacion + ", oficina=" + oficina + ", gerente_oficina="
				+ gerente_oficina + ", cajero_funcionario=" + cajero_funcionario + ", cliente=" + cliente
				+ ", bancAndes=" + bancAndes + ", prestamo=" + prestamo + "]";
	}
	
	
}
