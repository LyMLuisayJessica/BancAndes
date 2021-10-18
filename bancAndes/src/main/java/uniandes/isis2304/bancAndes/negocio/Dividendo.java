/**~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 * Universidad	de	los	Andes	(Bogotá	- Colombia)
 * Departamento	de	Ingeniería	de	Sistemas	y	Computación
 * Licenciado	bajo	el	esquema	Academic Free License versión 2.1
 * 		
 * Curso: isis2304 - Sistemas Transaccionales
 * Proyecto: Parranderos Uniandes
 * @version 1.0
 * @author Germán Bravo
 * Julio de 2018
 * 
 * Revisado por: Claudia Jiménez, Christian Ariza
 * ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 */

package uniandes.isis2304.bancAndes.negocio;


public class Dividendo implements VODividendo
{
	/* ****************************************************************
	 * 			Atributos
	 *****************************************************************/
	/**
	 * El identificador del bebedor que realiza la visita
	 */
	private long id;
	
	/**
	 * El identificador del bar visitado
	 */
	private long cliente;
	
	/**
	 * La fecha de la visita
	 */
	private long accion;
	
	/**
	 * Constructor por defecto
	 */
	public Dividendo(long id, long cliente, long accion) 
	{
		this.id = id;
		this.cliente = cliente;
		this.accion = accion;
	}
	/**
	 * Constructor con valores
	 * @param idBebedor - El identificador del b ebedor. Debe existir un bebedor con dicho identificador
	 * @param idBar - El identificador del bar. Debe exixtir un bar con dicho identificador
	 * @param fechaVisita - La fecha en la cual se realiza la visita
	 * @param horario - El horario en el que el bebedor vista el bar (DIURNO, NOCTURNO, TODOS)
	 */
	
	public Dividendo() 
	{
		this.id = 0;
		this.cliente = 0;
		this.accion = 0;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public long getCliente() {
		return cliente;
	}

	public void setCliente(long cliente) {
		this.cliente = cliente;
	}

	public long getAccion() {
		return accion;
	}

	public void setAccion(long accion) {
		this.accion = accion;
	}

	@Override
	public String toString() {
		return "Dividendo [id=" + id + ", cliente=" + cliente + ", accion=" + accion + "]";
	}

	
}
